CREATE TABLE roles(
id_rol INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
rol ENUM("Estudiante","Docente")
);
INSERT INTO roles(rol) VALUES ("Docente");
INSERT INTO roles(rol) VALUES ("Estudiante");