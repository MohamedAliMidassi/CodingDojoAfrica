import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams } from "react-router-dom";

const Details = (props) => {
    const [oneProduct, setOneProduct] = useState({})
    const { id } = useParams();

    useEffect(() => {
        axios.get('http://localhost:8000/api/product/' + id)
            .then(res => setOneProduct(res.data.Product))
            .catch(err => console.error(err));
    }, []);

    return (
        <div className='card'>
            <div className='card-body'>
                <h1 className='card-title'>Title: {oneProduct.title}</h1>
                <h3 className='card-text'>Price: {oneProduct.price}</h3>
                <h3 className='card-text'>Description: {oneProduct.description}</h3>
            </div>
        </div>
    )
}

export default Details;

