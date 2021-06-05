package my.portfolio.apirestwithdb.repository;

import my.portfolio.apirestwithdb.model.Recipe;

import java.util.List;

public interface RecipeRepository {

    List<Recipe> findAll();

}
