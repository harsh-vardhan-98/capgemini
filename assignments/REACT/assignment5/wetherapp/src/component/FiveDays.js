import axios from 'axios';
import React, { useEffect, useState } from 'react'

function FiveDays(props) {
     const [data, setData] = useState([]);
     const [tempData, setTempData] = useState([]);
     const arr = [];


     useEffect(() => {
          const getData = async () => {
               try {
                    const response = await axios.get(`https://api.openweathermap.org/data/2.5/forecast?q=${props.search}&appid=2ea1db4eeb20d55ca20273aeaf9236f1&units=metric`)
                    setData(response.data.list);
                    console.log(data);

               } catch (error) {
                    console.log(error);
               }
          }
          const dataFilter = () => {
               for (var i = 0; i < data.length; i += 8) {
                    arr.push(data[i].main.temp)
               }
               setTempData(arr);
          }

          getData();
          dataFilter();
          console.log(tempData);
     },[props.search])




     return (
          <div >
               {tempData.map((t) => <div>
                    <h3>Temperature will be{t}</h3>
               </div>)}


          </div>
     )
}

export default FiveDays