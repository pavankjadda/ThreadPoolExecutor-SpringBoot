package com.pj.springdatademo.repo;

import com.pj.springdatademo.model.Category;

import java.util.List;

public interface CategoryRepositoryCustom
{
    List<Category> getAllCategoriesThroughStoredProcedure();
}
