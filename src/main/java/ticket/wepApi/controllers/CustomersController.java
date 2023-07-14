package ticket.wepApi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticket.business.abstracts.CustomerService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
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
    public DataResult<List<Customer>> getAll(){
        return this.customerService.getAll();



    }

    @PostMapping( "/add")
    public Result add(@RequestBody  Customer customer){
        return this.customerService.add(customer);
    }
}
