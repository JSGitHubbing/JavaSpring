package my.portfolio.repository;

import my.portfolio.model.Recipe;

import java.util.List;

public interface RecipeRepository {
    List<Recipe> findAll();
}
