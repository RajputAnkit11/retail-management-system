package com.retail.product_service.service;

import com.retail.product_service.dto.ProductDto;
import java.util.List;

public interface ProductService {
    List<String> getAllProducts();
    String createProduct(ProductDto productDto);
}
