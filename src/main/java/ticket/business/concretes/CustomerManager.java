package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.business.abstracts.CustomerService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.core.utilities.results.SuccessResult;
import ticket.dataaccess.abstracts.CustomerRepository;
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

    @Override
    public DataResult<Customer> getCustomerById(long customerId) {
        return new SuccessDataResult<Customer>(this.customerRepository.getCustomerById(customerId).getData(),"data");
    }

    public DataResult<List<Customer>> getCustomerByEmail(String email) {
        DataResult<List<Customer>> customer = customerRepository.getCustomerByEmail(email);
       return new SuccessDataResult<>(customer,"data");

    }

    public DataResult<List<Customer>> getCustomerByPhoneNumber(String phoneNumber) {
        DataResult<List<Customer>> customer = customerRepository.getCustomerByPhoneNumber(phoneNumber);
        return new SuccessDataResult<>(customer,"data listed ");
    }

   // @Override
    //public DataResult<Customer> saveCustomer(Customer customer) {
        //return new SuccessDataResult<>(this.customerRepository.saveCustomer(customer),"data uptaded");
   // }





    public DataResult<Customer> deleteCustomer(Long id) {
        Customer customerToDelete = customerRepository.findById(id).orElse(null);
        if (customerToDelete == null) {
            return new SuccessDataResult<>(null, "Customer not found.");
        }

        customerRepository.delete(customerToDelete);
        return new SuccessDataResult<>(customerToDelete, "Customer deleted successfully.");
    }
    }





