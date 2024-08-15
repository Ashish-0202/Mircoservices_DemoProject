package com.microservice.CustomerMicroservice.Service;

import com.microservice.CustomerMicroservice.Entity.customer;
import com.microservice.CustomerMicroservice.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<customer> getAll(){
        return customerRepository.findAll();
    }

    public Optional<customer> getById(long id){
        return customerRepository.findById(id);
    }

    public String remove(long id){
        return customerRepository.deleteById(id);
    }

    public customer add(customer c){
        return customerRepository.save(c);
    }

    public List getorders(long cid){
        String url="http://localhost:9090/api/v1/order/customer/"+cid;
        return restTemplate.getForObject(url, List.class);
    }

}
