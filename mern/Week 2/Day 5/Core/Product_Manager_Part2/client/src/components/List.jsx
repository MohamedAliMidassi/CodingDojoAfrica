import React from 'react'
import { Link } from 'react-router-dom'


const List = (props) => {
    return (
        <div className='card'>
            {props.product.map((products, i) =>
                <div className='card-body'>
                    <p className='card-title' key={i}>
                        Title: <Link to={`/products/${products._id}`}>  {products.title}</Link>
                    </p>
                </div>
            )}
        </div>
    )
}

export default List