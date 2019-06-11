
# Errors

1. When I use `name` with `@Procedure` annotation, I get following error 
```java
@Procedure(name="Category.getAllCategoriesThroughStoredProcedure")
    List<Category> getAllCategoriesThroughStoredProcedure();
```
**Error Message**:
```
nested exception is org.springframework.dao.InvalidDataAccessApiUsageException: Type cannot be null; nested exception is java.lang.IllegalArgumentException: Type cannot be null] with root cause```
```

2.When I change it back to the `procedureName`, I get same error
```java
   @Procedure(procedureName="get_all_categories")
    List<Category> getAllCategoriesThroughStoredProcedure();
```
**Error Message**:
```
nested exception is org.springframework.dao.InvalidDataAccessApiUsageException: Type cannot be null; nested exception is java.lang.IllegalArgumentException: Type cannot be null] with root cause
```
