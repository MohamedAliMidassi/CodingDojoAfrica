import axios from 'axios';
import React, { useState } from 'react';
import { Routes, Route, useNavigate } from 'react-router-dom';
import People from './components/Pepoles';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [search, setSearch] = useState("");
  const [id, setId] = useState("");
  const nav = useNavigate();

  const submit = (e) => {
    e.preventDefault();
    nav(`/${search}/${id}`);
  }

  return (
    <div className="container">
      <form onSubmit={submit}>
        <label className='form-label'>Search for: </label>
        <select className='form-select' onChange={(e) => setSearch(e.target.value)} >
          <option value=""></option>
          <option value="people">People</option>
          <option value="planets">Planets</option>
        </select>
        <label>ID: </label>
        <input type="text" className='form-control' onChange={(e) => setId(e.target.value)} />
        <button type="submit" className='btn btn-primary'>Search</button>
      </form>
      <Routes>
        <Route path="/people/:id" element={<People />} />
        <Route path="/planets/:id" element={<People />} />
      </Routes>
    </div>
  );
}

export default App;
