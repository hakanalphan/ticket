package ticket.core.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticket.core.entities.Userr;


@Repository
public interface UserRepository extends JpaRepository<Userr,Long> {

    Userr findByEmail(String email);

    Userr findByUsername(String username);


}
