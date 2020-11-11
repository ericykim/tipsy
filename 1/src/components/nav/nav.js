import React from "react";
import {Link} from "react-router-dom"
import Login from "../login/login";


const Nav = () => {
  return (
    <div>
        <div>
        <Link to="/">Home</Link>
            <Link to="/login">Log in</Link>
            <Link to="/signup">Sign up</Link>

        </div>
    </div>
  );
};

export default Nav;
