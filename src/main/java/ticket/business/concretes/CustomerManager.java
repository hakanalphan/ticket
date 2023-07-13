package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.business.abstracts.CustomerService;
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
    public List<Customer> getAll() {
        return customerRepository.findAll();

    }
}
