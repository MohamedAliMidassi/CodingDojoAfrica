import logo from './logo.svg';
import './App.css';
import Tab from './components/Tabs';
import Display from './components/Display';
import { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
  const [tabs, setTabs] = useState([
    { label: "Tab 1", content: "Tab 1 content is showing here." },
    { label: "Tab 2", content: "Tab 2 content is showing here." },
    { label: "Tab 3", content: "Tab 3 content is showing here." }
  ])

  const [currentTab, setCurrentTab] = useState(0)
  return (
    <div className="App">
      <h1>hello</h1>
      <table className='table  table-hover'>
        <thead>
          <tr>
            <th>
              <Tab tabs={tabs} setCurrentTab={setCurrentTab} />
            </th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>
              <Display tabs={tabs} currentTab={currentTab} />
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default App;
