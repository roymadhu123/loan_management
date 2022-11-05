import React, { useState } from "react"
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import '../node_modules/bootstrap/dist/js/bootstrap.bundle.min.js'
import './index.css';
import Dashboard from "./UserDashboard";
import { Navlink,Route, Switch } from "react-router";

const Login=()=>{
    
   // const [email,setEmail]=useState("")
    //const [password,setPassword]=useState("")
    const [user,setUser]=useState({
        email:"",
        password:""
    });
    const handleInput=(e)=>{
        const name=e.target.name;
        const value=e.target.value;

        //console.log(name,value)
        setUser({...user,[name]:value})
    }
    const handleSubmit=(e)=>{
        e.preventDefault();
        const info={...user}
        console.log(info);
       
    }
    return(
        
            <>
            
            <div class="center">
                <h1 class="text-center">Loan Management Application</h1>
                <h2 class="text-center">User Login</h2>
            <form action="" class="form-group col-md-5 col-md-offset-5 align-center" onSubmit={handleSubmit}>
  <div class="mb-3">
    <label htmlfor="email" class="form-label">Enter User Id</label>
    <input autoComplete="off" type="email" name="email" class="form-control" id="email"
    value={user.email}
    onChange={handleInput}
    />
    
  </div>
  <div class="mb-3">
    <label htmlfor="password" class="form-label">Enter User Password</label>
    <input  type="password" name="password" class="form-control" id="password" value={user.password}
    onChange={handleInput} />
  </div>
  
  <button  to='/dashboard' type="submit" class="btn btn-primary">Login</button>
</form>
</div>

            </>
        
    )
}
export default Login;