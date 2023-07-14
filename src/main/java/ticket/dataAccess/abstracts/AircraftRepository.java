package ticket.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ticket.entities.concretes.Aircraft;
import ticket.entities.concretes.Airport;

public interface AircraftRepository extends JpaRepository<Aircraft,Long> {
}
