import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import PersonCard from './components/PersonCard';

function App() {
  const [Age, setAge] = useState(45)
  const [AgeS, setAgeS] = useState(62)

  return (
  <>
    <div className="App">

      <PersonCard lastName={"Doe"} firstName={"Jane"} age={Age} hairColor={"Black"} />
      <button onClick={() => setAge((Age) => Age + 1)}>
        Birthday Button For Jane Doe
      </button>
    </div>

    <div className="App">
      <PersonCard lastName={"Smith"} firstName={"Maria"} age={AgeS} hairColor={"Brown"} />
      <button onClick={() => setAgeS((AgeS) => AgeS + 1)}>
        Birthday Button For Jhon Smith
      </button>
    </div>
  </>
  );
}

export default App
