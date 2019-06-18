package com.pj.springdatademo.service;

import com.pj.springdatademo.model.Category;

import java.util.List;

public interface CategoryService
{
    List<Category> getAllCategoriesAsync();

    List<Category> getAllCategories();
}
