package com.example.tipsyserver;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DrinksService {
    public Drink searchForDrink(String drinkName) throws IOException, InterruptedException, JSONException {
        HttpClient client = null;
        String uri = String.format("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=%s", drinkName);

        try {
            client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(uri))
                    .setHeader("content-type", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            var jsonObject = new JSONObject(response.body());
            var drink = new Drink();
            drink.setDrinkName("marg");
            return drink;
        } catch (Exception ex) {
            throw ex;
        }

    }
}
