import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Home from "../pages/Home";
import Header from "../components/Header";
import Footer from "../components/Footer";
import SignUp from "../pages/SignUp";
import SignIn from "../pages/SignIn";
import ForgotPassword from "../pages/ForgotPassword";
import ErrorPage from "../pages/ErrorPage";
import Artwork from "../pages/Artwork";
import Artists from "../pages/Artists";
import Events from "../pages/Events";
import Exhibition from "../pages/Exhibision";

const Routing = () => {
  return (
    <Router>
      <Header />
      <main>
        <Routes>
          <Route exact path="/" element={<Home />}></Route>
          <Route exact path="/home" element={<Home />}></Route>
          <Route path="/signin" element={<SignIn />}></Route>
          <Route path="/signup" element={<SignUp />}></Route>
          <Route path="/forgotPassword" element={<ForgotPassword />}></Route>
          <Route path="/artwork" element={<Artwork />}></Route>
          <Route path="/artists" element={<Artists />}></Route>
          <Route path="/events" element={<Events />}></Route>
          <Route path="/exhibitions" element={<Exhibition />}></Route>
          <Route path="/*" element={<ErrorPage />}></Route> 
        </Routes>
      </main>
      <Footer />
    </Router>
  );
};

export default Routing;
