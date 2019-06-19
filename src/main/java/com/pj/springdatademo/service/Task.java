package com.pj.springdatademo.service;

import com.pj.springdatademo.model.Category;
import com.pj.springdatademo.repo.CategoryRepository;

import java.util.List;

public class Task implements Runnable
{
    private final CategoryRepository categoryRepository;
    List<Category> categories;

    Task(CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run()
    {
        categories=categoryRepository.getAllCategoriesThroughStoredProcedure();
    }
}
