import React, { useEffect, useState } from 'react';
import './currentWeather.scss'
import axios from 'axios';
import FiveDays from './FiveDays';

function CurrentWeather() {
     const [city, setCity] = useState(null);
     const [search, setSearch] = useState("Gwalior");


     useEffect(() => {

          const getData = async () => {
               try {
                    const response = await axios.get(`https://api.openweathermap.org/data/2.5/weather?q=${search}&appid=d5f33c218e2060ea7b74769368c88ad8&units=metric`)
                    setCity(response.data.main);
               } catch (error) {
                    console.log(error);
                    setCity(null);
               }

          }
          getData();
     }, [search])

     return (
          <div className='box'>

               <div className='input-box'>
                    <input type="search" onChange={(e) => { setSearch(e.target.value) }} />
               </div>
               
               {!city ?
                    (<h1>No Data Found</h1>) :
                    (<div><h1> city is {search} and current temperature  is {city.temp} celsius</h1></div>)
               }

          
          <FiveDays search={search}/>
          </div>


     )
}

export default CurrentWeather;