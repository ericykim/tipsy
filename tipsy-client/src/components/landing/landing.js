import React from "react";
import { H1 } from "../../styles/typeStyles";
import Nav from "../nav/nav";
import Recipe from "../recipe/recipe";
import { SearchContainer } from "./styled";
import {Link} from "react-router-dom"



const Landing = () => {
  return (
    <div className="container">
        <Nav />
        <H1 className="mb-4">Tipsy</H1>
        <SearchContainer>
            <input
            className="form-control col-6  mr-3"
            id="search"
            placeholder="Find a drink..."
            type="text"
          />  
          <button className="btn btn-success col-2">Search</button> 
        </SearchContainer>
        <div>
            <Link to="/recipe">Here is the recipe template</Link>
        </div>
    </div>
  );
};

export default Landing;
