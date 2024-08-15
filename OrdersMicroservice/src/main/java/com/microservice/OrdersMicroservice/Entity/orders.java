package com.microservice.OrdersMicroservice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long order_id;

    @Column
    private String product_name;

    @Column
    private long price;

    @Column
    private String type;

    @Column
    private long customer_id;
}
