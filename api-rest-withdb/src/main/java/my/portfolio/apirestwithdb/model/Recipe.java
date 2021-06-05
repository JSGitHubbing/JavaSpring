package my.portfolio.apirestwithdb.model;

import java.util.List;

public class Recipe {
    int id;
    String name;
    List<Ingredient> ingredients;
    List<PreparationStep> steps;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<PreparationStep> getSteps() {
        return steps;
    }

    public void setSteps(List<PreparationStep> steps) {
        this.steps = steps;
    }
}
