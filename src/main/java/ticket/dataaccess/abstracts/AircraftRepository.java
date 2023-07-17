package ticket.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticket.entities.concretes.Aircraft;


@Repository
public interface AircraftRepository extends JpaRepository<Aircraft,Long> {

}
