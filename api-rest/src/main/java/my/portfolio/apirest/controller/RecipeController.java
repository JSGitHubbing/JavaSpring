package my.portfolio.apirest.controller;

import my.portfolio.apirest.model.Recipe;
import my.portfolio.apirest.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/recipes")
    List<Recipe> findAll() {
        return recipeService.findAll();
    }

}
