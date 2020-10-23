package com.example.tipsyserver;


import org.json.JSONException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("*")
public class DrinksController {
    private DrinksService drinkService = new DrinksService();

    @GetMapping("api/v1/drinks/search")
    public Drink searchForDrink(@RequestParam String drinkName) throws IOException, InterruptedException, JSONException {
        System.out.println("hit");
        return drinkService.searchForDrink(drinkName);
    }
}
