package com.example.tipsyserver.controllers;


import com.example.tipsyserver.services.DrinkService;
import com.example.tipsyserver.models.Drink;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin("*")
public class DrinkController {
    @Autowired
    private DrinkService drinkService;

    @GetMapping("/api/v1/drinks/search")
    public Drink searchForDrink(@RequestParam String drinkName) throws IOException, InterruptedException, JSONException {
        return drinkService.searchForDrink(drinkName);
    }

    @GetMapping("/api/v1/drinks/{drinkId}")
    public Drink getDrinkById(@PathVariable ("drinkId") int drinkId){
        return drinkService.getDrinkById(drinkId);
    }

    @PostMapping("/api/v1/drinks")
    public Drink createDrink(@RequestBody Drink drink){
        return drinkService.createDrink(drink);
    }

    @DeleteMapping("/api/v1/drinks/{drinkId}")
    public void deleteDrink(@PathVariable("drinkId") int drinkId){
        drinkService.deleteDrink(drinkId);
    }

    @PutMapping("/api/v1/drinks/{drinkId}")
    public Drink updateDrink(@PathVariable("drinkId") int drinkId, @RequestBody Drink drink){
        return drinkService.updateDrink(drinkId, drink);
    }
}
