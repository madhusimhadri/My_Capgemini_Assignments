//import logo from './logo.svg';
import './App.css';
//import Employee from './components/Employee';
//import HelloWorld from './components/HelloWorld';
import { BrowserRouter as Router,
  Switch,
  Route,
  NavLink } from 'react-router-dom'
//mport Route from 'react-router-dom/Route'
//import Button from './components/button/Button';
import Navbar from 'react-bootstrap/Navbar'
import Nav from 'react-bootstrap/Nav'
import './components/Navbar.css'
function App() {
  return (
    // <div className="App">
    //   {/* <header>
    //   <Button label ="click me please"/>
    //   </header> */}
    //   <HelloWorld/>
    //   <Employee/>
    // </div>
    <Router>
      <Navbar bg="primary" className="navbar" variant="dark">
      <Nav className="navItem">
        <div>
          <NavLink to ="/" className="navItem" exact activeStyle={
              { color:'red' }
            }>Home</NavLink>
          <NavLink to ="/about" className="navItem2" exact activeStyle={
              { color:'red' }
            }>About</NavLink>
          <NavLink to ="/projects" className="navItem3" exact activeStyle={
              { color:'red' }
            }>Projects</NavLink>
          <NavLink to ="/services" className="navItem4" exact activeStyle={
              { color:'red' }
            }>Services</NavLink>
        </div>
        </Nav>
      </Navbar>

      <Switch>
        <Route exact path="/">
          <Home />
        </Route>
        <Route path="/about">
          <About/>
        </Route>
        <Route path="/projects">
          <Projects/>
        </Route>
        <Route path="/services">
          <Services/>
        </Route>
      </Switch>
    </Router>

  );
}

function Home()
{
  return (
    <div>
      <h2>This is Home</h2>
    </div>
  )
}

function About()
{
  return(
    <div>
      <h2>This is About</h2>
    </div>
  )
}

function Projects()
{
  return(
    <div>
      <h2>These are Projects</h2>
    </div>
  )
}

function Services()
{
  return (
    <div>
      <h2>These are Services</h2>
    </div>
  )
}
export default App;
