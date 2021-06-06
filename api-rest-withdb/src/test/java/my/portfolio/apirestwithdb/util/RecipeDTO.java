package my.portfolio.apirestwithdb.util;

import my.portfolio.apirestwithdb.model.Ingredient;
import my.portfolio.apirestwithdb.model.PreparationStep;
import my.portfolio.apirestwithdb.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeDTO {
    private static Recipe recipe;

    static void buildRecipe() {
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

        recipe = new Recipe();
        recipe.setId(0);
        recipe.setName("Bocata del almuerzo");
        recipe.setIngredients(ingredients);
        recipe.setSteps(steps);
    }

    public static Recipe getRecipe() {
        if(recipe == null)
            buildRecipe();
        return recipe;
    }
}
