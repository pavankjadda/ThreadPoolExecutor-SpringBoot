# SpringDataDemo
Spring Data Demo project created to showcase bug in Spring Data JPA 

### How to run?
1. Create `springdatademo` database in MySql database
2. Create stored procedure named `get_all_categories` in database
```mysql
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_all_categories`()
BEGIN
	select * from category;
END$$
DELIMITER ;

```
3.Run the project and it will create **Category** table and also inserts data based on sql statements in `resources` folder 
4.Go to http://localhost:8080/api/v1/category/list to see all categories 
