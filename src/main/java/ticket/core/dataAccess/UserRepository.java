package ticket.core.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;
import ticket.core.entities.Userr;

public interface UserRepository extends JpaRepository<Userr,Long> {

    Userr findByEmail(String email);

    Userr findByUsername(String username);


}
