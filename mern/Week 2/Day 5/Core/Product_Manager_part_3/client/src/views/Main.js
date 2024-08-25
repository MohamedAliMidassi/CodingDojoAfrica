import React, { useState, useEffect } from 'react'
import { useNavigate } from 'react-router-dom'
import List from '../components/List'
import axios from "axios"
import Details from '../components/Details'


const Main = () => {
    const nav = useNavigate()
    const [product, setProduct] = useState([])
    const [loaded, setLoaded] = useState(false)
    useEffect(() => {
        axios.get('http://localhost:8000/api')
            .then(res => {
                setProduct(res.data.Product)
                setLoaded(true)
            })
            .catch(err => console.log(err))
    }, [])

    const removeProduct = (id) => {
        setProduct(product.filter(product => product._id !== id))
    }

    return (
        <div>

            {loaded && <List product={product} removeProduct={removeProduct} />}


            <button onClick={() => { nav("/") }}>Home</button>
        </div>
    )
}

export default Main