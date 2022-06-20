package com.springproject.productservice.service;

import com.springproject.productservice.entity.Category;
import com.springproject.productservice.entity.Product;
import com.springproject.productservice.entity.ProductDto;
import com.springproject.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    RestTemplate restTemplate;
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public ProductDto getByProductId(Long productId) {
        Product product = productRepository.getByProductId(productId);
       log.info(restTemplate.getForObject("http://CATEGORY-SERVICE/category/"+product.getCategoryId(), String.class));
        Category category = restTemplate.getForObject("http://CATEGORY-SERVICE/category/"+product.getCategoryId(), Category.class);

        ProductDto productDto = new ProductDto();
        productDto.setProduct(product);
        productDto.setCategory(category);
        return productDto;


    }
}
