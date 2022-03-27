import React from 'react';
import {Link} from 'react-router-dom';
import './navbar.scss';

function Layout() {
  return (
    <div id="navbar">
         <ul>
              <li>
                   <Link className='link' to='/home'>Home</Link>
              </li>
              <li>
                   <Link className='link' to='/contact'>Contact</Link>
              </li>
              <li>
                   <Link className='link'  to='/about'>About</Link>
              </li>
              <li>
                   <Link className='link' to='/product'>Product</Link>
              </li>
         </ul>
    </div>
  )
}

export default Layout