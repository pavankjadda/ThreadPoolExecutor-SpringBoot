
# Errors

1. When I use name with @Procedure annotation, I get following error during compilation
```java
@Procedure(name="getAllCategoriesThroughStoredProcedure")
    List<Category> getAllCategoriesThroughStoredProcedure();
```
**Error Message**:
```
Caused by: org.springframework.data.mapping.PropertyReferenceException: No property getAllCategoriesThroughStoredProcedure found for type Category!
```

2.When I change it back to the following, program complies but fails when I access API 
```java
   @Procedure(procedureName="get_all_categories")
    List<Category> getAllCategoriesThroughStoredProcedure();
```
**Error Message**:
```
nested exception is org.springframework.dao.InvalidDataAccessApiUsageException: Type cannot be null; nested exception is java.lang.IllegalArgumentException: Type cannot be null] with root cause
```
