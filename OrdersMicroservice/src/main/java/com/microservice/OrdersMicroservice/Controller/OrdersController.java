package com.microservice.OrdersMicroservice.Controller;

import com.microservice.OrdersMicroservice.Entity.orders;
import com.microservice.OrdersMicroservice.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/orders")
    public List<orders> getAll(){
        return ordersService.getAllorders();
    }

    @GetMapping("/order/{id}")
    public Optional<orders> getByid(@PathVariable("id") long id){
        return ordersService.getByid(id);
    }

    @GetMapping("/order/customer/{cid}")
    public ResponseEntity<List<orders>> getByCid(@PathVariable("cid") long cid){
        List<orders> orders=ordersService.getBycustomerid(cid);
        return ResponseEntity.ok(orders);
    }

    @PostMapping("/order/new")
    public ResponseEntity<orders> neworder(@RequestBody orders order){
        orders neworder= ordersService.addnew(order);
        return new ResponseEntity<>(neworder, HttpStatus.CREATED);
    }

}
