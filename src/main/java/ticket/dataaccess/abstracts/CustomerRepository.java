package ticket.dataaccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticket.core.utilities.results.DataResult;
import ticket.entities.concretes.Customer;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {


    DataResult<Customer> getCustomerById(Long id);
    DataResult<List<Customer>> getCustomerByEmail(String email);
    DataResult<List<Customer>> getCustomerByPhoneNumber(String phoneNumber);
   // DataResult<Customer> saveCustomer(Customer customer);
    //DataResult<Customer> deleteCustomer(Long id);




}
