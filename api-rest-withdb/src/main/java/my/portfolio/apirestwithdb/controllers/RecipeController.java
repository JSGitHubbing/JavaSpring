package my.portfolio.apirestwithdb.controllers;

import my.portfolio.apirestwithdb.model.Recipe;
import my.portfolio.apirestwithdb.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @PostMapping("/recipe")
    Recipe create(@Valid @RequestBody Recipe recipe) {
        return recipeService.save(recipe);
    }

    @GetMapping("/recipe")
    Iterable<Recipe> read() {
        return recipeService.findAll();
    }

    @PutMapping("/recipe")
    ResponseEntity<Recipe> update(@RequestBody Recipe recipe) {
        if (recipeService.findById(recipe.getId()).isPresent()) {
            return new ResponseEntity(recipeService.save(recipe), HttpStatus.OK);
        } else {
            return new ResponseEntity(recipe, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/recipe/{id}")
    void delete(@PathVariable Integer id) {
        recipeService.deleteById(id);
    }

    @GetMapping("/recipe/{id}")
    Optional<Recipe> findById(@PathVariable Integer id) {
        return recipeService.findById(id);
    }

    @GetMapping("/recipe/search")
    Iterable<Recipe> findByName(@RequestParam("recipeName") String recipeName) {
        return recipeService.findByName(recipeName);
    }

}
