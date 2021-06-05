package my.portfolio.apirestwithdb.service;

import my.portfolio.apirestwithdb.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
    Recipe findById(int id);
    Recipe update(Recipe updatedRecipe);
    Recipe delete(int id);
}
