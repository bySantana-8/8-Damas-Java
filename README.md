
# 8-Damas-Java
=======
=======
Practica independiente realizada por mi con intención de practicar la programacion en Java de la asignatura Programación III (Ingenieria Informatica).

## Idea Principal
He realizado un algoritmo para solucionar el problema de las 8 damas. La idea principal es crear un tablero de ajedrez, en el que debemos colocar 8 reinas sin que se amenacen entre ellas.

## Funcion Principal
Creamos un objeto que sera el tablero de ajedrez, haciendo llamadas a las funciones que realizaran el resto del programa.

## Funcion Inicializar
Inicia todo el tablero a '-' con ayuda de dos bucles for, simulando las casillas vacias al imprimir por pantalla.

## Funcion de comprobacion (booleana)
Verifica todos los posibles movimientos, a partir de las coordenadas pasadas a la funcion, en busca de una dama. Si se encuentra con una (una 'Q'), se devolvera false y en caso de no encontrar ninguna, se devolvera true.

## Funcion recursiva (booleana)
Recorre todo el tablero, haciendo llamada a la funcion de comprobacion para ver donde colocar las damas sin amenazarse unas con otras. Coloca la letra 'Q' en las celdas donde sea seguro colocar la dama. Se hara una llamada recursiva a la propia funcion para comprobar que es válida la dama colocada (devolviendo true).De no ser asi, se quitara la 'Q' por un '-' de nuevo, ya que no es una posicion válida.

## Funcion imprimir tablero
Imprime el tablero 8x8 mostrando los bordes con 'X', las casillas vacias con '-' y las damas con 'Q'.

