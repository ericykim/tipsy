package com.example.tipsyserver.models;

import javax.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer ingredientId;
    private String name;
    private String amount;
    private int ingredientOrder;

    public int getIngredientOrder() {
        return ingredientOrder;
    }

    public void setIngredientOrder(int ingredientOrder) {
        this.ingredientOrder = ingredientOrder;
    }

    public Integer getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Integer ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
