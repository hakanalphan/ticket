import React from 'react'
import { Button,Menu } from 'semantic-ui-react'

export default function SignnedOut(props) {
  return (
    <div>
      <Menu.Item>
      <Button onClick={props.signIn}>Login </Button>
      <Button primary style={{marginleft:"0.5em"}}>Register</Button>
      </Menu.Item>
    </div>
  )
}
