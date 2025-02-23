package com.retail.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping(path = "/orders")
    public String getOrders() {
        return "These are orders";
    }
}
