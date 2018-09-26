CREATE DATABASE registroAutomovilesMAAT;

USE registroAutomovilesMAAT;


CREATE TABLE ultimoDuenio(
run VARCHAR (20),
nombreCompleto VARCHAR (40),
telefono VARCHAR (30),
PRIMARY KEY (run)
);

CREATE TABLE automovil(
id INT AUTO_INCREMENT,
patente VARCHAR (20),
marca VARCHAR (20),
anio INT,
detalles VARCHAR (100),
fk_ultimoDuenio VARCHAR (20),
FOREIGN KEY (fk_ultimoDuenio) REFERENCES ultimoDuenio (run),
PRIMARY KEY (id)
);


INSERT INTO ultimoDuenio VALUES ('20848088-2', 'Marcelo Aranda Tatto', '+9568677107');
INSERT INTO ultimoDuenio VALUES ('30898018-2', 'Gonzalo Aranda Tatto', '+9568899107');
INSERT INTO ultimoDuenio VALUES ('10898038-2', 'Paula Aranda Tatto', '+9562277107');

INSERT INTO automovil VALUES (NULL, 'AAAA-11', 'Ford', 1995, 'En buen estado, poco kilometraje','20848088-2');
INSERT INTO automovil VALUES (NULL, ' BBBB-22', 'Toshiba', 1998, 'Tiene algunos rayones','30898018-2');
INSERT INTO automovil VALUES (NULL, 'CCCC-33', 'Subaru', 2000, '5000 de kilometraje','10898038-2');

/*
SELECT * FROM ultimoDuenio;
SELECT * FROM automovil;
*/
-- DROP DATABASE registroAutomovilesMAAT;
