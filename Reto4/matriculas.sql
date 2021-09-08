DROP TABLE IF EXISTS matriculas;
CREATE TABLE matriculas(
id_matricula INTEGER AUTO_INCREMENT PRIMARY KEY,
id_tutoria INTEGER REFERENCES tutorias(id_tutoria),
id_estudiante varchar(56) references usuarios(correo_electronico)
);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("camilag@gmail.com", 3);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("camilag@gmail.com", 10);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("camilag@gmail.com", 7);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("juano@gmail.com", 2);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("juano@gmail.com", 3);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("angelv@gmail.com", 1);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("angelv@gmail.com", 3);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("angelv@gmail.com", 8);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("emiliab@gmail.com", 9);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("emiliab@gmail.com", 10);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("emiliab@gmail.com", 1);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("emmak@gmail.com", 1);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("emmak@gmail.com", 5);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("emmak@gmail.com", 4);
INSERT INTO matriculas(id_estudiante, id_tutoria) VALUES ("emmak@gmail.com", 6);
