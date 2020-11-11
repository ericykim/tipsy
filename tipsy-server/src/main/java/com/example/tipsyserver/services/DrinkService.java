package com.example.tipsyserver.services;

import com.example.tipsyserver.models.Drink;
import com.example.tipsyserver.repositories.DrinkRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;

@Service
public class DrinkService {

    @Autowired
    DrinkRepository drinkRepository;

    // public Drink searchForDrink(String drinkName) throws IOException, InterruptedException, JSONException {
    //     HttpClient client = null;
    //     String uri = String.format("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=%s", drinkName);

    //     try {
    //         client = HttpClient.newHttpClient();
    //         var request = HttpRequest.newBuilder()
    //                 .GET()
    //                 .uri(URI.create(uri))
    //                 .setHeader("content-type", "application/json")
    //                 .build();

    //         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    //         var jsonObject = new JSONObject(response.body());
    //         var drink = new Drink();
    //         drink.setDrinkName("marg");
    //         return drink;
    //     } catch (Exception ex) {
    //         throw ex;
    //     }

    // }

    public Drink createDrink(Drink drink){
        return drinkRepository.save(drink);
    }

    public Drink getDrinkById(int drinkId){
        return drinkRepository.findById(drinkId).get();
    }

    public void deleteDrink(int drinkId){
        drinkRepository.deleteById(drinkId);
    }

    public Drink updateDrink(int drinkId, Drink drink){
        drink.setDrinkId(drinkId);
        return drinkRepository.save(drink);
    }
}
