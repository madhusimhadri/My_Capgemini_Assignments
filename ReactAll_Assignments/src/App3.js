import './App.css';
import React , {useState}from 'react'
import {Switch} from 'antd'
//import Carousel from 'react-bootstrap/Carousel'

//import HelloWorld from './components/HelloWorld';
//import Employee from './components/Employee';
function App() {
    // const date = new Date().toLocaleDateString()
    const [toggle,setToggle] = useState(false)

    const toggler = () => 
    {
        toggle ? setToggle(false):setToggle(true);
    }


 const date = new Date().getDate();
 const month = new Date().getMonth();
 const year = new Date().getFullYear();

// time
 const time = new Date().toLocaleTimeString();

 const [currtime, setcurrtime] = useState(time);

 const updatetime = () => {
     const time = new Date().toLocaleTimeString();
     setcurrtime(time);
 }

 setInterval(updatetime, 1000);

 return(
    
    <div >
      <Switch onClick={toggler} />
      {toggle ? <span className="date">{date}/{month}/{year}</span> : <span className="time">{currtime}</span>}
    </div>
   

 );
}

export default App


 
   