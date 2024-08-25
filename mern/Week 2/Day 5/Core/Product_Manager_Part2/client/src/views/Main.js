import React from 'react'

import List from '../components/List'
import { useState } from 'react'
import { useEffect } from 'react'
import axios from "axios"


const Main = () => {

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


    return (
        <div>
            {loaded && <List product={product} />}

        </div>
    )
}

export default Main