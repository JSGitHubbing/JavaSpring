package my.portfolio.apirestwithdb;

import my.portfolio.apirestwithdb.model.Recipe;
import my.portfolio.apirestwithdb.util.RecipeDTO;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SystemTests {
    @Test
    public void testCreateReadDelete() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/recipe";

        Recipe recipe = RecipeDTO.getRecipe();

        ResponseEntity<Recipe> entity = restTemplate.postForEntity(url, recipe, Recipe.class);

        Recipe[] recipes = restTemplate.getForObject(url, Recipe[].class);
        Assertions.assertThat(recipes).extracting(Recipe::getName).containsOnly(recipe.getName());

        restTemplate.delete(url + "/" + entity.getBody().getId());
        Assertions.assertThat(restTemplate.getForObject(url, Recipe[].class)).isEmpty();
    }
}
