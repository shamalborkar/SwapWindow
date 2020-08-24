import React, { Component } from 'react';
import  './price.css';
import { Link } from 'react-router-dom';
export default class extends Component {
   
      submitVehicleRegistrationForm() {
            alert("Thanks for visiting..!");
      }
      
    render() {
    return(
        <React.Fragment>
        <div className="main">
        <fieldset>
        <legend>Price List</legend>
        <button id="price">
        <span>Cycle</span>
        <br />
        <span>$100/month</span>
        </button>
        <button id="price">
        <span>Bike</span>
        <br />
        <span>$200/month</span>
        </button>
        <button id="price">
        <span>Car</span>
        <br />
        <span>$300/month</span>
        </button>
        </fieldset>
        </div>
        <button
        className="btn btn-danger btn-width-200"
        onClick={this.submitVehicleRegistrationForm}>NEXT</button>  
        </React.Fragment>   
    );
    }

}