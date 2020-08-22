import React, { Component } from 'react';
import img from "./images/feedback.jpeg";
import  './feedback.css';
import {Link} from "react-router-dom";

function feedback()
{
    return(
        <div className="feedback">
            <div className="row">
                <div className="col-sm-12 form group">
                    <textarea
                    class="form-control"
                    type="textarea"
                    placeholder="add your comments here...!"
                    row="10"
                    >
                    </textarea>
                    <div className="image">
            <       img src={img} alt="not found" />
                    </div>
                </div>
                <br />
            </div>
            <Link
            className="btn btn-danger btn-width-200 search-submit"
            to={{ pathname: "/price" }}
          >NEXT</Link>      
        </div>
    );
}
export default feedback;