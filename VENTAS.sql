CREATE DATABASE ventas;
use ventas;

CREATE TABLE usuario(
	user_name 	VARCHAR(30),
	user_login  VARCHAR(30),
	user_password VARCHAR(9),
	PRIMARY KEY (user_login) 
);

INSERT INTO usuario (user_name, user_login, user_password) VALUES ('Administrador','admin','123');