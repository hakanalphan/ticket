package ticket.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticket.core.utilities.results.DataResult;
import ticket.entities.concretes.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {

 // DataResult<Flight> deleteFlightById(Long id);
    //DataResult<Flight>getFlightById(Long id);
}
