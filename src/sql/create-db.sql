DROP SCHEMA IF EXISTS `employees`;

CREATE SCHEMA `employees`;

use `employees`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `address`;

CREATE TABLE IF NOT EXISTS `employees`.`address` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `street` VARCHAR(25) NULL DEFAULT NULL,
  `street_number` VARCHAR(25) NULL DEFAULT NULL,
  `address_index` VARCHAR(7) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (`id` INT(11) NOT NULL AUTO_INCREMENT,
  `emp_type` VARCHAR(5) NULL DEFAULT NULL,
  `first_name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `programming_language` VARCHAR(45) NULL DEFAULT NULL,
  `hobby` VARCHAR(45) NULL DEFAULT NULL,
  `address_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_ADDRESS_idx` (`address_id` ASC) VISIBLE,
  CONSTRAINT `FK_ADDRESS`
    FOREIGN KEY (`address_id`)
    REFERENCES `employees`.`address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;