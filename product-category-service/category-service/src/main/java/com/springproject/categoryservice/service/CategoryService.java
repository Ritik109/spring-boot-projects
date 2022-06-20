package com.springproject.categoryservice.service;

import com.springproject.categoryservice.entity.Category;
import com.springproject.categoryservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {


    @Autowired
    CategoryRepository categoryRepository;
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category getByCategoryId(Long categoryId) {
        return categoryRepository.getByCategoryId(categoryId);
    }
}
