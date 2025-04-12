package com.retail.product_service.dto;

import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category;

    // Lombok @Data generates getters, setters, toString, equals, and hashCode
}
