DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_all_categories`()
BEGIN
    select * from category;
END$$
DELIMITER ;
