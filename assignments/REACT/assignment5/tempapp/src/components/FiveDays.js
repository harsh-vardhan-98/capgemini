import axios from 'axios'
import React, { useEffect, useState } from 'react'

function FiveDays(props) {
     const [data, setData] = useState([])
     const [tempData, setTempData] = useState([])
     const arr = []
     useEffect(() => {
          const getData = async () => {
               // console.log(props.search);
               try {
                    const response = await axios.get(`https://api.openweathermap.org/data/2.5/forecast?q=${props.search}&appid=d5f33c218e2060ea7b74769368c88ad8&units=metric`)
                    // console.log(response.data.list[0].main.temp)
                    setData(response.data.list);
                    console.log(data)

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
     }, [props.search])

     return (
          <div id='temp-box'>

          <h2>Temperature will be for next 5 days</h2>
          <div id='box'>{
               tempData.map((t) => 
                         <h3>Temperature will be { t}</h3>
               )
          }
          </div>
          </div>
     )
}

export default FiveDays