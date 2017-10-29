CREATE DATABASE controldeestudio;
use controldeestudio;

CREATE TABLE estudiante(
	nombre 	VARCHAR(30),
	apellido VARCHAR(30),
	edad INT,
	sexo CHAR,
	fecha_nacimiento DATE,
	semestre INT,
	numEstudiante VARCHAR(4),
	materias BLOB,
	carrera VARCHAR(30),
	PRIMARY KEY (numEstudiante) 
);

CREATE TABLE profesor(
	nombre 	VARCHAR(30),
	apellido VARCHAR(30),
	edad INT,
	sexo CHAR,
	fecha_nacimiento DATE,
	carrera VARCHAR(30),
	codigo VARCHAR(4),
	materias BLOB,
	titulo VARCHAR(30),
	PRIMARY KEY (codigo) 
);

CREATE TABLE materia(
	nombreMATERIA VARCHAR(30),
	semestre INT,
	codigo VARCHAR(4),
	profesor VARCHAR(30),
	carrera VARCHAR(30),
	PRIMARY KEY (codigo)

); 

CREATE TABLE nota(
	notas FLOAT,
	NumeroSemestre VARCHAR(6),
	codigoMateria VARCHAR(4),
	codigoProfesor VARCHAR(4),
	codigoEstudiante VARCHAR(4),
	PRIMARY KEY (NumeroSemestre)

); 

INSERT INTO estudiante (nombre, apellido, edad, sexo, fecha_nacimiento, semestre, numEstudiante, materias, carrera) VALUES ('Vanessa','Cruz',23,'F','1994-04-15',8,'VCCB', 'Web, FOC', 'Computacion');

INSERT INTO estudiante (nombre, apellido, edad, sexo, fecha_nacimiento, semestre, numEstudiante, materias, carrera) VALUES ('Carlos','Arias',21,'M','1996-01-15',7,'CEAG', 'Web, Electiva I, Android', 'Computacion');

INSERT INTO profesor (nombre, apellido, edad, sexo, fecha_nacimiento, carrera, codigo, materias, titulo) VALUES ('Mirella','Herrera',41,'F','1976-02-10','Computacion','MMHH', 'Web, Electiva I, Android', 'Doctora en Computacion');

INSERT INTO profesor (nombre, apellido, edad, sexo, fecha_nacimiento, carrera, codigo, materias, titulo) VALUES ('Carlos','Florio',27,'M','1990-04-10','Computacion','CCFF', 'FOC', 'Licenciado en Ciencias de la Computacion');

INSERT INTO materia(nombreMATERIA, semestre, codigo, profesor, carrera) VALUES ('Web', 8, 'CAO1', 'Mirella Herrera', 'Computacion');

INSERT INTO materia(nombreMATERIA, semestre, codigo, profesor, carrera) VALUES ('FOC', 8, 'CAO2', 'Carlos Florio', 'Computacion');

INSERT INTO materia(nombreMATERIA, semestre, codigo, profesor, carrera) VALUES ('Android', 8, 'CAO3', 'Mirella Herrera', 'Computacion');

INSERT INTO materia(nombreMATERIA, semestre, codigo, profesor, carrera) VALUES ('Electiva I', 8, 'CAO4', 'Mirella Herrera', 'Computacion');


INSERT INTO nota(notas, NumeroSemestre, codigoMateria, codigoProfesor, codigoEstudiante) VALUES (18.95,'2-2016','CAO1','MMHH', 'VCCB');

INSERT INTO nota(notas, NumeroSemestre, codigoMateria, codigoProfesor, codigoEstudiante) VALUES (17.54,'1-2016','CAO4','MMHH', 'CEAG');

SELECT * FROM estudiante;
SELECT * FROM profesor;
SELECT * FROM materia;
SELECT * FROM nota;