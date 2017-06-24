CREATE TABLE `spring_bd`.`camiseta` ( 
	`id` INT(10) NOT NULL AUTO_INCREMENT, 
	`numero` INT(10) NULL , 
	`id_marca` INT(10) NULL , 
	PRIMARY KEY (`id`) 
	ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_spanish2_ci;

CREATE TABLE `spring_bd`.`equipo` ( 
	`id` INT(10) NOT NULL AUTO_INCREMENT , 
	`nombre` VARCHAR(250) NULL , 
	PRIMARY KEY (`id`) 
	ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_spanish2_ci;