import React from 'react'
import { useParams } from 'react-router-dom'

export default function FlightDetail() {
 
 let {id}=useParams()
 
 
    return (
    
    <div>
      Flight:{id}
    </div>
  )
}
