En un hipódromo requieren automatizar algunas operaciones que realizan diariamente al final del día, para ello deciden construir una clase en Java llamada Hipica con los siguientes métodos.

 

1.     obtenerAgregadoGanadores( listaGanadores ):

dada una lista de los caballos ganadores durante el día, el método debe retornar la lista agregada con los nombres de los caballos ganadores (sin repeticiones):

Entrada

listaGanadores = ['Spirit', 'Spirit', 'Imperiozo', 'Pegazo', 'Imperiozo', 'Babieca', 'Spirit', 'Jumper'] 

Salida

['Spirit', 'Imperiozo', 'Pegazo', 'Babieca', 'Jumper']



2.     obtenerPosicionesPremioDoble( listaCarrerasConPremioDoble, listaGanadores, caballo ):

dado que en la jornada tienen un beneficio para los apostadores, que consiste en duplicar el premio para una lista determinada de carreras (listaCarrerasConPremioDoble). Por lo tanto, quieren obtener la lista de carreras con premio doble en las que un caballo fue ganador.

 

Entrada

listaCarrerasConPremioDoble = [0, 3, 6]

listaGanadores = ['Spirit', 'Spirit', 'Imperiozo', 'Pegazo', 'Imperiozo', 'Babieca', 'Spirit', 'Jumper']

caballo = Spirit

Salida

[0, 6]

 

3.     obtenerCaballosNoGanadores( listaGanadoresAyer, listaGanadoresHoy ):

requieren saber la lista de caballos que no ganaron durante el día actual comparado con los ganadores del día anterior.

 

Entrada

listaGanadoresAyer = ['Spirit', 'Spirit', 'Imperiozo', 'Pegazo', 'Imperiozo', 'Babieca', 'Spirit', 'Jumper']

listaGanadoresHoy = ['Imperioso', 'Spirit', 'Imperiozo', 'Pegazo', 'Imperiozo', 'Spirit', 'Spirit', 'Pegazo']

Salida

['Babieca', 'Jumper']

 

4.     obtenerMinimoNuevosGanadores( listaGanadoresAyer, listaGanadoresHoy ): requieren saber la cantidad de nuevos caballos ganadores el día actual con respecto a los ganadores del día anterior y a la inversa. Luego, se debe determinar el menor de estos dos valores y retornarlo como respuesta. De acuerdo con el ejemplo, los caballos Spirit y Jumper fueron nuevos ganadores el día actual (total 2). De los ganadores del día anterior pero no el actual fueron Babieca, Snow, y Amatista (total 3). De ahí que la salida esperada sea 2.

 

Entrada

listaGanadoresAyer = ['Imperioso', 'Imperioso', 'Babieca', 'Pegazo', 'Imperiozo', 'Babieca', 'Snow', 'Amatista']

listaGanadoresHoy = ['Imperioso', 'Spirit', 'Imperiozo', 'Pegazo', 'Imperiozo', 'Spirit', 'Spirit', 'Jumper']

Salida (se espera que el tipo de retorno sea Integer)

2

 

Entrada

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre Hipica.java y que definan los nombres de los métodos requeridos y sus parámetros tal cual está especificado en el enunciado definiendo la clase Hipica.

Puntuación

Si el responsable de sistemas del hipódromo puede importar la clase se obtiene un punto. Para cada método que cumpla con la funcionalidad pedida se agrega un punto, cuatro funciones para 4 puntos posibles. En total, 5 puntos.

