package my.portfolio.apirestwithdb.controller;

import my.portfolio.apirestwithdb.model.Recipe;
import my.portfolio.apirestwithdb.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @PostMapping("/recipe")
    Recipe create(@RequestBody Recipe recipe) {
        return recipeService.save(recipe);
    }

    @GetMapping("/recipe")
    Iterable<Recipe> read() {
        return recipeService.findAll();
    }

    @PutMapping("/recipe")
    Recipe update(@RequestBody Recipe recipe) {
        return recipeService.save(recipe);
    }

    @DeleteMapping("/recipe/{id}")
    void delete(@PathVariable Integer id) {
        recipeService.deleteById(id);
    }

}
