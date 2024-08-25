import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Info from './components/Infos';
import Display from './components/Display';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const iniInput = "Mern Black Belt 🙌"
  const [list, setList] = useState([
    {
      input: iniInput,
      checked: false
    }
  ])
  return (
    <div className="App">
      <Info setList={setList} list={list} />
      <Display list={list} setList={setList} />
    </div >
  );
}

export default App;
