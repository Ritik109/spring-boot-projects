package com.springproject.categoryservice.repository;

import com.springproject.categoryservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category getByCategoryId(Long categoryId);
}
