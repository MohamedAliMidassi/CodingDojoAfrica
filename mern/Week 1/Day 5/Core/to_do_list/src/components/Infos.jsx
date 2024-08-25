import React, { useState } from 'react'

const Info = (props) => {
    const [info, setInfo] = useState("")
    const submitHandler = (e) => {
        e.preventDefault()
        props.setList([...props.list, {
            input: info,
            checked: false
        }])
        setInfo("")
    }
    return (
        <div >
            <form className='mt-3' onSubmit={(e) => submitHandler(e)}>
                <div className='input-group mb-3'>
                    <input type="text" className='form-control' value={info} onChange={(e) => setInfo(e.target.value)} />
                    <button className='btn btn-primary'>Add</button>
                </div>
            </form>
        </div>
    )
}

export default Info