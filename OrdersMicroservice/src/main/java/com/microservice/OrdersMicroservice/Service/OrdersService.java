package com.microservice.OrdersMicroservice.Service;

import com.microservice.OrdersMicroservice.Entity.orders;
import com.microservice.OrdersMicroservice.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    public List<orders> getAllorders(){
        return ordersRepository.findAll();
    }

    public Optional<orders> getByid(long id){
        return  ordersRepository.findById(id);
    }

    public List<orders> getBycustomerid(long cid){
        return ordersRepository.getByCustomer_Id(cid);
    }

    public orders addnew(orders order){
        orders neworder= ordersRepository.save(order);
        return neworder;
    }

}
