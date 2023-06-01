//Realizar una función que calcule la suma de dos números. En el algoritmo principal le pedire-
//mos al usuario los dos números para pasárselos a la función. Después la función calculará la
//suma y lo devolverá para imprimirlo en el algoritmo.

Algoritmo sin_titulo
	Definir num1,num2,resultado Como Entero
	
	Escribir "Ingrese el primer numero"
	leer num1
	Escribir "Ingrese el segundo numero"
	leer num2
	
	resultado=sumaDeNumeros(num1,num2)
	
	Escribir num1, " + ",num2," = ",resultado
	Escribir " "
	Escribir num1, " + ",num2," = ",sumaDeNumeros(num1,num2)
	
FinAlgoritmo

Funcion suma = sumaDeNumeros(x,z)
	Definir suma Como Entero
	
	suma=x+z
FinFuncion