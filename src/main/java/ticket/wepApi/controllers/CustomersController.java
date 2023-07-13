package ticket.wepApi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ticket.business.abstracts.CustomerService;
import ticket.entities.concretes.Customer;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {



    private CustomerService customerService;


    @Autowired
    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getall")
    public List<Customer> getAll(){
        return customerService.getAll();


    }
}
