import React from "react";
import { H1, Label, SmallText } from "../../styles/typeStyles";
import { Link } from "react-router-dom";

const Login = () => {
  return (
    <div className="container">
      <H1 className="mb-4">LOGIN TO TIPSY</H1>
      <label for="username">
        <Label className="mb-0">username</Label>
      </label>
      <input
        className="form-control col-4 mb-3"
        id="username"
        placeholder="Username"
        type="text"
      />
      <label for="password">
        <Label className="mb-0">password</Label>
      </label>
      <input
        className="form-control col-4 mb-3"
        id="username"
        placeholder="Password"
        type="text"
      />
      <button className="btn btn-success">Login</button>
      <SmallText>If you are not a member, sign up <Link to="/signup">Here</Link></SmallText>
      <SmallText><Link to="/">Back to home</Link></SmallText>

    </div>
  );
};

export default Login;
