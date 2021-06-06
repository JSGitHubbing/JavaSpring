package my.portfolio.apirestwithdb.services;

import my.portfolio.apirestwithdb.model.Recipe;
import my.portfolio.apirestwithdb.service.RecipeService;
import my.portfolio.apirestwithdb.util.RecipeDTO;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@RunWith(SpringRunner.class)
public class ServiceTests {

    @Autowired
    RecipeService recipeService;

    @Test
    public void testCreateReadDelete() {
        Recipe recipe = RecipeDTO.getRecipe();

        recipeService.save(recipe);

        Iterable<Recipe> recipes = recipeService.findAll();
        Assertions.assertThat(recipes).extracting(Recipe::getName).containsOnly(recipe.getName());

        recipeService.deleteAll();
        Assertions.assertThat(recipeService.findAll()).isEmpty();
    }

}
