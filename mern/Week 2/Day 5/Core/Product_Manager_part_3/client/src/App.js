import Details from './components/Details';
import './App.css';
import Main from "./views/Main"
import Form from "./components/Form"
import { Route, Routes } from 'react-router-dom';
import Update from './views/Update';
import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
  return (
    <div className="App">
      <h1>Product Manager</h1><hr /><br />
      <Routes>
        <Route path="/" element={<Form />} />
        <Route path="/products/:id" element={<Details />} />
        <Route path="/:id/edit" element={<Update />} />
        <Route path="/products" element={<Main />} />
      </Routes>

    </div>
  );
}

export default App;
