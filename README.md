# SpringDataDemo
Spring Data Demo project created to showcase bug in Spring Data JPA 

### How to run?
1. Create `springdatademo` database in MySql database
2. Run the project and it will create **Category** table and also inserts data using following commands
```
INSERT INTO `springdatademo`.`category` (`id`, `description`, `name`) VALUES ('1001', 'Books', 'Books');
INSERT INTO `springdatademo`.`category` (`id`, `description`, `name`) VALUES ('1002', 'Electronics', 'Electronics');

```
3.Create stored procedure named `get_all_categories` in database
   ```
   DELIMITER $$
   CREATE DEFINER=`root`@`localhost` PROCEDURE `get_all_categories`()
   BEGIN
   	select * from category;
   END$$
   DELIMITER ;
   
   ``` 

4.Go to http://localhost:8080/api/v1/category/list to see all categories 
