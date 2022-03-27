import React, { useEffect, useState } from 'react';
import axios from 'axios';
import FiveDays from './FiveDays';

function Wether() {
     const [citydata, setCityData] = useState();
     const [search, setSearch] = useState();

     useEffect(() => {
          const getData = async () => {
               try {
                    const response = await axios.get(`https://api.openweathermap.org/data/2.5/weather?q=${search}&appid=2ea1db4eeb20d55ca20273aeaf9236f1&units=metric`)

                    setCityData(response.data.main);

               } catch (error) {
                    console.log(error);
                    setCityData(null)
               }
          }


          getData();
     }, [search])



     return (
          <div id='weather-box'>
               <div>
                    <input type="search" placeholder='Enter the City' onChange={(e) => setSearch(e.target.value)} />

               </div>

               {!citydata ? (<h1>No Data Found</h1>) : (
                    <div>
                         <h3>city is {search} and temperture is {citydata.temp}</h3>
                    </div>
               )

               }

               <FiveDays search={search} />
          </div>
     )
}

export default Wether