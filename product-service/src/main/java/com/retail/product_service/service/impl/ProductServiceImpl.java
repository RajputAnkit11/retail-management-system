package com.retail.product_service.service.impl;

import com.retail.product_service.dto.ProductDto;
import com.retail.product_service.entity.Product;
import com.retail.product_service.repository.ProductRepository;
import com.retail.product_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<String> getAllProducts() {
        // ...existing code...
        return null;
    }

    @Override
    public String createProduct(ProductDto productDto) {
        // Map ProductDto to Product entity
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setCategory(productDto.getCategory());

        // Save the product entity
        Product savedProduct = productRepository.save(product);

        return "Saved product with ID: " + savedProduct.getId();
    }
}
