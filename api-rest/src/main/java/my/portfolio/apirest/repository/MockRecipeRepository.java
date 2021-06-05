package my.portfolio.apirest.repository;

import my.portfolio.apirest.model.Ingredient;
import my.portfolio.apirest.model.PreparationStep;
import my.portfolio.apirest.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("recipeRepository")
public class MockRecipeRepository implements RecipeRepository{

    List<Recipe> recipesInDatabase;

    public MockRecipeRepository() {

        PreparationStep step1 = new PreparationStep();
        step1.setTitle("Desempaquetar");
        step1.setDescription("Asegúrese de desenvolver el bocadillo");

        PreparationStep step2 = new PreparationStep();
        step2.setTitle("Comer");
        step2.setDescription("Devora el bocata que te han preparado esta mañana");

        List<PreparationStep> steps = new ArrayList<>();
        steps.add(step1);
        steps.add(step2);

        Ingredient ingredient1 = new Ingredient();
        ingredient1.setName("Bocata de la máma");
        ingredient1.setQuantity(1);
        ingredient1.setMagnitude("Unidad");

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient1);

        Recipe recipe = new Recipe();
        recipe.setId(0);
        recipe.setName("Bocata del almuerzo");
        recipe.setIngredients(ingredients);
        recipe.setSteps(steps);

        recipesInDatabase = new ArrayList<>();
        recipesInDatabase.add(recipe);
    }

    @Override
    public List<Recipe> findAll() {
        return recipesInDatabase;
    }
}
