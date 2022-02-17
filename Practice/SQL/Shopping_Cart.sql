/*Here for testing reasons*/
DROP TABLE IF EXISTS `shoppingcart`;
/* Create the table*/
CREATE TABLE `shoppingcart` (
	`cartNumber` INT(11) NOT NULL AUTO_INCREMENT,
	`customerNumber` INT(11) NOT NULL,
	`productCodE` VARCHAR(50) NOT NULL,
	`qty` INT(11) NOT NULL,
	PRIMARY KEY (`cartNumber`),
	KEY `INDEX` (`customerNumber`,`productCode`),
	CONSTRAINT `fk_customerNumber` FOREIGN KEY (`customerNumber`) REFERENCES `customers`(`customerNumber`),
	CONSTRAINT `fk_productCode` FOREIGN KEY (`productCode`) REFERENCES `products` (`productCode`)
) ENGINE = INNODB;

/*Insert test data into table, the cartNumber will automatically populate*/
INSERT INTO `shoppingcart`(`customerNumber`,`productCode`,`qty`) VALUES
	(103,'S10_1949',22);