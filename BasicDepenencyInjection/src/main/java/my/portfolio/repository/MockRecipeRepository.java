package my.portfolio.repository;

import my.portfolio.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("recipeRepository")
public class MockRecipeRepository implements RecipeRepository {

    private List<Recipe> recipesInDataBase;

    public MockRecipeRepository() {
        recipesInDataBase = new ArrayList<>();

        Recipe curry = new Recipe();
        curry.id = UUID.randomUUID();
        curry.name = "Rice with Curry";
        curry.description = "The content is curry, chicken and white rice";
        recipesInDataBase.add(curry);

        Recipe paella = new Recipe();
        paella.id = UUID.randomUUID();
        paella.name = "Paella";
        paella.description = "Sometimes can be confused with arroz con cosas";
        recipesInDataBase.add(paella);

    }

    /**
     * Fakes the connection with a Data Base
     * @return List with all the recipes in the fake Data Base
     */
    @Override
    public List<Recipe> findAll() {
        return recipesInDataBase;
    }
}
