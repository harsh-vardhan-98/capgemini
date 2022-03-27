
import './App.css';
import CurrentWeather from './components/CurrentWeather';
import FiveDays from './components/FiveDays';
import Header from './components/Header';
// import Weather from './components/Weather';

function App() {
  return (
    <div className="App">
      <Header />
      <CurrentWeather />
     
    </div>
  );
}

export default App;
