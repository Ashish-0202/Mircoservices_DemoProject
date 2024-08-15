package com.microservice.CustomerMicroservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class orders {

    private long order_id;

    private String product_name;

    private long price;

    private String type;

    private long customer_id;
}
