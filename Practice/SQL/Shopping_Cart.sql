/*Here FOR testing reasons*/
DROP TABLE IF EXISTS `shopping cart`;
/* Create the table*/
CREATE TABLE `shopping cart` (
	`cart_id` INT(11) NOT NULL AUTO_INCREMENT,
	`product_name` VARCHAR(255) NOT NULL,
	`qty` INT(11) NOT NULL,
	`customer_id` INT(11) NOT NULL,
	PRIMARY KEY (`cart_id`),
	CONSTRAINT `fk_customer_id`
		FOREIGN KEY (`customer_id`)
		REFERENCES `customers` (`customerNumber`),
	CONSTRAINT `fk_product_name`
		FOREIGN KEY (`product_name`) REFERENCES `products` (`productName`)
);
