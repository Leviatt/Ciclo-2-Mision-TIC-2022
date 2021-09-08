DROP TABLE IF EXISTS tutorias;
CREATE TABLE tutorias(
id_tutoria INTEGER PRIMARY KEY AUTO_INCREMENT,
titulo varchar(512)  NOT NULL,
descripcion varchar(1024),
año integer NOT NULL,
id_docente_encargado varchar(56) REFERENCES usuarios(correo_electronico)
);
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Aritmética", "Aprende a realizar estas operaciones aritméticas básicas", 2020, "joanp@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Trigonometría", "Descubre las aplicaciones prácticas de la Trigonometría y empieza a entenderla en profundidad	", 2020, "pepea@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Geometría", "Aprende conceptos de geometría para todas las edades", 2020, "pedrom@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Literatura latinoamericana", "Aprende acerca de la evolución de la literatura en latinoamerica", 2020, "mariann@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Física Cuántica", "Aprende sobre el movimiento de las cosas en el mundo subatómico", 2020, "laurab@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Aritmética", "Aprende a realizar estas operaciones aritméticas básicas", 2021, "joanp@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Trigonometría", "Descubre las aplicaciones prácticas de la Trigonometría y empieza a entenderla en profundidad", 2021, "pepea@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Geometría", "Aprende conceptos de geometría para todas las edades", 2021, "pedrom@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Literatura Europea", "Aprende acerca de la evolución de la literatura en europa", 2022, "mariann@gmail.com");
INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)
VALUES ("Física Mecánica", "Aprende sobre física mecánica", 2022, "laurab@gmail.com");
