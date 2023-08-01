import Signedin from "./Signedin"
import SignnedOut from "./SignnedOut"
import "./navbar.css"
import  React,{ useState } from "react"
import { useNavigate } from "react-router-dom";
import "semantic-ui-react";



const Navbar = () => {
const [isAuthenticated, setisAuthenticated] = useState(true)
const navigate = useNavigate();

function handleSignOut(params){
  setisAuthenticated(false)
}
function handleSignIn(){
  setisAuthenticated(false)
}

const handleregister = () => {
  navigate("/Register");
};
const handleLogin = () => {
  navigate("/Login");};
  const handlehome = () => {
    navigate("/");
};
return (
    <div className="navbar">
      <div className="navContainer">
      <button className="home" onClick={handlehome}>Home </button>

        <span className="logo">Booking</span>
        <div className="navItems">
        
           {isAuthenticated?<Signedin  style={{marginright:"3em"}} signOut={handleSignOut}/>:<SignnedOut signIn={handleSignIn}/>}

        </div>

      </div>
    </div>
  )
}

export default Navbar;