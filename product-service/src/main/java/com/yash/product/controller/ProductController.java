package com.yash.product.controller;

import com.yash.product.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        return Arrays.asList(
                new Product("P001", "Laptop"),
                new Product("P002", "Monitor")
        );
    }
}

