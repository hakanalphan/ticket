package ticket.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ticket.entities.concretes.Airport;
import ticket.entities.concretes.Flight;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
