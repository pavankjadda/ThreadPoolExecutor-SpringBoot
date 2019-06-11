package com.pj.springdatademo.web;

import com.pj.springdatademo.model.Category;
import com.pj.springdatademo.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
        return categoryRepository.getAllCategoriesThroughStoredProcedure();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Category> findCategoryById(@PathVariable Long id,HttpServletRequest request)
    {
        Optional<Category> categoryOptional=categoryRepository.findById(id);
        if(categoryOptional.isPresent())
        {
            return new ResponseEntity<>(categoryOptional.get(), new HttpHeaders(), HttpStatus.OK);
        }
        throw new GenericException(" Category with id:"+id+" is not Found","",HttpStatus.NOT_FOUND,
                LocalDateTime.now(),null,request.getRequestURI());
    }

    @PostMapping(value = "/create")
    public Category createNewCategory(@RequestBody CategoryDTO categoryDTO)
    {
        Category category=modelMapper.map(categoryDTO,Category.class);
        return categoryRepository.saveAndFlush(category);
    }

    @PutMapping(value = "/update")
    public Category updateCategory(@RequestBody CategoryDTO categoryDTO, HttpServletRequest request)
    {
        Category category=modelMapper.map(categoryDTO,Category.class);
        if(categoryRepository.findById(category.getId()).isPresent())
        {
            return categoryRepository.saveAndFlush(category);

        }
        throw new GenericException("Failed to update the Category. Category with id:"+category.getId()+" is not Found","",HttpStatus.NOT_FOUND,
                LocalDateTime.now(),null,request.getRequestURI());
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteCategoryById(@PathVariable Long id, HttpServletRequest request)
    {
        if(categoryRepository.findById(id).isPresent())
        {
            categoryRepository.deleteById(id);
        }
        throw new GenericException("Failed to delete the Category. Category with id:"+id+" is not Found","",HttpStatus.NOT_FOUND,
                LocalDateTime.now(),null,request.getRequestURI());
    }
}
