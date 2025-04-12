package com.retail.product_service.controller;

import com.retail.product_service.dto.ProductDto;
import com.retail.product_service.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/products")
public class ProductController extends BaseController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getAllProducts() {
        // Example endpoint to fetch all products
        return "List of all products";
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductDto productDto) {
        // Delegate product creation to the service
        String savedProduct = productService.createProduct(productDto);

        // Return a response entity with a success message
        return ResponseEntity.ok(savedProduct);
    }
}
