package my.portfolio.apirest.repository;

import my.portfolio.apirest.model.Recipe;

import java.util.List;

public interface RecipeRepository {

    List<Recipe> findAll();

}
