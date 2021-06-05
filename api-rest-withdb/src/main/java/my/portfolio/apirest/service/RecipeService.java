package my.portfolio.apirest.service;

import my.portfolio.apirest.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
    Recipe findById(int id);
    Recipe update(Recipe updatedRecipe);
    Recipe delete(int id);
}
