#!/usr/bin/env python3
import json
import sys
import requests


def main():
    # get json values from STDIN
    input_str = sys.stdin.read()
    decoder = json.JSONDecoder()

    json_objects = []
    # decode each json object and add it to the list of json objects
    while len(input_str) > 0:
        item, index = decoder.raw_decode(input_str)
        json_objects.append(item)
        input_str = input_str[index + 1:]

    input_object = json_objects[0]
    drinks = input_object['drinks']
    new_drinks = []

    for drink in drinks:
        new_drink = convert_drink(drink)
        json_value = json.dumps(new_drink)

        url = "http://localhost:5000/api/v1/users/133/createdDrinks"
        headers = {'Content-type': 'application/json', 'Accept': '*/*'}
        r = requests.post(url, data=json_value, headers=headers)




def convert_drink(drink):
    name = drink['strDrink']
    image_url = drink['strDrinkThumb']
    steps = get_steps(drink)
    ingredients = get_ingredients(drink)

    my_drink = {'drinkName': name, 'steps': steps, 'ingredients': ingredients,
                'imageUrl': image_url, 'creatorId': 133, 'creatorUsername': 'Tipsy'}
    return my_drink


def get_ingredients(drink):
    ingredients = []
    if drink['strIngredient1'] is not None:
        ingredient = {'name': drink['strIngredient1'], 'amount': drink['strMeasure1'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient2'] is not None:
        ingredient = {'name': drink['strIngredient2'], 'amount': drink['strMeasure2'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient3'] is not None:
        ingredient = {'name': drink['strIngredient3'], 'amount': drink['strMeasure3'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient4'] is not None:
        ingredient = {'name': drink['strIngredient4'], 'amount': drink['strMeasure4'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient5'] is not None:
        ingredient = {'name': drink['strIngredient5'], 'amount': drink['strMeasure5'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient6'] is not None:
        ingredient = {'name': drink['strIngredient6'], 'amount': drink['strMeasure6'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient7'] is not None:
        ingredient = {'name': drink['strIngredient7'], 'amount': drink['strMeasure7'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient8'] is not None:
        ingredient = {'name': drink['strIngredient8'], 'amount': drink['strMeasure8'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient9'] is not None:
        ingredient = {'name': drink['strIngredient9'], 'amount': drink['strMeasure9'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient10'] is not None:
        ingredient = {'name': drink['strIngredient10'], 'amount': drink['strMeasure10'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient11'] is not None:
        ingredient = {'name': drink['strIngredient11'], 'amount': drink['strMeasure11'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient12'] is not None:
        ingredient = {'name': drink['strIngredient12'], 'amount': drink['strMeasure12'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient13'] is not None:
        ingredient = {'name': drink['strIngredient13'], 'amount': drink['strMeasure13'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient14'] is not None:
        ingredient = {'name': drink['strIngredient14'], 'amount': drink['strMeasure14'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)
    if drink['strIngredient15'] is not None:
        ingredient = {'name': drink['strIngredient15'], 'amount': drink['strMeasure15'],
                      'ingredientOrder': len(ingredients)}
        ingredients.append(ingredient)

    return ingredients


def get_steps(drink):
    steps = []
    instructions_str = drink['strInstructions']
    instruction_strs = instructions_str.split('.')
    for instruction in instruction_strs:
        if len(instruction) > 0:
            step = {'instructions': instruction, 'stepOrder': len(steps)}
            steps.append(step)
    return steps


if __name__ == "__main__":
    main()
