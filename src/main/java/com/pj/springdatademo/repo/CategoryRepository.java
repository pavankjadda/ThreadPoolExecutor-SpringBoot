package com.pj.springdatademo.repo;

import com.pj.springdatademo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long>
{
/*    @Procedure(name="getAllCategoriesThroughStoredProcedure")
    List<Category> getAllCategoriesThroughStoredProcedure();*/

    @Query(value = "CALL get_all_categories;",nativeQuery = true)
    List<Category> getAllCategoriesThroughStoredProcedure();

}
