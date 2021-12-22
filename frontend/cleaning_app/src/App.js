import logo from './logo.svg';
import './App.css';
import Home from './components/Home';
import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom'
import BookingDetails from './components/BookingDetails';
//import Form from './components/Form';

function App() {

  return (
    <Router>
    <Switch>
      <Route exact path="/">
        <Home />
      </Route>

      {/* <Route path="/signup">
        <Form />
      </Route> */}

      {/* <Route path="/booking">
        <Booking />
      </Route> */}

      <Route exact path="/mybooking">
        
          <BookingDetails email="dipanwita@kickdrumtech.com" />
      
        
      </Route>
    </Switch>
  </Router>
  );
}

export default App;
