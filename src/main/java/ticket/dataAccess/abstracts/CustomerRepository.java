package ticket.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import ticket.entities.concretes.Customer;
import java.util.List;
public interface CustomerRepository extends JpaRepository<Customer,Integer> {


}
