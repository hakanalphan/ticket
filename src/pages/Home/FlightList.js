import React, { useState,useEffect } from 'react'
import {  Table } from 'semantic-ui-react'
import FlightService from '../../services/flightService'
import './FlightList.css'
import Navbar from '../../layouts/navbar'

export default function FlightList() {

const [flights, setFlights] = useState([])

useEffect(() => {
  let flightService=new FlightService()
  flightService.getFlights().then(result => setFlights(result.data.data))
  }, []
)

  return (
    
    <div>

      <Navbar/>

<Table striped>
    <Table.Header>
      <Table.Row>
        <Table.HeaderCell>Aircraft</Table.HeaderCell>
        <Table.HeaderCell>Departure time</Table.HeaderCell>
        <Table.HeaderCell>Arrival time</Table.HeaderCell>
        <Table.HeaderCell>Arrival Airport</Table.HeaderCell>
      </Table.Row>
    </Table.Header>

    <Table.Body>
      {flights.map(flight =>(<Table.Row key={flight.id}>
        <Table.Cell>{flight.aicraft}</Table.Cell>
        <Table.Cell>{flight.departureTime}</Table.Cell>
        <Table.Cell>{flight.arrivalTime}</Table.Cell>
        <Table.Cell>{flight.arrivalAirport.name}</Table.Cell>
      </Table.Row>
      ))}
      
      
      
      
    </Table.Body>
  </Table>

  </div>
)


  }
  

