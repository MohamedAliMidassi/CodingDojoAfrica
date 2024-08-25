import React, { useState } from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
const Generator = () => {
    const [color, setColor] = useState('');

    const [boxes, setBoxes] = useState([]);

    const handleSubmit = (e) => {
        e.preventDefault();
        const newBox = color && {
            color: color,
        };
        setBoxes([...boxes, newBox]);
        setColor('');

    };

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <div className="input-group mb-3">
                    <button className="btn btn-primary" type="button" id="button-addon1">Button</button>
                    <input type="text"
                        className="form-control"
                        placeholder="Enter your color"
                        value={color}
                        onChange={(e) => setColor(e.target.value)} aria-describedby="button-addon1" />
                </div>

            </form>
            <div style={{ display: 'flex', flexWrap: 'wrap', gap: '10px' }}>
                {boxes.map((box, index) => (
                    <div
                        key={index}
                        style={{
                            backgroundColor: box.color,
                            width: `150px`,
                            height: `100px`,
                            margin: '5px'
                        }}
                    />
                ))}
            </div>
        </div>
    );
}

export default Generator