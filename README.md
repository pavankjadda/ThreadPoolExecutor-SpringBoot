# Synchronous and Asynchronous Data access using ThreadPoolExecutor and Spring Boot, Spring Data
Synchronous and Asynchronous Data access using ThreadPoolExecutor and Spring Boot, Spring Data

### How to run?
1. Create `threadpooldemo` database in MySql database
2. Run the project and it will create **Employee** table and also inserts data using following commands
```
INSERT INTO `threadpooldemo`.`employee` (`id`, `email`, `first_name`, `last_name`, `phone`) VALUES ('1', 'john.doe@hj.com', 'John', 'Doe', '233323');
INSERT INTO `threadpooldemo`.`employee` (`id`, `email`, `first_name`, `last_name`, `phone`) VALUES ('2', 'jack@hj.com', 'Jack', 'Doe', '09094044');

```
3.Go to http://localhost:8080/api/v1/employee/list to see all categories 
