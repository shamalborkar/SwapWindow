import React, { Component } from 'react';
import img from "./images/car3.gif";
import  './home.css';
import {Link} from "react-router-dom";


function Home() {
return( 
        <React.Fragment>
        <div className="homestyle">
            <img src={img} alt="not found" />
          </div>
          <div className="button">
           <Link
           className="btn btn-danger btn-width-200 search-submit"
           to={{ pathname: "/add-employee" }}
         >NEXT</Link>  
         </div> 
         </React.Fragment>   
    );
};
  export default Home;