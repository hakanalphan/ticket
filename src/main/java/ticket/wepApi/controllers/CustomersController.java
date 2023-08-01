package ticket.wepApi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ticket.business.abstracts.CustomerService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.entities.concretes.Customer;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/customers")
public class CustomersController {



    private CustomerService customerService;


    @Autowired
    public CustomersController(CustomerService customerService) {

        this.customerService = customerService;
    }
    @GetMapping("/all")
    public DataResult<List<Customer>> getAllCustomers() {
        return customerService.getAll();
    }

    @PostMapping("/add")
    public Result addCustomer(@RequestBody Customer customer) {
        return customerService.add(customer);
    }

    @GetMapping("/{customerId}")
    public DataResult<Customer> getCustomerById(@PathVariable long customerId) {
        return customerService.getCustomerById(customerId);
    }

    @GetMapping("/email/{email}")
    public DataResult<List<Customer>> getCustomerByEmail(@PathVariable String email) {
        return new SuccessDataResult<>( customerService.getCustomerByEmail(email),"başarılı");
    }

    @GetMapping("/phone/{phoneNumber}")
    public DataResult<List<Customer>> getCustomerByPhoneNumber(@PathVariable String phoneNumber) {
        return customerService.getCustomerByPhoneNumber(phoneNumber);
    }

    //@PutMapping("/update")
    //public DataResult<Customer> saveCustomer(@RequestBody Customer customer) {
        //return customerService.saveCustomer(customer);
    //}

    @DeleteMapping("/delete/{id}")
    public DataResult<Customer> deleteCustomer(@PathVariable Long id) {
       return   customerService.deleteCustomer(id);

    }
}
