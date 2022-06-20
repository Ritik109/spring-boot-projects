package com.springproject.productservice.controller;

import com.springproject.productservice.entity.Product;
import com.springproject.productservice.entity.ProductDto;
import com.springproject.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductRestController {

    @Autowired
    ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product) {
        log.info("In ProductRestController inside saveProduct");
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public ProductDto getByProductId(@PathVariable("id") Long productId) {
        log.info("In ProductRestController inside getByProductId");
        return productService.getByProductId(productId);

    }
}
