package ticket.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ticket.entities.concretes.Airport;

public interface AirportRepository extends JpaRepository<Airport,Long> {
}
