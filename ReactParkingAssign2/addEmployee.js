import React, { Component } from 'react';
import {Form} from 'react-bootstrap';
import  './addEmployeestyle.css';
import img from "./images/emp.jpg";

export default class extends Component {
  constructor() {
    super();
    this.state = {
      fields: {
        fullName : "",
        gender : "",
        email : "",
        password:"",
        confirmPassword:"",
        contactNo :""
      },
      errors: {}
    }

    this.handleChange = this.handleChange.bind(this);
    this.submituserRegistrationForm = this.submituserRegistrationForm.bind(this);

  };

  handleChange(e) {
    let fields = this.state.fields;
    fields[e.target.name] = e.target.value;
    this.setState({
      fields
    });

  }

  submituserRegistrationForm(e) {
    e.preventDefault();
    console.log(this.validateForm())
    if (this.validateForm()) {
        let fields = {};
        fields["fullName"] = "";
        fields["gender"] = "";
        fields["email"] = "";
        fields["password"] = "";
        fields["confirmPassword"]="";
        fields["contactNo"] ="";
        this.setState({fields:fields});
        alert("Form submitted");
        this.props.history.push("/vehicleDetails");
    }

  }

  validateForm=()=> {

    let fields = this.state.fields;
    let errors = {};
    let formIsValid = true;

    if (!fields["fullName"]) {
      formIsValid = false;
      errors["fullName"] = "*Please enter your username.";
    }

    if (typeof fields["fullName"] !== "undefined") {
      if (!fields["fullName"].match(/^[a-zA-Z ]*$/)) {
        formIsValid = false;
        errors["fullName"] = "*Please enter alphabet characters only.";
      }
    }

    if (!fields["email"]) {
      formIsValid = false;
      errors["email"] = "*Please enter your email-ID.";
    }

    if (typeof fields["email"] !== "undefined") {
     var pattern = new RegExp(/^[a-zA-Z0-9]+@(?:[a-zA-Z0-9]+\.)+[A-Za-z]+$/);
   
     if (!pattern.test(fields["email"])) {
        formIsValid = false;
        errors["email"] = "*Please enter valid email-ID.";
      }
    }

    if (!fields["contactNo"]) {
      formIsValid = false;
      errors["contactNo"] = "*Please enter your mobile no.";
    }

    if (typeof fields["contactNo"] !== "undefined") {
      if (!fields["contactNo"].match(/^[0-9]{10}$/)) {
        formIsValid = false;
        errors["contactNo"] = "*Please enter valid mobile no.";
      }
    }

    if (!fields["password"]) {
      formIsValid = false;
      errors["password"] = "*Please enter your password.";
    } 

    if (typeof fields["password"] !== "undefined") {
      if (!fields["password"].match(/^[0-9]/)){

       formIsValid = false;
        errors["password"] = "*Please enter secure and strong password.";
      }
    }

    if (!fields["confirmPassword"]) {
      formIsValid = false;
      errors["confirmPassword"] = "*Please enter confirm password.";
    }

    if (typeof fields["password"] !== "undefined") {
      if (!fields["password"].match(/^[0-9]/)){

       formIsValid = false;
        errors["password"] = "*Please enter same password.";
      }
    }

    if (!fields["gender"]) {
      formIsValid = false;
      errors["gender"] = "*Please enter your gender";
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
      <img src={img} alt="not found" id="images"/>
      </div>
      <div className="addEmployeestyle">
      <Form method="post"  name="userRegistrationForm" >
      <h3>Employee Details</h3>
      <table className="table" align="right">
      <tbody>
      <tr> 
      <td>FullName:</td>
      <td>
      <input 
      name="fullName"
      type="text"
      placeholder="fullName"
      value={this.state.fields.fullName} 
      onChange={this.handleChange}  
      />
      </td>
      <td>
      <div className="errorMsg">{this.state.errors.fullName}</div>
      </td>
      </tr>
      <tr>
      <td>Gender:</td>
      <td>
      Male:
      <input
      name="gender" 
      type="radio"
      placeholder="gender"
      value={this.state.fields.gender} 
      onChange={this.handleChange}  
      />
      </td>
      <td>
      Female:
      <input
      name="gender" 
      type="radio"
      placeholder="gender"
      value={this.state.fields.gender} 
      onChange={this.handleChange}  
      />
      </td>
      <td>
      <div className="errorMsg">{this.state.errors.gender}</div>
      </td>
      </tr>
      <tr>
      <td>Email:</td>
      <td>
      <input 
      name="email"
      type="email"
      placeholder="email"
      value={this.state.fields.email} 
      onChange={this.handleChange}  
      />
      </td>
      <td>
      <div className="errorMsg">{this.state.errors.email}</div>
      </td>
      </tr>
      <tr>
      <td>Password:</td>
      <td>
      <input 
      name="password"
      type="password"
      placeholder="password"
      value={this.state.fields.password} 
      onChange={this.handleChange}  
      />
      </td>
      <td>
      <div className="errorMsg">{this.state.errors.password}</div>
      </td>
      </tr>
      <tr>
      <td>Confirm Pasword:</td>
      <td>
      <input 
      name="confirmPassword"
      type="password"
      placeholder="confirmPassword"
      value={this.state.fields.confirmPassword} 
      onChange={this.handleChange}  
      />
      </td>
      <td>
      <div className="errorMsg">{this.state.errors.confirmPassword}</div>
      </td>
      </tr>
      <tr>
      <td>Contact Number:</td>
      <td>
      <input 
      name="contactNo"
      type="number"
      placeholder="contactNo"
      value={this.state.fields.contactno} 
      onChange={this.handleChange}  
      />
      </td>
      <td>
      <div className="errorMsg">{this.state.errors.contactNo}</div>
      </td>
      </tr>
      </tbody>
      </table>
      <button
      className="btn btn-danger btn-width-200"
      onClick={this.submituserRegistrationForm}
      >NEXT</button>     
      </Form>
    </div>
  </React.Fragment>

  );
 }

}


