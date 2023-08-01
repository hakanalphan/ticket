
import React from 'react';
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";

import Home from "./pages/Home/home";
import FlightList from "./pages/Home/FlightList";
import RegisterForm from "./components/RegisterForm";
import LoginForm from "./components/LoginForm";
function App() {
  return (
    <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/search" element={<FlightList/>}/>
          <Route path="/Register" element={<RegisterForm/>}/>
          <Route path="/Login" element={<LoginForm/>}/>
        </Routes>
    </BrowserRouter>
  );
}

export default App;