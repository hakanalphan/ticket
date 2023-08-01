import React from 'react'
import { Formik } from 'formik'
export default function FlightAdd() {

    const initialValues={departureAirport:"",arrivalAirport:"",aircraft:""}
  return (
    <div>
      <Formik
      
      initialValues={initialValues}
      
      
      ></Formik>
    </div>
  )
}

