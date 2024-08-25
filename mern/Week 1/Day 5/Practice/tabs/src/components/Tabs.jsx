import React from 'react'
const Tab = (props) => {
    return (
        <div className='d-flex justify-content-between'>
            {
                props.tabs.map((tab, index) => (
                    <button className='btn btn-secondary' onClick={() => props.setCurrentTab(index)}>{tab.label}</button>
                ))
            }
        </div>
    )
}

export default Tab