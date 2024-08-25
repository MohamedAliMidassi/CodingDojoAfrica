import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css'
import axios from 'axios';
function App() {
  const [pokemon, setPokemon] = useState({ results: [] })


  const handleClick = () => {
    axios.get('https://pokeapi.co/api/v2/pokemon?limit=100000&offset=807')
      .then(response => {
        console.log(response.data);
        setPokemon(response.data)
      }).catch((error) => {
        console.log(error)
      })
  }

  return (
    <div className="App">
      <div className="container mt-3">
        <button onClick={handleClick} type="button" className="btn btn-secondary">
          Fetch Pokemon
        </button>
        <ul className='list-group'>
          <li className='list-group-item list-group-item-action active'>The names of the pokemons</li>
          {pokemon.results.map((poke, index) => (
            <li className='list-group-item' key={index}>{poke.name}</li>
          ))}
        </ul>
      </div>

    </div >
  );
}

export default App;