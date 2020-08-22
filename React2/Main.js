import React, { Component } from 'react';
import {Nav,Navbar} from 'react-bootstrap';
import { NavLink } from 'react-router-dom';
import  './Mainstyle.css';
function Main() {
return( 
        <div className="Mainstyle">
   
    <ul>
        <li>SwapWindow-Parking</li>
        <li><NavLink to="/home">Home</NavLink></li>
        <li><NavLink to="/add-employee">Add-Employee</NavLink></li>
        <li><NavLink to="/vehicleDetails">Add-Vehicle</NavLink></li>
        <li><NavLink to="/feedback">Feedback</NavLink></li>
        <li><NavLink to="/price">Pricing</NavLink></li>
      </ul>
      </div>
    );
}
    export default Main;