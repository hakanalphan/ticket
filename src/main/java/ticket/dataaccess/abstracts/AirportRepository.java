package ticket.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticket.entities.concretes.Airport;


@Repository
public interface AirportRepository extends JpaRepository<Airport,Long> {
}
