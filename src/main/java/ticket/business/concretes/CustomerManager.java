package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.business.abstracts.CustomerService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.core.utilities.results.SuccessResult;
import ticket.dataAccess.abstracts.CustomerRepository;
import ticket.entities.concretes.Customer;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private CustomerRepository customerRepository;


    @Autowired
    public CustomerManager(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }


    @Override
    public DataResult<List<Customer>> getAll() {

        return new SuccessDataResult <List<Customer>>(this.customerRepository.findAll(), "Customers retrieved successfully");
    }

    @Override
    public Result add(Customer customer) {
        //this.customerRepository.save(customer);
        customerRepository.save(customer);
        return new SuccessResult("customer aded");
    }
}
