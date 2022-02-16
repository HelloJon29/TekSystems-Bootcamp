/*Here for testing reasons*/
DROP TABLE IF EXISTS `shoppingcart`;
/* Create the table*/
CREATE TABLE `shoppingcart` (
	`cart_id` INT(11) NOT NULL AUTO_INCREMENT,
	`product` VARCHAR(255) NOT NULL,
	`qty` INT(11) NOT NULL,
	`customer_id` INT(11) NOT NULL,
	PRIMARY KEY (`cart_id`),
	CONSTRAINT `fk_customer_id`
		FOREIGN KEY (`customer_id`)
		REFERENCES `customers` (`customerNumber`),
	CONSTRAINT `fk_product`
		FOREIGN KEY (`product`) 
		REFERENCES `products` (`productCODE`)
);
