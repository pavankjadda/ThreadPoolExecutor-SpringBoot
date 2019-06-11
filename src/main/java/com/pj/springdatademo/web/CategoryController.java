package com.pj.springdatademo.web;

import com.pj.springdatademo.model.Category;
import com.pj.springdatademo.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController
{
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping(path = "/list")
    public List<Category> getAllCategories()
    {
        return categoryRepository.getAllCategories();
    }
}
