package ticket.business.abstracts;

import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {

    DataResult<List<Customer>> getAll() ;
    Result add(Customer customer);


}
