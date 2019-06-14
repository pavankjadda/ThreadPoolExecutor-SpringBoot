package com.pj.springdatademo.repo;

import com.pj.springdatademo.model.Category;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryCustomImpl implements CategoryRepositoryCustom
{
    private final EntityManager entityManager;
    private final ModelMapper modelMapper;

    public CategoryRepositoryCustomImpl(EntityManager entityManager, ModelMapper modelMapper)
    {
        this.entityManager = entityManager;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Category> getAllCategoriesThroughStoredProcedure()
    {
        List<Category> categories=new ArrayList<>();
        StoredProcedureQuery storedProcedureQuery=entityManager.createNamedStoredProcedureQuery("getAllCategoriesThroughStoredProcedure");
        List<?> categoriesResult=storedProcedureQuery.getResultList();

        categoriesResult.forEach(category -> categories.add(modelMapper.map(category, Category.class)));
        return categories;
    }
}
