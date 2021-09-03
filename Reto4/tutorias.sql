CREATE TABLE tutorias(
id_turoria INTEGER AUTO_INCREMENT PRIMARY KEY,
titulo varchar(512),
descripcion varchar(1024),
año int,
id_docente_encargado varchar(56) REFERENCES usuarios
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
