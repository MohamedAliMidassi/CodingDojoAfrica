import React from 'react'
import { Link } from 'react-router-dom'
import axios from 'axios'





const List = (props) => {
    const { removeProduct } = props

    const deleteProduct = (id) => {

        axios.delete('http://localhost:8000/api/products/' + id)
            .then((res) => {
                removeProduct(id)
            })
            .catch(err => console.log(err))
    }


    return (
        <div>
            {props.product.map((products, i) =>
                <div key={i} >
                    <p >
                        Title: <Link to={`/products/${products._id}`}>  {products.title}</Link>
                        <button className='btn btn-danger' onClick={(e) => { deleteProduct(products._id) }}>Delete</button>
                    </p>

                </div>
            )}
        </div>
    )
}

export default List