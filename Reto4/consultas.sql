SELECT "consulta 1";
SELECT titulo, descripcion, año FROM tutorias WHERE año=2022;
SELECT "consulta 2";
SELECT * FROM tutorias WHERE id_docente_encargado="joanp@gmail.com";
SELECT "consulta 3";
SELECT * FROM tutorias WHERE id_docente_encargado="pedrom@gmail.com" ORDER BY año DESC;
SELECT "consulta 4";
SELECT usuarios.nombres, usuarios.apellidos, usuarios.correo_electronico, usuarios.id_rol, roles.rol FROM usuarios JOIN roles
WHERE usuarios.id_rol= roles.id_rol AND rol="Estudiante"; 
SELECT "consulta 5";
SELECT usuarios.nombres, usuarios.apellidos, usuarios.correo_electronico, usuarios.edad
FROM usuarios JOIN roles WHERE roles.id_rol=usuarios.id_rol AND roles.rol = "Docente" ORDER BY usuarios.edad DESC;
SELECT "consulta 6"; 
SELECT usuarios.nombres, usuarios.apellidos, usuarios.correo_electronico, usuarios.edad
FROM usuarios JOIN roles WHERE (roles.id_rol=usuarios.id_rol AND roles.rol= "Docente" AND  usuarios.edad > 40); 
SELECT correo_electronico,nombres,apellidos,edad,contraseña,rol
FROM  usuarios JOIN roles ON usuarios.id_rol = roles.id_rol ORDER BY usuarios.apellidos ASC;

SELECT id_tutoria,titulo, descripcion, año, nombres, apellidos, id_docente_encargado FROM tutorias JOIN usuarios
ON tutorias.id_docente_encargado=usuarios.correo_electronico where año>2020 ORDER BY tutorias.titulo ASC;