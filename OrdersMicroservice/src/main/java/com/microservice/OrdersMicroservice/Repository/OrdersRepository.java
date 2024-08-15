package com.microservice.OrdersMicroservice.Repository;

import com.microservice.OrdersMicroservice.Entity.orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<orders,Long> {

    @Query(value = "SELECT * FROM orders WHERE customer_id = :customerId", nativeQuery = true)
    List<orders> getByCustomer_Id(@Param("customerId") long id);

}
