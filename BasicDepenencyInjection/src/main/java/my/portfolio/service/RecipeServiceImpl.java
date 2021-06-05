package my.portfolio.service;

import my.portfolio.model.Recipe;
import my.portfolio.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("recipeService")
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository repository;

    public RecipeServiceImpl() {
        System.out.println("RecipeServiceImpl no args constructor called");
    }

    /**
     * Retrieves all the {@link  my.portfolio.model.Recipe} found in the {@link my.portfolio.repository.RecipeRepository}
     * @return List of all the Recipes
     */
    @Override
    public List<Recipe> findAll() {
        return repository.findAll();
    }
}
