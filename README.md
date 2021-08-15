# Ciclo 2 Mision TIC 2022
 Solución a los desafios


En las olimpiadas Tokio 2020, requieren un software para gestionar los participantes en el evento. Por lo tanto, le encomiendan construir un software para ello. Como característica principal, la solución debe ser útil para manejar cualquier otro evento deportivo. Además, debe considerar que participarán personas con dos roles diferentes, deportista y entrenador. Se recomienda seguir el siguiente diagrama de clases:





 

El software recibirá como entradas comandos separados por el carácter & (ampersand), de la siguiente forma:

 

Comando 1 – Agregar deportista al evento:

opción|rol|identificación|nombres|apellidos|edad|deporte|marcaClasificacion|nacionalidad

Ejemplo

1|deportista|1112034|Mariana|Pajon|29|BMX|1:21|Colombia

 

Comando 2 – Agregar entrenador al evento:

opción|rol|identificación |nombres|apellidos|edad|nacionalidad|certificado

Ejemplo

2|entrenador|898989|Juanito|Perez|54|BMX|Colombia|SI



Comando 3 – Listar participantes en el evento:

opción

Ejemplo

3

 

Comando 4 – Terminar la ejecución:

opción

Ejemplo

4

 

Consideraciones

Nota 1: Observe que el único comando que tiene salida (Imprimir en la pantalla) es el 3 (Listar participantes en el evento).

Recuerde eliminar la línea de package al hacer el envío y utilizar el botón de [+] para agregar más de un archivo de código fuente.

 

Nota 2: La clase Evento, debe tener el método main del programa. Este método, debe recibir los comandos como argumentos del programa.

 

Ejemplo de ejecución del programa

 

Si las entradas son las siguientes:

1&Deportista&1112034&Mariana&Pajon&29&BMX&1:21&Colombia

2&Entrenador&898989&Juanito&Perez&54&BMX&Colombia&SI

2&Entrenador&788302&Elena&Rodriguez&32&Pesas&Argentina&si

2&Entrenador&689233&Britta&Trambley&43&Gimnasia&USA&Si

2&Entrenador&33434&Uday&Ventakadasar&45&Judo&India&No

1&Deportista&234523&Katerine&Ibarguen&37&Salto&14:34&Colombia

3

4

 

Salida

***** Participantes Juegos Olimpicos *****

Deportista

            Mariana Pajon

            Identidad: 1112034

            Edad: 29

            Deporte: BMX

            Marca Clasificación: 1:21

            Nacionalidad: Colombia

                        ------                

Entrenador

            Juanito Perez

            Identidad: 898989

            Edad: 54

            Deporte: Colombia

            Certificado: Certificado

                        ------                

Entrenador

            Elena Rodriguez

            Identidad: 788302

            Edad: 32

            Deporte: Argentina

            Certificado: Certificado

                        ------                

Entrenador

            Britta Trambley

            Identidad: 689233

            Edad: 43

            Deporte: USA

            Certificado: Certificado

                        ------                

Entrenador

            Uday Ventakadasar

            Identidad: 33434

            Edad: 45

            Deporte: India

            Certificado: No Certificado

                        ------                

Deportista

            Katerine Ibarguen

            Identidad: 234523

            Edad: 37

            Deporte: Salto

            Marca Clasificación: 14:34

            Nacionalidad: Colombia

                        ------                

Ejecución finalizada!

 

 
