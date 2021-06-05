package my.portfolio.apirest.service;

import my.portfolio.apirest.model.Recipe;
import my.portfolio.apirest.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("recipeService")
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    RecipeRepository recipeRepository;

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe findById(int id) {
        return null;
    }

    @Override
    public Recipe update(Recipe updatedRecipe) {
        return null;
    }

    @Override
    public Recipe delete(int id) {
        return null;
    }
}
