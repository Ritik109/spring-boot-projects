package com.springproject.categoryservice.controller;

import com.springproject.categoryservice.entity.Category;
import com.springproject.categoryservice.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@Slf4j
public class RestApiController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/")
    public Category saveCategoryInfo(@RequestBody Category category) {
        log.info("In RestApiController Inside saveCategoryInfo");
        return categoryService.save(category);

    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable("id") Long categoryId) {
        log.info("In RestApiController Inside getCategoryById");
        return categoryService.getByCategoryId(categoryId);

    }
}
