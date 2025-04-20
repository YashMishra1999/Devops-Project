package com.yash.order.controller;

import com.yash.order.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    public List<Order> getOrders() {
        return Arrays.asList(
                new Order("101", "iPhone 15"),
                new Order("102", "Macbook Pro")
        );
    }
}

