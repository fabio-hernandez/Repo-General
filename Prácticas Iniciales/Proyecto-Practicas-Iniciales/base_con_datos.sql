-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: pracini
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `catedratico`
--

DROP TABLE IF EXISTS `catedratico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catedratico` (
  `idCatedratico` int NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Tipo` char(1) NOT NULL,
  PRIMARY KEY (`idCatedratico`)
) ENGINE=InnoDB AUTO_INCREMENT=191 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catedratico`
--

LOCK TABLES `catedratico` WRITE;
/*!40000 ALTER TABLE `catedratico` DISABLE KEYS */;
INSERT INTO `catedratico` VALUES (1,'MIRNA IVONNE','ALDANA LARRAZABAL','C'),(2,'LUDWING FEDERICO','ALTAN SAC ','C'),(3,'JORGE LUIS','ALVAREZ MEJIA','C'),(4,'LUIS ALBERTO','ARIAS','C'),(5,'FLORIZA FELIPA','AVILA PESQUERA DE MEDINILLA','C'),(6,'Cesar Rolando','Batz Saquimux','C'),(7,'MARIO JOSE','BAUTISTA FUENTES','C'),(8,'NEFTALI DE JESUS','CALDERON MENDEZ','C'),(9,'MIGUEL ANGEL','CANCINOS RENDON','C'),(10,'MANUEL HAROLDO','CASTILLO REYNA ','C'),(11,'GABRIEL ALEJANDRO','DIAS LOPEZ','C'),(12,'JUAN ALVARO','DIAZ ARDAVIN ','C'),(13,'WILLIAM ESTUARDO','ESCOBAR ARGUETA','C'),(14,'OTTO RENE','ESCOBAR LEIVA','C'),(15,'LUIS FERNANDO','ESPINO BARRIOS','C'),(16,'CESAR AUGUSTO','FERNANDEZ CACERES','C'),(17,'SERGIO LEONEL','GOMEZ BRAVO','C'),(18,'WILLIAM SAMUEL','GUEVARA ORELLANA','C'),(19,'Jesús Alberto','Guzmán','C'),(20,'ALVARO OBRAYAN','HERNANDEZ GARCIA','C'),(21,'PEDRO PABLO','HERNANDEZ RAMIREZ','C'),(22,'Kevin Adiel','Lajpop Ajpacajá','C'),(23,'ALVARO GIOVANNI','LONGO MORALES','C'),(24,'MANUEL FERNANDO','LOPEZ FERNANDEZ','C'),(25,'BAYRON WOSVELY','LOPEZ LOPEZ','C'),(26,'EVEREST DARWIN','MEDINILLA RODRIGUEZ','C'),(27,'SERGIO ARNALDO','MENDEZ AGUILAR','C'),(28,'GUIPPSY JEANNIRA','MENENDEZ PEREZ','C'),(29,'JOSE RICARDO','MORALES PRADO','C'),(30,'EVELYN CAROLINA','MORALES RUIZ ','C'),(31,'Erick Carlos Roberto','Navarro Delgado','C'),(32,'MARLON FRANCISCO','ORELLANA LOPEZ ','C'),(33,'OSCAR ALEJANDRO','PAZ CAMPOS','C'),(34,'Marlon Antonio','Pérez Türk','C'),(35,'ILEANA GUISELA','RALDA RECINOS DE ILLESCAS','C'),(36,'OTTO AMILCAR','RODRIGUEZ ACOSTA','C'),(37,'CLAUDIA LICETH','ROJAS MORALES','C'),(38,'JOSE MANUEL','RUIZ JUAREZ ','C'),(39,'EDGAR RUBEN','SABAN RAXON','C'),(40,'JOSE ANIBAL','SILVA DE LOS ANGELES','C'),(41,'STAFF','STAFF','C'),(42,'VIRGINIA VICTORIA','TALA AYERDI ','C'),(43,'MOISES EDUARDO','VELASQUEZ OLIVA','C'),(44,'HERMAN IGOR','VELIZ LINARES','C'),(45,'LUIS ALBERTO','VETTORAZZI ESPANA','C'),(46,'Edwin Estuardo','Zapeta Gómez','C'),(47,'BYRON RODOLFO','ZEPEDA AREVALO','C'),(64,'Douglas Daniel','Aguilar Cuque','A'),(65,'David Andrés','Alvarado Castellanos','A'),(66,'Cristian David','Alvarado López','A'),(67,'José Augusto','Alvarez Morán','A'),(68,'Ruth Nohemy','Ardón Lechuga','A'),(69,'Herberth Josué','Argueta Aragón','A'),(70,'Haroldo Pablo','Arias Molina','A'),(71,'Carlos Andree','Avalos Soto','A'),(72,'Bayron Romeo','Axpuac Yoc','A'),(73,'José Carlos','Bautista Mazariegos','A'),(74,'Ariel Alejandro','Bautista Méndez','A'),(75,'Diego Josue','Berrios Gutierrez','A'),(76,'Javier Alberto','Cabrera Puente','A'),(77,'Carlos Enrique','Canté López','A'),(78,'Jonnathan Antonio','Castillo Avendaño','A'),(79,'Julio Antonio','Chaicoj Cotzojay','A'),(80,'Oscar Ariel','Corleto Soto','A'),(81,'Astrid Ileana','Cortéz Bendfeldt','A'),(82,'Breynner Miguel','Cortez Sic','A'),(83,'Kevin Ariel','Cruz Ortiz','A'),(84,'Kevin Alberto','de León Secay','A'),(85,'Kevin Eduardo','Estrada Martínez','A'),(86,'Erik Gerardo','Flores Díaz','A'),(87,'Eder Yafeth','Garcia Quiroa','A'),(88,'Carlos Giovani','Gil Chacón','A'),(89,'Darwin Dodany','Girón Reyes','A'),(90,'Huriel Uvaldo','Gómez Gómez','A'),(91,'Jorge Mario','Gutierrez Ovando','A'),(92,'Erick Fernando','Hernández Arroyo','A'),(93,'Carlos Luis Pablo','Hernández Gramajo','A'),(94,'Fernando','Hernández Juárez','A'),(95,'Pablo Andrés','Hernández Rivera','A'),(96,'Mauro Alejandro','Herrera Castro','A'),(97,'Carlos Roberto','Jiménez Pérez','A'),(98,'Juan Pablo','Juárez López','A'),(99,'Juan Luis','Landaverde González','A'),(100,'Sergio Geovany','Leal Cardona','A'),(101,'Andrea María','López Flores','A'),(102,'Luis Alejandro','López López','A'),(103,'Marvin Ronaldo','Martínez Marroquín','A'),(104,'Dennis Alejandro','Masaya Nájera','A'),(105,'Luis Fernando','Mazariegos de León','A'),(106,'Kevin Oswaldo','Mejía Lemus','A'),(107,'Juan Raul','Mendizábal Rabanales','A'),(108,'Ricardo Antonio','Menéndez Tobías','A'),(109,'Cristian Esteban','Moino Rodriguez','A'),(110,'Andrés Alejandro','Montúfar Cordero','A'),(111,'Luis Manuel','Morales López','A'),(112,'Tanya Beatriz','Muhun Recinos','A'),(113,'Fernando José','Paz González','A'),(114,'Fernando Arturo','Pensamiento Calderón','A'),(115,'Ingrid Rossana','Pérez Mena','A'),(116,'Hilbert Josué','Perucho Ramírez','A'),(117,'José Francisco','Puac Ixcamparic','A'),(118,'Fredy José','Ramírez Sandoval','A'),(119,'Jorge Mario','Recinos Dieguez','A'),(120,'Susel Eugenia','Retana Arriola','A'),(121,'Herbert Rafael','Reyes Portillo','A'),(122,'Fernando Vidal','Ruiz Piox','A'),(123,'Sebastián','Sánchez Túchez','A'),(124,'Brayan Ezequiel','Santiago Brito','A'),(125,'Brandon Javier','Soto Castañeda','A'),(126,'Carlos Eduardo','Torres Caal','A'),(127,'Danilo','Urías Coc','A'),(128,'Luis Angel','Vargas León','A'),(129,'Jorge Mauricio','Vásquez Cos','A'),(130,'Pavel Alexander','Vásquez Flores','A'),(131,'Franklin Estuardo','Velásquez Fuentes','A'),(132,'José Manuel','Véliz Sandoval','A'),(133,'Andrea Nicte','Vicente Campos','A');
/*!40000 ALTER TABLE `catedratico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catedratico_en_curso`
--

DROP TABLE IF EXISTS `catedratico_en_curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catedratico_en_curso` (
  `idCatedraticoCurso` int NOT NULL AUTO_INCREMENT,
  `idCurso` int NOT NULL,
  `idCatedratico` int NOT NULL,
  PRIMARY KEY (`idCatedraticoCurso`),
  KEY `idCurso` (`idCurso`),
  KEY `idCatedratico` (`idCatedratico`),
  CONSTRAINT `catedratico_en_curso_ibfk_1` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`),
  CONSTRAINT `catedratico_en_curso_ibfk_2` FOREIGN KEY (`idCatedratico`) REFERENCES `catedratico` (`idCatedratico`)
) ENGINE=InnoDB AUTO_INCREMENT=191 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catedratico_en_curso`
--

LOCK TABLES `catedratico_en_curso` WRITE;
/*!40000 ALTER TABLE `catedratico_en_curso` DISABLE KEYS */;
INSERT INTO `catedratico_en_curso` VALUES (1,14,30),(2,14,35),(3,90,44),(4,92,40),(5,92,44),(6,281,27),(7,281,41),(8,283,29),(9,285,6),(10,667,28),(11,667,41),(12,667,44),(13,720,16),(14,722,3),(15,724,3),(16,729,9),(17,770,8),(18,770,32),(19,770,43),(20,770,44),(21,770,47),(22,771,13),(23,771,34),(24,771,37),(25,771,38),(26,771,46),(27,772,15),(28,772,19),(29,772,20),(30,773,12),(31,773,33),(32,774,15),(33,774,36),(34,775,4),(35,775,23),(36,777,7),(37,777,10),(38,777,22),(39,778,14),(40,779,11),(41,780,26),(42,781,25),(43,781,31),(44,781,39),(45,785,1),(46,785,18),(47,786,46),(48,787,45),(49,790,2),(50,795,5),(51,795,42),(52,796,36),(53,796,41),(54,797,24),(55,798,45),(56,964,14),(57,970,21),(58,972,15),(59,975,24),(60,2025,17),(61,2036,5),(64,14,87),(65,14,106),(66,14,118),(67,90,70),(68,90,119),(69,92,68),(70,92,80),(71,92,88),(72,92,133),(73,281,65),(74,281,123),(75,283,107),(76,285,131),(77,667,79),(78,667,126),(79,720,124),(80,722,85),(81,724,73),(82,729,129),(83,770,74),(84,770,95),(85,770,97),(86,770,115),(87,770,121),(88,771,83),(89,771,96),(90,771,98),(91,771,101),(92,771,112),(93,772,71),(94,772,99),(95,772,103),(96,773,93),(97,773,128),(98,774,78),(99,774,116),(100,775,81),(101,775,102),(102,777,90),(103,777,105),(104,777,113),(105,777,117),(106,778,69),(107,778,120),(108,779,77),(109,780,67),(110,781,66),(111,781,86),(112,781,130),(113,785,89),(114,785,125),(115,786,72),(116,787,84),(117,787,109),(118,790,81),(119,795,92),(120,795,114),(121,795,122),(122,796,76),(123,796,111),(124,796,127),(125,796,132),(126,797,94),(127,798,82),(128,964,75),(129,964,108),(130,970,110),(131,972,91),(132,975,104),(133,2025,100),(134,2036,64);
/*!40000 ALTER TABLE `catedratico_en_curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentario`
--

DROP TABLE IF EXISTS `comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentario` (
  `idComentario` int NOT NULL AUTO_INCREMENT,
  `Comentario` varchar(150) NOT NULL,
  `idPublicacion` int NOT NULL,
  `Carnet` int NOT NULL,
  PRIMARY KEY (`idComentario`),
  KEY `idPublicacion` (`idPublicacion`),
  KEY `Carnet` (`Carnet`),
  CONSTRAINT `comentario_ibfk_1` FOREIGN KEY (`idPublicacion`) REFERENCES `publicacion` (`idPublicacion`),
  CONSTRAINT `comentario_ibfk_2` FOREIGN KEY (`Carnet`) REFERENCES `usuario` (`Carnet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentario`
--

LOCK TABLES `comentario` WRITE;
/*!40000 ALTER TABLE `comentario` DISABLE KEYS */;
/*!40000 ALTER TABLE `comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `idCurso` int NOT NULL,
  `Nombre` varchar(75) NOT NULL,
  PRIMARY KEY (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (14,'Economia'),(90,'Programación de Computadoras 1 090'),(92,'Programación de Computadoras 2'),(281,'Sistemas Operativos 1'),(283,'Analisis y Diseño de Sistemas 1'),(285,'Sistemas Operativos 2'),(667,'Programación Comercial 1'),(720,'Modelación y Simulación 2'),(722,'Teoria de Sistemas 1'),(724,'Teoria de Sistemas 2'),(729,'Modelacion y Simulación 1'),(770,'Introducción a la Programación y Computación 1'),(771,'Introducción a la Programación y Computación 2'),(772,'Estructura de Datos'),(773,'Manejo e Implementación de Archivos'),(774,'Bases de Datos 1'),(775,'Bases de Datos 2'),(777,'Organización Lenguajes y Compiladores 1'),(778,'Arquitectura de Computadoras y Ensambladores 1'),(779,'Arquitectura de Computadoras y Ensambladores 2'),(780,'Software Avanzado'),(781,'Organización de Lenguajes y Compiladores 2'),(785,'Analisis y Diseño de Sistemas 2'),(786,'Sistemas Organizaciones y Gerenciales 1'),(787,'Gerenciales 2'),(790,'Emprendedores de Negocios Informáticos'),(795,'Logica de Sistemas'),(796,'Lenguajes Formales y de Programación'),(797,'Seminario de Sistemas 1'),(798,'Seminario de Sistemas 2'),(964,'Organización Computacional'),(970,'Redes de computadoras 1'),(972,'Inteligencia Artificial 1'),(975,'Redes de Computadoras 2'),(2025,'Prácticas Iniciales'),(2036,'Prácticas Intermedias');
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursosaprobados`
--

DROP TABLE IF EXISTS `cursosaprobados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursosaprobados` (
  `Carnet` int NOT NULL,
  `idCursoSistema` int NOT NULL,
  `Nota` int DEFAULT NULL,
  PRIMARY KEY (`Carnet`,`idCursoSistema`),
  KEY `Carnet` (`Carnet`),
  KEY `idCursoSistema` (`idCursoSistema`),
  CONSTRAINT `cursosaprobados_ibfk_1` FOREIGN KEY (`Carnet`) REFERENCES `usuario` (`Carnet`),
  CONSTRAINT `cursosaprobados_ibfk_2` FOREIGN KEY (`idCursoSistema`) REFERENCES `pensumsistemas` (`idCursoSistema`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursosaprobados`
--

LOCK TABLES `cursosaprobados` WRITE;
/*!40000 ALTER TABLE `cursosaprobados` DISABLE KEYS */;
/*!40000 ALTER TABLE `cursosaprobados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pensumsistemas`
--

DROP TABLE IF EXISTS `pensumsistemas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pensumsistemas` (
  `idCursoSistema` int NOT NULL AUTO_INCREMENT,
  `idCurso` int NOT NULL,
  `Creditos` int NOT NULL,
  `Semestre` int NOT NULL,
  PRIMARY KEY (`idCursoSistema`),
  KEY `idCurso` (`idCurso`),
  CONSTRAINT `pensumsistemas_ibfk_1` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pensumsistemas`
--

LOCK TABLES `pensumsistemas` WRITE;
/*!40000 ALTER TABLE `pensumsistemas` DISABLE KEYS */;
INSERT INTO `pensumsistemas` VALUES (1,14,4,6),(2,90,3,0),(3,92,4,0),(4,281,5,7),(5,283,5,8),(6,285,4,8),(7,667,5,10),(8,720,5,10),(9,722,5,6),(10,724,5,7),(11,729,5,9),(12,770,4,3),(13,771,5,4),(14,772,5,5),(15,773,4,6),(16,774,5,7),(17,775,4,8),(18,777,4,5),(19,778,5,6),(20,779,4,7),(21,780,6,10),(22,781,5,6),(23,785,5,9),(24,786,4,9),(25,787,4,10),(26,790,4,10),(27,795,2,3),(28,796,3,4),(29,797,3,8),(30,798,3,9),(31,964,3,5),(32,970,4,7),(33,972,4,9),(34,975,4,8),(35,2025,0,4),(36,2036,0,7);
/*!40000 ALTER TABLE `pensumsistemas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publicacion`
--

DROP TABLE IF EXISTS `publicacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publicacion` (
  `idPublicacion` int NOT NULL AUTO_INCREMENT,
  `Mensaje` varchar(150) NOT NULL,
  `Carnet` int NOT NULL,
  `fecha` date DEFAULT NULL,
  `idCatedraticoCurso` int NULL,
  `idCurso` int NULL,
  `idCatedratico` int NULL,
  `Tipo` int NOT NULL,
  PRIMARY KEY (`idPublicacion`),
  KEY `idCatedraticoCurso` (`idCatedraticoCurso`),
  KEY `idCurso` (`idCurso`),
  KEY `idCatedratico` (`idCatedratico`),
  CONSTRAINT `publicacion_ibfk_1` FOREIGN KEY (`idCatedraticoCurso`) REFERENCES `catedratico_en_curso` (`idCatedraticoCurso`),
  CONSTRAINT `publicacion_ibfk_2` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`),
  CONSTRAINT `publicacion_ibfk_3` FOREIGN KEY (`idCatedratico`) REFERENCES `catedratico` (`idCatedratico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publicacion`
--

LOCK TABLES `publicacion` WRITE;
/*!40000 ALTER TABLE `publicacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `publicacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tempocsv`
--

DROP TABLE IF EXISTS `tempocsv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tempocsv` (
  `NombreCurso` varchar(75) NOT NULL,
  `catapellido` varchar(45) NOT NULL,
  `catnombre` varchar(45) NOT NULL,
  `auxapellido` varchar(45) NOT NULL,
  `auxnombre` varchar(45) NOT NULL,
  `cod` int NOT NULL,
  `indice` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tempocsv`
--

LOCK TABLES `tempocsv` WRITE;
/*!40000 ALTER TABLE `tempocsv` DISABLE KEYS */;
INSERT INTO `tempocsv` VALUES ('Analisis y Diseño de Sistemas 1','MORALES PRADO','JOSE RICARDO','Mendizábal Rabanales','Juan Raul',283,1),('Analisis y Diseño de Sistemas 2','GUEVARA ORELLANA','WILLIAM SAMUEL','Soto Castañeda','Brandon Javier',785,2),('Analisis y Diseño de Sistemas 2','ALDANA LARRAZABAL','MIRNA IVONNE','Girón Reyes','Darwin Dodany',785,3),('Arquitectura de Computadoras y Ensambladores 1','ESCOBAR LEIVA','OTTO RENE','Argueta Aragón','Herberth Josué',778,4),('Arquitectura de Computadoras y Ensambladores 1','ESCOBAR LEIVA','OTTO RENE','Retana Arriola','Susel Eugenia',778,5),('Arquitectura de Computadoras y Ensambladores 2','DIAS LOPEZ','GABRIEL ALEJANDRO','Canté López','Carlos Enrique',779,6),('Bases de Datos 1','RODRIGUEZ ACOSTA','OTTO AMILCAR','Perucho Ramírez','Hilbert Josué',774,7),('Bases de Datos 1','ESPINO BARRIOS','LUIS FERNANDO','Castillo Avendaño','Jonnathan Antonio',774,8),('Bases de Datos 2','LONGO MORALES','ALVARO GIOVANNI','López López','Luis Alejandro',775,9),('Bases de Datos 2','ARIAS','LUIS ALBERTO','Cortéz Bendfeldt','Astrid Ileana',775,10),('Economia','RALDA RECINOS DE ILLESCAS','ILEANA GUISELA','Mejía Lemus','Kevin Oswaldo',14,11),('Economia','RALDA RECINOS DE ILLESCAS','ILEANA GUISELA','Garcia Quiroa','Eder Yafeth',14,12),('Economia','RALDA RECINOS DE ILLESCAS','ILEANA GUISELA','Mejía Lemus','Kevin Oswaldo',14,13),('Economia','RALDA RECINOS DE ILLESCAS','ILEANA GUISELA','Garcia Quiroa','Eder Yafeth',14,14),('Economia','MORALES RUIZ ','EVELYN CAROLINA','Ramírez Sandoval','Fredy José',14,15),('Emprendedores de Negocios Informáticos','ALTAN SAC ','LUDWING FEDERICO','Cortéz Bendfeldt','Astrid Ileana',790,16),('Estructura de Datos','Guzmán','Jesús Alberto','Martínez Marroquín','Marvin Ronaldo',772,17),('Estructura de Datos','HERNANDEZ GARCIA','ALVARO OBRAYAN','Landaverde González','Juan Luis',772,18),('Estructura de Datos','ESPINO BARRIOS','LUIS FERNANDO','Avalos Soto','Carlos Andree',772,19),('Gerenciales 2','VETTORAZZI ESPANA','LUIS ALBERTO','Moino Rodriguez','Cristian Esteban',787,20),('Gerenciales 2','VETTORAZZI ESPANA','LUIS ALBERTO','de León Secay','Kevin Alberto',787,21),('Inteligencia Artificial 1','ESPINO BARRIOS','LUIS FERNANDO','Gutierrez Ovando','Jorge Mario',972,22),('Introducción a la Programación y Computación 1','ORELLANA LOPEZ ','MARLON FRANCISCO','Reyes Portillo','Herbert Rafael',770,23),('Introducción a la Programación y Computación 1','ZEPEDA AREVALO','BYRON RODOLFO','Pérez Mena','Ingrid Rossana',770,24),('Introducción a la Programación y Computación 1','VELASQUEZ OLIVA','MOISES EDUARDO','Hernández Rivera','Pablo Andrés',770,25),('Introducción a la Programación y Computación 1','VELIZ LINARES','HERMAN IGOR','Jiménez Pérez','Carlos Roberto',770,26),('Introducción a la Programación y Computación 1','CALDERON MENDEZ','NEFTALI DE JESUS','Bautista Méndez','Ariel Alejandro',770,27),('Introducción a la Programación y Computación 2','Pérez Türk','Marlon Antonio','Muhun Recinos','Tanya Beatriz',771,28),('Introducción a la Programación y Computación 2','ROJAS MORALES','CLAUDIA LICETH','Cruz Ortiz','Kevin Ariel',771,29),('Introducción a la Programación y Computación 2','RUIZ JUAREZ ','JOSE MANUEL','Juárez López','Juan Pablo',771,30),('Introducción a la Programación y Computación 2','ESCOBAR ARGUETA','WILLIAM ESTUARDO','Herrera Castro','Mauro Alejandro',771,31),('Introducción a la Programación y Computación 2','Zapeta Gómez','Edwin Estuardo','López Flores','Andrea María',771,32),('Lenguajes Formales y de Programación','RODRIGUEZ ACOSTA','OTTO AMILCAR','Cabrera Puente','Javier Alberto',796,33),('Lenguajes Formales y de Programación','STAFF','STAFF','Véliz Sandoval','José Manuel',796,34),('Lenguajes Formales y de Programación','STAFF','STAFF','Morales López','Luis Manuel',796,35),('Lenguajes Formales y de Programación','STAFF','STAFF','Véliz Sandoval','José Manuel',796,36),('Lenguajes Formales y de Programación','STAFF','STAFF','Morales López','Luis Manuel',796,37),('Lenguajes Formales y de Programación','STAFF','STAFF','Urías Coc','Danilo',796,38),('Logica de Sistemas','TALA AYERDI ','VIRGINIA VICTORIA','Hernández Arroyo','Erick Fernando',795,39),('Logica de Sistemas','TALA AYERDI ','VIRGINIA VICTORIA','Ruiz Piox','Fernando Vidal',795,40),('Logica de Sistemas','AVILA PESQUERA DE MEDINILLA','FLORIZA FELIPA','Pensamiento Calderón','Fernando Arturo',795,41),('Logica de Sistemas','AVILA PESQUERA DE MEDINILLA','FLORIZA FELIPA','Ruiz Piox','Fernando Vidal',795,42),('Logica de Sistemas','AVILA PESQUERA DE MEDINILLA','FLORIZA FELIPA','Pensamiento Calderón','Fernando Arturo',795,43),('Logica de Sistemas','AVILA PESQUERA DE MEDINILLA','FLORIZA FELIPA','Ruiz Piox','Fernando Vidal',795,44),('Manejo e Implementación de Archivos','DIAZ ARDAVIN ','JUAN ALVARO','Hernández Gramajo','Carlos Luis Pablo',773,45),('Manejo e Implementación de Archivos','PAZ CAMPOS','OSCAR ALEJANDRO','Vargas León','Luis Angel',773,46),('Modelacion y Simulación 1','CANCINOS RENDON','MIGUEL ANGEL','Vásquez Cos','Jorge Mauricio',729,47),('Modelación y Simulación 2','FERNANDEZ CACERES','CESAR AUGUSTO','Santiago Brito','Brayan Ezequiel',720,48),('Organización Computacional','ESCOBAR LEIVA','OTTO RENE','Berrios Gutierrez','Diego Josue',964,49),('Organización Computacional','ESCOBAR LEIVA','OTTO RENE','Menéndez Tobías','Ricardo Antonio',964,50),('Organización de Lenguajes y Compiladores 2','LOPEZ LOPEZ','BAYRON WOSVELY','Alvarado López','Cristian David',781,51),('Organización de Lenguajes y Compiladores 2','SABAN RAXON','EDGAR RUBEN','Vásquez Flores','Pavel Alexander',781,52),('Organización de Lenguajes y Compiladores 2','Navarro Delgado','Erick Carlos Roberto','Flores Díaz','Erik Gerardo',781,53),('Organización Lenguajes y Compiladores 1','BAUTISTA FUENTES','MARIO JOSE','Mazariegos de León','Luis Fernando',777,54),('Organización Lenguajes y Compiladores 1','BAUTISTA FUENTES','MARIO JOSE','Puac Ixcamparic','José Francisco',777,55),('Organización Lenguajes y Compiladores 1','BAUTISTA FUENTES','MARIO JOSE','Mazariegos de León','Luis Fernando',777,56),('Organización Lenguajes y Compiladores 1','BAUTISTA FUENTES','MARIO JOSE','Puac Ixcamparic','José Francisco',777,57),('Organización Lenguajes y Compiladores 1','BAUTISTA FUENTES','MARIO JOSE','Mazariegos de León','Luis Fernando',777,58),('Organización Lenguajes y Compiladores 1','BAUTISTA FUENTES','MARIO JOSE','Puac Ixcamparic','José Francisco',777,59),('Organización Lenguajes y Compiladores 1','CASTILLO REYNA ','MANUEL HAROLDO','Gómez Gómez','Huriel Uvaldo',777,60),('Organización Lenguajes y Compiladores 1','Lajpop Ajpacajá','Kevin Adiel','Paz González','Fernando José',777,61),('Prácticas Iniciales','GOMEZ BRAVO','SERGIO LEONEL','Leal Cardona','Sergio Geovany',2025,62),('Prácticas Intermedias','AVILA PESQUERA DE MEDINILLA','FLORIZA FELIPA','Aguilar Cuque','Douglas Daniel',2036,63),('Programación Comercial 1','STAFF','STAFF','Chaicoj Cotzojay','Julio Antonio',667,64),('Programación Comercial 1','MENENDEZ PEREZ','GUIPPSY JEANNIRA','Chaicoj Cotzojay','Julio Antonio',667,65),('Programación Comercial 1','VELIZ LINARES','HERMAN IGOR','Torres Caal','Carlos Eduardo',667,66),('Programación de Computadoras 1 090','VELIZ LINARES','HERMAN IGOR','Arias Molina','Haroldo Pablo',90,67),('Programación de Computadoras 1 090','VELIZ LINARES','HERMAN IGOR','Recinos Dieguez','Jorge Mario',90,68),('Programación de Computadoras 1 090','VELIZ LINARES','HERMAN IGOR','Arias Molina','Haroldo Pablo',90,69),('Programación de Computadoras 1 090','VELIZ LINARES','HERMAN IGOR','Recinos Dieguez','Jorge Mario',90,70),('Programación de Computadoras 2','VELIZ LINARES','HERMAN IGOR','Vicente Campos','Andrea Nicte',92,71),('Programación de Computadoras 2','VELIZ LINARES','HERMAN IGOR','Ardón Lechuga','Ruth Nohemy',92,72),('Programación de Computadoras 2','VELIZ LINARES','HERMAN IGOR','Vicente Campos','Andrea Nicte',92,73),('Programación de Computadoras 2','VELIZ LINARES','HERMAN IGOR','Ardón Lechuga','Ruth Nohemy',92,74),('Programación de Computadoras 2','VELIZ LINARES','HERMAN IGOR','Gil Chacón','Carlos Giovani',92,75),('Programación de Computadoras 2','SILVA DE LOS ANGELES','JOSE ANIBAL','Corleto Soto','Oscar Ariel',92,76),('Programación de Computadoras 2','SILVA DE LOS ANGELES','JOSE ANIBAL','Corleto Soto','Oscar Ariel',92,77),('Redes de computadoras 1','HERNANDEZ RAMIREZ','PEDRO PABLO','Montúfar Cordero','Andrés Alejandro',970,78),('Redes de Computadoras 2','LOPEZ FERNANDEZ','MANUEL FERNANDO','Masaya Nájera','Dennis Alejandro',975,79),('Seminario de Sistemas 1','LOPEZ FERNANDEZ','MANUEL FERNANDO','Hernández Juárez','Fernando',797,80),('Seminario de Sistemas 1','LOPEZ FERNANDEZ','MANUEL FERNANDO','Hernández Juárez','Fernando',797,81),('Seminario de Sistemas 2','VETTORAZZI ESPANA','LUIS ALBERTO','Cortez Sic','Breynner Miguel',798,82),('Sistemas Operativos 1','MENDEZ AGUILAR','SERGIO ARNALDO','Alvarado Castellanos','David Andrés',281,83),('Sistemas Operativos 1','MENDEZ AGUILAR','SERGIO ARNALDO','Alvarado Castellanos','David Andrés',281,84),('Sistemas Operativos 1','STAFF','STAFF','Sánchez Túchez','Sebastián',281,85),('Sistemas Operativos 2','Batz Saquimux','Cesar Rolando','Velásquez Fuentes','Franklin Estuardo',285,86),('Sistemas Organizaciones y Gerenciales 1','Zapeta Gómez','Edwin Estuardo','Axpuac Yoc','Bayron Romeo',786,87),('Software Avanzado','MEDINILLA RODRIGUEZ','EVEREST DARWIN','Alvarez Morán','José Augusto',780,88),('Teoria de Sistemas 1','ALVAREZ MEJIA','JORGE LUIS','Estrada Martínez','Kevin Eduardo',722,89),('Teoria de Sistemas 2','ALVAREZ MEJIA','JORGE LUIS','Bautista Mazariegos','José Carlos',724,90);
/*!40000 ALTER TABLE `tempocsv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `Carnet` int NOT NULL,
  `Nombres` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `constrasenia` varchar(25) NOT NULL,
  `correo` varchar(50) NOT NULL,
  PRIMARY KEY (`Carnet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-10  3:51:35
