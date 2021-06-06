package my.portfolio.apirestwithdb.controllers;

import my.portfolio.apirestwithdb.model.Recipe;
import my.portfolio.apirestwithdb.util.RecipeDTO;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationTests {

    @Autowired
    RecipeController recipeController;

    @Test
    public void testCreateReadDelete() {
        Recipe recipe = RecipeDTO.getRecipe();
        Recipe recipeResult = recipeController.create(recipe);

        Iterable<Recipe> recipes = recipeController.read();
        Assertions.assertThat(recipes).first().hasFieldOrPropertyWithValue("name", recipe.getName());

        recipeController.delete(recipeResult.getId());
        Assertions.assertThat(recipeController.read()).isEmpty();
    }
}
