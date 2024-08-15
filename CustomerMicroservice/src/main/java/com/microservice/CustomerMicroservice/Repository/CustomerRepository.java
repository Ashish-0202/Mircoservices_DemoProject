package com.microservice.CustomerMicroservice.Repository;

import com.microservice.CustomerMicroservice.Entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<customer,Long> {

    String deleteById(long id);
}
