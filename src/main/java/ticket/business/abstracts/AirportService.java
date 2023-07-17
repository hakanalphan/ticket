package ticket.business.abstracts;

import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.entities.concretes.Airport;

import java.util.List;

public interface AirportService {

    Result addAirport(Airport airport);

    DataResult<Airport> getAirportById(Long id);

    Result updateAirport(Airport airport);
    Result deleteAirport(Long id);

    DataResult<List<Airport>> getAllAirports();

}
