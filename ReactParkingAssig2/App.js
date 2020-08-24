import React, { Component } from 'react';
import './App.css';
import Main from './Main';
import {BrowserRouter, Route,Switch} from 'react-router-dom';
import AddEmployee from './addEmployee';
import Home from './home';
import vehicleDetails from './vehicleDetails';
import feedback from './feedback';
import price from './price';
function App() {
  return (
    <BrowserRouter>
    <div className="App">
    <Main />
    <Switch>
    <Route path="/home" component={Home} />
    <Route path="/add-employee" component={AddEmployee} />
    <Route path="/vehicleDetails" component={vehicleDetails} />
    <Route path="/feedback" component={feedback} />
    <Route path="/price" component={price} />
    </Switch>
    </div>
    </BrowserRouter>
  );
}

export default App;
