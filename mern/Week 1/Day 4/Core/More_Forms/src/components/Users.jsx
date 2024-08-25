import React from 'react'
import { useState } from "react"
const User = () => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");

    const createUser = (e) => {
        e.preventDefault();

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
            <div className='block'>
                <label >
                    First Name :
                </label>
                <input type="text" value={firstName} onChange={(e) => setFirstName(e.target.value)}/>
            </div>
            <div >
                <label>
                    Last Name :
                </label>
                <input type="text" />
            </div>
            <div >
                <label>
                    E-mail :
                </label>
                <input type="text" />
            </div>
            <div >
                <label>
                    Password :
                </label>
                <input type="password" />
            </div>
            <div className='block'>
                <label>
                    Confirm Password :
                </label>
                <input type="password" />
            </div>
        </form>


    )
}

export default Users
