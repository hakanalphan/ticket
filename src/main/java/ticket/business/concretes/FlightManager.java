package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.business.abstracts.FlightService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.core.utilities.results.SuccessResult;
import ticket.dataaccess.abstracts.FlightRepository;
import ticket.entities.concretes.Flight;


import java.util.List;


@Service
public class FlightManager implements FlightService {

    private final FlightRepository flightRepository;



    @Autowired
    public FlightManager(FlightRepository flightRepository) {

        this.flightRepository = flightRepository;
    }

    @Override
    public Result addFlight(Flight flight) {
         flightRepository.save(flight);
        return new SuccessResult("customer aded");
    }

    @Override
    public DataResult<Flight> updateFlight(Flight flight) {


        return null;
    }



    @Override
    public DataResult<Flight> deleteFlight(long id) {


        return new SuccessDataResult<>(flightRepository.deleteFlight(id),"");

    }

    @Override
    public DataResult<List<Flight>> getAllFlights() {



        return new SuccessDataResult<List<Flight>>(flightRepository.findAll(),"flight retrieved"
                );
    }

    @Override
    public DataResult<Flight> getFlightById(Long id) {

        return new SuccessDataResult<Flight>(this.flightRepository.getFlightById(id).getData(),"");
    }


}
