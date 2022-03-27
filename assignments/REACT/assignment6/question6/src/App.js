
import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './components/Home';
import Contact from './components/Contact';
import Layout from './components/Layout';
import Product from './components/Home';
import About from './components/About';


function App() {
  return (

    <div className="App">
      <Router>
      <Layout/>
        <Routes>
          <Route path="/home" element={<Home />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/product" element={<Product />} />
          <Route path="/about" element={<About />} />
        </Routes>

      </Router>
    </div>
  );
}

export default App;
