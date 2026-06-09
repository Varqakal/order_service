package com.microservice.order_service.controller;


import com.microservice.order_service.dto.OrderRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order placed successfully";

    }

}
