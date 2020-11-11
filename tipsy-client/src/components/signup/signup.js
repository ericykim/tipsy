import React from "react";
import { H1, Label, SmallText } from "../../styles/typeStyles";
import { Link } from "react-router-dom";

const Signup = () => {
  return (
    <div className="container">
      <H1 className="mb-4">Signup for tipsy</H1>
      <label for="username">
        <Label className="mb-0">username</Label>
      </label>
      <input
        className="form-control col-4 mb-3"
        id="username"
        placeholder="Username"
        type="text"
      />
      <label for="userSelect">
        <Label className="mb-0">who you are</Label>
      </label>
      <select className="form-control col-4 mb-3">
        <option value="BARTENDER" defaultValue>
          Bartender
        </option>
        <option value="DRINKER">Drinker</option>
      </select>
      <label for="password">
        <Label className="mb-0">password</Label>
      </label>
      <input
        className="form-control col-4 mb-3"
        id="password"
        placeholder="Password"
        type="text"
      />
      <button className="btn btn-success">Login</button>
      <SmallText>
        If you already a member, login <Link to="/login">Here</Link>
      </SmallText>
      <SmallText><Link to="/">Back to home</Link></SmallText>

    </div>
  );
};

export default Signup;
