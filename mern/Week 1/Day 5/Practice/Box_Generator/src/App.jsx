import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Generator from './components/Generator'

function App() {

  return (
    <div className="App">
      <div className='mb-5'>
        <h1> Genreate your box </h1>
      </div>

      <Generator />
    </div>
  )
}

export default App
