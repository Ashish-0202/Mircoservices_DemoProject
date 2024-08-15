package com.microservice.CustomerMicroservice.Controller;

import com.microservice.CustomerMicroservice.Entity.customer;
import com.microservice.CustomerMicroservice.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<customer> getAllCustomer(){
        return customerService.getAll();
    }

    @GetMapping("/customer/{id}")
    public Optional<customer> getById(@PathVariable("id")long id){
        return customerService.getById(id);
    }
    @GetMapping("/remove/{id}")
    public ResponseEntity<String> delete(@PathVariable("id")long id){
        customerService.remove(id);
        return new ResponseEntity<>("Deleted Successfully..!",HttpStatus.ACCEPTED);
    }

    @PostMapping("/new")
    public customer create(@RequestBody customer c){
        return customerService.add(c);
    }

    @GetMapping("/customer/order/{cid}")
    public List getorders(@PathVariable("cid")long id){
        return customerService.getorders(id);
    }
}
