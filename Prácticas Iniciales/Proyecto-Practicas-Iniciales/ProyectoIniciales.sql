
CREATE DATABASE PracIni; 
Use PracIni; 

ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '123456789';
flush privileges;

CREATE TABLE Usuario (
  Carnet INT NOT NULL,
  Nombres VARCHAR(45) NOT NULL,
  Apellidos VARCHAR(45) NOT NULL,
  constrasenia VARCHAR(25) NOT NULL,
  correo VARCHAR(50) NOT NULL,
  PRIMARY KEY (Carnet));
  
  DROP TABLE Usuario;
  select * from Usuario;
  
CREATE TABLE Curso (
  idCurso INT NOT NULL,
  Nombre VARCHAR(75) NOT NULL,
  PRIMARY KEY (idCurso));
  
  DROP TABLE Curso;
  
CREATE TABLE PensumSistemas (
  idCursoSistema INT NOT NULL AUTO_INCREMENT,
  idCurso INT NOT NULL,
  Creditos INT NOT NULL,
  Semestre INT NOT NULL,
  PRIMARY KEY (idCursoSistema),
  INDEX (idCurso),
    FOREIGN KEY (idCurso)
    REFERENCES Curso (idCurso));
    
      DROP TABLE PensumSistemas;
    
CREATE TABLE CursosAprobados (
  Carnet INT NOT NULL,
  idCursoSistema INT NOT NULL,
  Nota INT NULL,
  PRIMARY KEY (Carnet, idCursoSistema),
  INDEX (Carnet),
  INDEX (idCursoSistema),
    FOREIGN KEY (Carnet)
    REFERENCES Usuario (Carnet),
    FOREIGN KEY (idCursoSistema)
    REFERENCES PensumSistemas (idCursoSistema)
    );
    
    DROP TABLE CursosAprobados;

CREATE TABLE Catedratico (
  idCatedratico INT NOT NULL AUTO_INCREMENT,
  Nombres VARCHAR(45) NOT NULL,
  Apellidos VARCHAR(45) NOT NULL,
  Tipo CHAR(1) NOT NULL,
  PRIMARY KEY (idCatedratico));
  
  DROP TABLE Catedratico;
  
CREATE TABLE Catedratico_en_Curso (
  idCatedraticoCurso INT NOT NULL AUTO_INCREMENT,
  idCurso INT NOT NULL,
  idCatedratico INT NOT NULL,
  PRIMARY KEY (idCatedraticoCurso),
  INDEX (idCurso),
  INDEX (idCatedratico),
    FOREIGN KEY (idCurso)
    REFERENCES Curso (idCurso),
    FOREIGN KEY (idCatedratico)
    REFERENCES Catedratico (idCatedratico)
    );
    DROP TABLE Catedratico_en_Curso;
    
CREATE TABLE Publicacion (
  idPublicacion INT NOT NULL AUTO_INCREMENT,
  Mensaje VARCHAR(150) NOT NULL,
  Carnet INT NOT NULL,
  fecha DATE NULL,
  idCatedraticoCurso INT NULL,
  idCurso INT NULL,
  idCatedratico INT NULL,
  Tipo INT NOT NULL,
  PRIMARY KEY (idPublicacion),
  INDEX (idCatedraticoCurso),
  INDEX (idCurso),
  INDEX (idCatedratico),
  INDEX (Carnet),
	FOREIGN KEY (idCatedraticoCurso)
    REFERENCES Catedratico_en_Curso (idCatedraticoCurso),
    FOREIGN KEY (idCurso)
    REFERENCES Curso (idCurso),
    FOREIGN KEY (idCatedratico)
    REFERENCES Catedratico (idCatedratico),
    FOREIGN KEY (Carnet)
    REFERENCES Usuario (Carnet)
    );
    
    DROP TABLE Publicacion;
    select * from Publicacion;
  
CREATE TABLE Comentario (
  idComentario INT NOT NULL AUTO_INCREMENT,
  Comentario VARCHAR(150) NOT NULL,
  idPublicacion INT NOT NULL,
  Carnet INT NOT NULL,
  PRIMARY KEY (idComentario),
  INDEX (idPublicacion),
  INDEX (Carnet),
    FOREIGN KEY (idPublicacion)
    REFERENCES Publicacion (idPublicacion),
    FOREIGN KEY (Carnet)
    REFERENCES Usuario (Carnet)
    );
    
    select * from comentario;
    DROP TABLE Comentario;
    
CREATE TABLE TempoCSV (
	NombreCurso VARCHAR(75) NOT NULL,
  catapellido VARCHAR(45) NOT NULL,
  catnombre VARCHAR(45) NOT NULL,
  auxapellido VARCHAR(45) NOT NULL,
  auxnombre VARCHAR(45) NOT NULL,
  cod INT NOT NULL,
  indice INT NOT NULL);
  
  DROP TABLE TempoCSV;
  SELECT * FROM TempoCSV;
  SELECT count(*) FROM TempoCSV;
  
/*insertando datos de catedraticos*/

/*insertando datos a cuso*/
SELECT * FROM Curso;
SELECT count(*) FROM Curso;
/*36*/

INSERT INTO Curso (idCurso, Nombre)
SELECT distinct cod, NombreCurso FROM TempoCSV order by cod asc;

SELECT * FROM Catedratico;
SELECT count(*) FROM Catedratico where tipo = 'C';
/*47*/
SELECT count(*) FROM Catedratico  where tipo = 'A';

INSERT INTO Catedratico (Nombres, Apellidos, Tipo)
SELECT distinct catnombre, catapellido, 'C' FROM TempoCSV order by catapellido asc;

INSERT INTO Catedratico (Nombres, Apellidos, Tipo)
SELECT distinct auxnombre, auxapellido, 'A' FROM TempoCSV order by auxapellido asc;

SELECT * FROM Catedratico_en_Curso;
SELECT * FROM Catedratico where tipo = 'A';
SELECT count(*) FROM Catedratico_en_Curso;
  
INSERT INTO Catedratico_en_Curso (idCurso, idCatedratico)
SELECT distinct cod, /*catnombre, catapellido,*/
(SELECT Catedratico.idCatedratico
FROM Catedratico WHERE
Catedratico.Nombres = TempoCSV.catnombre and
Catedratico.Apellidos = TempoCSV.catapellido and
tipo = 'C'
) as idcate
FROM TempoCSV order by cod asc;

INSERT INTO Catedratico_en_Curso (idCurso, idCatedratico)
SELECT distinct cod, /*catnombre, catapellido,*/
(SELECT Catedratico.idCatedratico
FROM Catedratico WHERE
Catedratico.Nombres = TempoCSV.auxnombre and
Catedratico.Apellidos = TempoCSV.auxapellido and
tipo = 'A'
) as idaux
FROM TempoCSV order by cod asc;


SELECT * FROM PensumSistemas;
SELECT count(*) FROM PensumSistemas;
  