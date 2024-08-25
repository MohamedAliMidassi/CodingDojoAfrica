import React from 'react'

const Display = (props) => {
    return (
        <div>
            <h5 >{props.tabs[props.currentTab].content}</h5>
        </div>
    )
}

export default Display