CREATE DATABASE ventas;
use ventas;

CREATE TABLE usuario(
	user_name 	VARCHAR(30),
	user_login  VARCHAR(30),
	user_password VARCHAR(9),
	PRIMARY KEY (user_login) 
);