CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `employee` VALUES 
	(1,'Michael','Scott','prisonmike@dm.com'),
	(2,'Jim','Halpert','jimhalpert@dm.com'),
	(3,'Creed','Bratton','creedbratton@dm.com'),
	(4,'Dwight','Schrute','dwightschrute@dm.com'),
	(5,'Stanley','Hudson','stanleyhudson@dm.com');

