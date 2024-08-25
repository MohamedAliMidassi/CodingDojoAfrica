import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

const User = () => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");

    const createUser = (e) => {
        // we must prevent the default refresh of the browser to keep our state from being reset
        e.preventDefault();

        // shorthand ES6 syntax for building an object - see notes above
        const newUser = { firstName, lastName, email, password };
        console.log("Welcome", newUser);
        setFirstName("");
        setLastName("");
        setEmail("");
        setPassword("");
        setConfirmPassword("");
    };


    return (
        <form className='form' onSubmit={createUser}>
            <h1>Register Here!</h1>
            <div className='row' >
                <label className="form-label">First Name </label>
                <input type="text"className="form-control" value={firstName} onChange={(e) => setFirstName(e.target.value)} />
                {firstName.length >= 1 & firstName.length < 2 ? <p style={{ color: "red", textAlign: 'left' }}>First Name has to be more than two characters</p> : <p></p>}
            </div>
            <div className='row'>
                <label className="form-label">Last Name </label>
                <input type="text"className="form-control" value={lastName} onChange={(e) => setLastName(e.target.value)} />
                {lastName.length >= 1 & lastName.length < 2 ? <p style={{ color: "red", textAlign: 'left' }}>Last Name has to be more than two characters</p> : <p></p>}
            </div>
            <div className='row'>
                <label className="form-label">Email Address </label>
                <input type="text"className="form-control" value={email} onChange={(e) => setEmail(e.target.value)} />
                {email.length >= 1 & email.length < 2 ? <p style={{ color: "red", textAlign: 'left' }}>Email address has to be more than two characters</p> : <p></p>}
            </div>
            <div className='row'>
                <label className="form-label">Password </label>
                <input type="password"className="form-control" value={password} onChange={(e) => setPassword(e.target.value)} />
                {password.length >= 1 & password.length <= 8 ? <p style={{ color: "red", textAlign: 'left' }}>Password has to be more than 8 characters</p> : <p></p>}
            </div>
            <div className='row'>
                <label className="form-label">Confirm Password </label>
                <input type="password"className="form-control" value={confirmPassword} onChange={(e) => setConfirmPassword(e.target.value)} />
                {password !== confirmPassword ? <p styel={{ color: "red", textAlign: 'left' }}>Password must match</p> : <p></p>}
            </div>
        </form>


    )
}

export default User