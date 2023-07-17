package ticket.business.abstracts;

import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.entities.concretes.Flight;

import java.util.List;



public interface FlightService {

    Result addFlight(Flight flight);
    DataResult<Flight> updateFlight(Flight flight);
    DataResult<Flight> deleteFlight(long id);



    DataResult<List<Flight>> getAllFlights();

    DataResult<Flight> getFlightById(Long id);
}
