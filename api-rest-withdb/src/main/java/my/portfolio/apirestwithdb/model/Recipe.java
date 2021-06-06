package my.portfolio.apirestwithdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @JsonProperty("recipe-name")
    String name;
    @OneToMany(cascade = CascadeType.ALL)
    List<Ingredient> ingredients;
    @OneToMany(cascade = CascadeType.ALL)
    List<PreparationStep> steps;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<PreparationStep> getSteps() {
        return steps;
    }

    public void setSteps(List<PreparationStep> steps) {
        this.steps = steps;
    }
}
