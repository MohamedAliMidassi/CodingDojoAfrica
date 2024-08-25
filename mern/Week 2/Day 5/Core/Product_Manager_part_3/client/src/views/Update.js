import React, { useEffect, useState } from 'react'
import axios from 'axios'
import { useParams, useNavigate } from 'react-router-dom'





const Update = (props) => {
    const { id } = useParams()
    const [title, setTitle] = useState("")
    const [price, setPrice] = useState(0)
    const [description, setDescription] = useState("")

    const nav = useNavigate()

    useEffect(() => {
        axios.get('http://localhost:8000/api/product/' + id)
            .then(res => {
                setTitle(res.data.Product.title)
                setPrice(res.data.Product.price)
                setDescription(res.data.Product.description)
            })
    }, [])

    const updateProduct = (e) => {
        e.preventDefault()
        axios.patch('http://localhost:8000/api/' + id + '/edit', {
            title,
            price,
            description
        })
            .then(res => console.log(res))
            .catch(err => console.log(err))

        nav("/products/" + id)
    }

    return (
        <div>
            <h1>Update Product</h1>
            <form onSubmit={updateProduct}>
                <p >
                    <label>Title: </label>
                    <input
                        type='text'
                        name='title'
                        value={title}
                        onChange={(e) => { setTitle(e.target.value) }}
                    />
                </p>
                <p>
                    <label>Price: </label>
                    <input
                        type='number'
                        name='price'
                        value={price}
                        onChange={(e) => { setPrice(e.target.value) }}
                    />
                </p>
                <p>
                    <label>Description: </label>
                    <input
                        type='text'
                        name='description'
                        value={description}

                        onChange={(e) => { setDescription(e.target.value) }}
                    />
                </p>
                <button>Submit</button>
            </form>
        </div>
    )
}

export default Update