import React from "react";
import { H1, H2, H3, Label, SmallText } from "../../styles/typeStyles";
import { Link } from "react-router-dom";
import Nav from "../nav/nav";

const Recipe = () => {
    const ingredients = [
        "salt",
        "tequilla",
        "ice",
        "lime",
        "simple syrup"
    ]

    const steps = [
        "gather",
        "mix",
        "shake",
        "pour",
        "drink :)"
    ]

  return (
    <div className="container">
        <Nav />

      <H1 className="mb-4">This is a recipe template</H1>
      <H2>Created by mr. bartender</H2>
      <div mb-4>
      <H3>Ingredients</H3>
      <ul>
          {ingredients.map((ingredient, i) => {
              return <li key={i}>{ingredient}</li>
          })}
      </ul>
      </div>

      <H3>Instructions</H3>
      <ol>
          {steps.map((step, i) => {
              return <li key={i}>{step}</li>
          })}
      </ol>
    </div>
  );
};

export default Recipe;
