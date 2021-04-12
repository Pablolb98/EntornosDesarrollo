SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Cursan;
DROP TABLE IF EXISTS Hacen;
DROP TABLE IF EXISTS Realizan;
DROP TABLE IF EXISTS ALUMNOS;
DROP TABLE IF EXISTS Imparten;
DROP TABLE IF EXISTS Asignaturas;
DROP TABLE IF EXISTS Elaboran;
DROP TABLE IF EXISTS Examenes;
DROP TABLE IF EXISTS Practica;
DROP TABLE IF EXISTS Profesores;




/* Create Tables */

CREATE TABLE ALUMNOS
(
	Num_Alu  NOT NULL,
	Nombre ,
	Grupo ,
	PRIMARY KEY (Num_Alu)
);


CREATE TABLE Asignaturas
(
	Num_Asi  NOT NULL,
	Nombre ,
	PRIMARY KEY (Num_Asi)
);


CREATE TABLE Cursan
(
	Num_Asi  NOT NULL,
	Num_Alu  NOT NULL,
	Trimestre 
);


CREATE TABLE Elaboran
(
	Cod_Practica  NOT NULL,
	Num_Prof  NOT NULL,
	Fecha 
);


CREATE TABLE Examenes
(
	Num_Ex  NOT NULL,
	NPreguntas ,
	Fecha ,
	PRIMARY KEY (Num_Ex)
);


CREATE TABLE Hacen
(
	Num_Alu  NOT NULL,
	Num_Ex  NOT NULL,
	nota 
);


CREATE TABLE Imparten
(
	Num_Prof  NOT NULL,
	Num_Asi  NOT NULL
);


CREATE TABLE Practica
(
	Cod_Practica  NOT NULL,
	titulo ,
	nivel ,
	PRIMARY KEY (Cod_Practica)
);


CREATE TABLE Profesores
(
	Num_Prof  NOT NULL,
	Nombre ,
	PRIMARY KEY (Num_Prof)
);


CREATE TABLE Realizan
(
	Num_Alu  NOT NULL,
	Cod_Practica  NOT NULL,
	Fecha ,
	Nota 
);



/* Create Foreign Keys */

ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_Alu)
	REFERENCES ALUMNOS (Num_Alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_Alu)
	REFERENCES ALUMNOS (Num_Alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Num_Alu)
	REFERENCES ALUMNOS (Num_Alu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_Asi)
	REFERENCES Asignaturas (Num_Asi)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Imparten
	ADD FOREIGN KEY (Num_Asi)
	REFERENCES Asignaturas (Num_Asi)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_Ex)
	REFERENCES Examenes (Num_Ex)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Cod_Practica)
	REFERENCES Practica (Cod_Practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Cod_Practica)
	REFERENCES Practica (Cod_Practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES Profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Imparten
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES Profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



