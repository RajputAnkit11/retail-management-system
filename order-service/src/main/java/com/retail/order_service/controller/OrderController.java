package com.retail.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping(path="/v1/orders")
    public String getOrders() {
        return "These are orders";
    }
    @GetMapping(path="/v1/orders/price")
    public String getOrderPrice() {
        return "These are order price";
    }
    @GetMapping(path="/v1/orders/details")
    public String getOrderDetails() {
        return "These are orders details";
    }
}
//localhost:7005/retail/order/v1/orders
//localhost:7005/retail/order/v1/orders/price
//localhost:7005/retail/order/v1/orders/details

//localhost:7001/retail/apis/v1/orders
//localhost:7001/retail/apis/v1/orders/price
//localhost:7001/retail/apis/v1/orders/details

//localhost:7001/retail/apis+ v1/orders/price

