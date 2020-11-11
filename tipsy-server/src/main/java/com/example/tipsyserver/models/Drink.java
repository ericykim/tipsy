package com.example.tipsyserver.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "drinks")
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer drinkId;
    private String drinkName;
    @OneToMany( targetEntity = Step.class)
    private List<Step> steps;
    @OneToMany(targetEntity = Ingredient.class)
    private List<Ingredient> ingredients;
    private String imageUrl;

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public Integer getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Integer drinkId) {
        this.drinkId = drinkId;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getImageUrls() {
        return imageUrl;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrl = imageUrls;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
}
