import React, { Component } from 'react';
import {Form} from 'react-bootstrap';
import  './vehicleDetails.css';
import img from "./images/car.png";
import {Link} from "react-router-dom";
export default class extends Component {
    constructor() {
    super();
    this.state = {
      fields: {
        vehicleCompany:"",
        vehicleModel:"",
        vehicleType:"",
        vehicleNo:"",
        employeeId:"",
        identification:""
      },
      errors: {}
    }

    this.handleChange = this.handleChange.bind(this);
    this.submitVehicleRegistrationForm = this.submitVehicleRegistrationForm.bind(this);

  };

  handleChange(e) {
    let fields = this.state.fields;
    fields[e.target.name] = e.target.value;
    this.setState({
    fields
    });

  }

  submitVehicleRegistrationForm(e) {
    e.preventDefault();
    console.log(this.validateForm())
    if (this.validateForm()) {
        let fields = {};
        fields["vehicleCompany"] = "";
        fields["vehicleModel"] = "";
        fields["vehicleType"] = "";
        fields["vehicleNo"] = "";
        fields["employeeId"] = "";
        fields["identification"]="";
        this.setState({fields:fields});
        alert("Form submitted");
        this.props.history.push("/feedback");
    }

  }

  validateForm=()=> {

    let fields = this.state.fields;
    let errors = {};
    let formIsValid = true;

    if (!fields["vehicleCompany"]) {
      formIsValid = false;
      errors["vehicleCompany"] = "*Please enter your username.";
    }

    if (typeof fields["vehicleCompany"] !== "undefined") {
      if (!fields["vehicleCompany"].match(/^[a-zA-Z ]*$/)) {
        formIsValid = false;
        errors["vehicleCompany"] = "*Please enter alphabet characters only.";
      }
    }

    if (!fields["vehicleModel"]) {
      formIsValid = false;
      errors["vehicleModel"] = "*Please enter your vehicle model.";
    }

    if (!fields["vehicleType"]) {
      formIsValid = false;
      errors["vehicleType"] = "*Please enter your vehicle type.";
    }

    if (typeof fields["vehicleType"] !== "undefined") {
      if (!fields["vehicleType"].match(/^[a-zA-Z ]*$/)) {
        formIsValid = false;
        errors["vehicleType"] = "*Please enter valid vehicle type.";
      }
    }

    if (!fields["vehicleNo"]) {
      formIsValid = false;
      errors["vehicleNo"] = "*Please enter your vehicle.";
    }

    if (typeof fields["vehicleNo"] !== "undefined") {
      if (!fields["vehicleNo"].match(/^[0-9]/)){

       formIsValid = false;
        errors["vehicleNo"] = "*Please enter vehicle no.";
      }
    }
    if (!fields["employeeId"]) {
      formIsValid = false;
      errors["employeeId"] = "*Please enter your vehicle type.";
    }

    if (typeof fields["employeeId"] !== "undefined") {
      if (!fields["employeeId"].match(/^[0-9]/)) {
        formIsValid = false;
        errors["employeeId"] = "*Please enter valid employee id.";
      }
    }
    if (!fields["identification"]) {
      formIsValid = false;
      errors["identification"] = "*Please enter your identification .";
    }

    
    this.setState({
      errors: errors
    });
    return formIsValid;
  }
  render() {
    return(
      <React.Fragment>
      <div>
      <img src={img} alt="not found" id="image"/>
      </div>
      <div className="vehicle">
      <Form method="post"  name="userRegistrationForm" >
      <h3>Vehicle Details</h3>
      <table className="table" align="right">
      <tbody>
        <tr>
        <td>Vehicle Company:</td>
        <td>
        <input 
         name="vehicleCompany"
         type="text"
         value={this.state.fields.vehicleCompany} 
         onChange={this.handleChange}  
         />
         </td>
         <td><div className="errorMsg">{this.state.errors.vehicleCompany}</div>
        </td>
         </tr>
         <tr>
         <td>Vehicle Model:</td>
         <td>
         <input
         name="vehicleModel" 
         type="text"
         value={this.state.fields.vehicleModel} 
         onChange={this.handleChange}  
         />
         </td>
         <td><div className="errorMsg">{this.state.errors.vehicleModel}</div></td>
         </tr>
         <tr>
         <td>Vehicle Type:</td>
         <td>
         <input 
         name="vehicleType"
         type="text"
         value={this.state.fields.vehicleType} 
         onChange={this.handleChange}  
         />
         </td>
         <td><div className="errorMsg">{this.state.errors.vehicleType}</div></td>
         </tr>
         <tr>
         <td>Vehicle No:</td>
         <td>
         <input 
         name="vehicleNo"
         type="text"
         value={this.state.fields.vehicleNo} 
         onChange={this.handleChange}  
         />
         </td>
         <td><div className="errorMsg">{this.state.errors.vehicleNo}</div></td>
         </tr>
         <tr>
         <td>Employee Id:</td>
         <td>
         <input 
         name="employeeId"
         type="text"
         value={this.state.fields.employeeId} 
         onChange={this.handleChange}  
         />
         </td>
         <td><div className="errorMsg">{this.state.errors.employeeId}</div></td>
         </tr>
         <tr>
         <td>Identification:</td>
         <td>
         <input 
         name="identification"
         type="text"
         placeholder="Please Enter Your Vehicle Identification "
         value={this.state.fields.identification} 
         onChange={this.handleChange}  
         /> 
         </td>
         <td><div className="errorMsg">{this.state.errors.identification}</div></td>
         </tr>
         </tbody>
          </table>
          <button
          className="btn btn-danger btn-width-200"
          onClick={this.submitVehicleRegistrationForm}
          >NEXT</button>     
      </Form>
    </div>
  </ React.Fragment>

    );
  }

}