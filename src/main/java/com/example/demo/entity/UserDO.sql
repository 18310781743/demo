-- auto Generated on 2018-09-07
-- DROP TABLE IF EXISTS user;
CREATE TABLE user(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
	age INT (11) NOT NULL DEFAULT -1 COMMENT 'age',
	sex VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'sex',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';