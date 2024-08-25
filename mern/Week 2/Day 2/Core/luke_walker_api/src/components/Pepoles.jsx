import axios from 'axios';
import React, { useState, useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';

const People = () => {
    const [result, setResult] = useState({});
    const [loading, setLoading] = useState(true);
    const nav = useNavigate();
    const { id, search } = useParams();

    useEffect(() => {
        axios.get(`https://swapi.dev/api/${search}/${id}`)
            .then((res) => {
                setResult(res.data);
                setLoading(false);
            }).catch((err) => {
                console.log(err);
                nav("/error");
            });
    }, [id, search, nav]);

    if (loading) {
        return <div>Loading...</div>;
    }

    return (
        <div>
            {search === "people" ? (
                <div>
                    <h1>{result.name}</h1>
                    <p>Height: {result.height}</p>
                    <p>Mass: {result.mass}</p>
                    <p>Hair Color: {result.hair_color}</p>
                    <p>Skin Color: {result.skin_color}</p>
                </div>
            ) : (
                <div>
                    <h1>{result.name}</h1>
                    <p>Climate: {result.climate}</p>
                    <p>Terrain: {result.terrain}</p>
                    <p>Surface Water: {result.surface_water}</p>
                    <p>Population: {result.population}</p>
                </div>
            )}
        </div>
    );
}

export default People;
