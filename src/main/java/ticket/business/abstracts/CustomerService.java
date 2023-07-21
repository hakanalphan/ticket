package ticket.business.abstracts;

import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {

    DataResult<List<Customer>> getAll() ;
    Result<Customer> add(Customer customer);

    DataResult<Customer> getCustomerById(long customerId);
    DataResult<List<Customer>> getCustomerByEmail(String email);
    DataResult<List<Customer>> getCustomerByPhoneNumber(String phoneNumber);
    //DataResult<Customer> saveCustomer(Customer customer);
    DataResult<Customer> deleteCustomer(Long id);



}
