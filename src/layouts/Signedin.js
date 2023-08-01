import React from 'react'
import {Menu,Image, Dropdown,} from "semantic-ui-react"

export default function Signedin(props) {
  return (
    <div>
      <Menu.Item>

        <Image avatar spaced="right" />
       <Dropdown>
        <Dropdown.Menu>
            <Dropdown.Item text="My Account" icon="info"/>
            <Dropdown.Item onClick={props.signOut} text=" Log Out" icon="sign-out"/>

          
        </Dropdown.Menu>
        </Dropdown>
      </Menu.Item>
    </div>
  )
}
