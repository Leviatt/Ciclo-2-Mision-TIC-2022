DROP TABLE IF EXISTS usuarios;
CREATE TABLE usuarios(
correo_electronico varchar(56) PRIMARY KEY,
nombres varchar(56) NOT NULL,
apellidos varchar(56) NOT NULL,
edad tinyint NOT NULL,
contraseña varchar(56) NOT NULL,
id_rol INTEGER NOT NULL,
FOREIGN KEY (id_rol) REFERENCES roles(id_rol)
);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("joanp@gmail.com", "Joan", "Perez Rodriguez", 45, "dfsa3.da", 1);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("pepea@gmail.com", "Pepe Guajiro", "Arnol Gimenez", 32, "dsaf.ddf.", 1);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("pedrom@gmail.com", "Pedro Elegildo", "Mendez Martinez", 33, "df333d13.", 1);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("mariann@gmail.com", "María Camila", "Aguado Rodriguez	", 42, "eekdy2.#", 1);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("laurab@gmail.com", "Laura Viviana", "Hernández", 51, ",d3sdfK/", 1);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("camilag@gmail.com", "Camila Juliana", "Gomez Mendez", 20, "Ojdfd#.", 2);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("juano@gmail.com", "Juan Camilo", "Ospina", 23, "sadf.dfj-", 2);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("angelv@gmail.com", "Angel Miguel", "Villaveces", 18, "=83ddf.ll", 2);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("emiliab@gmail.com", "Emilia", "Buitrago", 25, "dd234as.#", 2);
INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol)
VALUES ("emmak@gmail.com", "Emma Juliana", "Kimberly", 19, "dddfi23=?/", 2);

