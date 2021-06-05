package my.portfolio.apirestwithdb.service;

import my.portfolio.apirestwithdb.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeService extends CrudRepository<Recipe, Integer> {

    Iterable<Recipe> findByName(String name);

}
