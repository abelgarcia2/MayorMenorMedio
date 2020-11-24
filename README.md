# MayorMenorMedio

Este es un programa que, pásandole 3 num, devuelve el mayor, el menor y el que se encuentra en medio.

## Variables que usa
Este programa en total usa las siguientes variables (todas de tipo int):
- num1
- num2
- num3
- mayor
- menor
- medio

En las que num1, num2, num3 se usan para guardar los números introducidos por el usuario y mayor, menor, medio se utilizan para sacar por pantalla los resultados.

## Como funciona
Este programa funciona con 3 métodos que realizan las operaciones y un cuarto que sirve para sacar los resultados pro pantalla.

### Método ElMayor()
Este método es una estructura if, else if, else que lo que hace es analizar si un numero es mayor que los otros dos, si obtiene como resultado true ese número se almacena en la variable _mayor_.

### Método ElMenor()
El funcionamiento es igual al anterior. Analiza cual es el menor de los tres números y lo guarda en la variable _menor_

### Método ElMedio()
Este método es otro if, else if, else que lo que hace es tomar dos, de los tres números y ver si están almacenados uno en la variable *mayor* y otro en la variable *menor*. Si esto es así, quiere decir que el tercer número es el del medio.

Abel García García