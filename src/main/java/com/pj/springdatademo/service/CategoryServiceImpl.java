package com.pj.springdatademo.service;

import com.pj.springdatademo.model.Category;
import com.pj.springdatademo.repo.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{
    private final CategoryRepository categoryRepository;
    private final ThreadPoolExecutorUtil threadPoolExecutorUtil;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ThreadPoolExecutorUtil threadPoolExecutorUtil)
    {
        this.categoryRepository = categoryRepository;
        this.threadPoolExecutorUtil = threadPoolExecutorUtil;
    }

    @Override
    public List<Category> getAllCategoriesAsync()
    {
        for (int i=0;i<10000;i++)
        {
            Task task=new Task(categoryRepository);
            threadPoolExecutorUtil.executeTask(task);
        }
        Task task=new Task(categoryRepository);
        threadPoolExecutorUtil.executeTask(task);

        return task.categories;
    }

    @Override
    public List<Category> getAllCategories()
    {
        return categoryRepository.getAllCategoriesThroughStoredProcedure();
    }
}
