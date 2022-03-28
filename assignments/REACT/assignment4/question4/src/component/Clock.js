import { React, useState } from 'react'
import './clock.scss';

function Clock() {
     let Time = new Date().toLocaleTimeString();
     let currDate = new Date();
     
     const [active, setActive] = useState(1);
     const [date, setDate] = useState(currDate);
     const [time, setTime] = useState(Time);
     
     
     const update= ()=>{
          Time = new Date().toLocaleTimeString();
          setTime(Time);
          currDate = new Date();
          setDate(currDate);
     }

     setInterval(update , 1000);
     
     
     const eventHandler = ()=>{
          if(active === 1){
               setActive(0);
          }else{
               setActive(1);

          }
     }

    
    
     return (
          <div className='clock-box'>
               <div className="header">
                    <img src="https://png.pngtree.com/png-clipart/20200224/original/pngtree-wall-clock-icon-simple-style-png-image_5233182.jpg" alt="" className="clock-img" />
                    <h1>Digital Clock</h1>
               </div>
               <div className="clock">
                    <label className='switch'>
                         <input type="checkbox" onChange={eventHandler} />
                         <span className='slider'/>
                    </label>
                    <div className='time-box'>
                         <h1>{time}</h1>
                         <p className={active?"active":""}>{date.getDate()}/{date.getMonth()}/{date.getFullYear()}</p>
                    </div>
               </div>
          </div>
     )
}

export default Clock