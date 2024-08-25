import React, { useState } from 'react'
import axios from 'axios'

const Form = () => {
    const [title, setTitle] = useState("")
    const [price, setPrice] = useState(0)
    const [description, setDescription] = useState("")

    const submitHandler = (e) => {
        e.preventDefault()

        axios.post('http://localhost:8000/api/product', {
            title,
            price,
            description
        })
            .then(res => console.log(res))
            .catch(err => console.log(err))

        setTitle("")
        setPrice(0)
        setDescription("")

    }

    return (
        <form onSubmit={submitHandler} className='d-flex flex-column'>
            <div className='detail'>
                <label className='form-label'>Title</label>
                <input type="text" className='form-control' onChange={(e) => setTitle(e.target.value)} value={title} />
            </div>
            <div className='detail'>
                <label className='form-label'>Price</label>
                <input type="number" className='form-control' onChange={(e) => setPrice(e.target.value)} value={price} />
            </div>
            <div className='detail'>
                <label className='form-label'>Description</label>
                <input type="text" className='form-control' onChange={(e) => setDescription(e.target.value)} value={description} />
            </div>
            <button className='btn btn-success'>Submit</button>
        </form>
    )
}

export default Form