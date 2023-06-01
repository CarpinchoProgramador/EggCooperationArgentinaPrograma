Algoritmo clase22_1
	//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
	//los muestre por pantalla.
	
	Definir matriz3x3, numUsuario, i, j Como Entero
	
	Dimension matriz3x3(3,3)
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir "Ingrese un numero para la fila (", i,") y la columna (", j,")" 
			Leer numUsuario
			matriz3x3(i,j) = numUsuario
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "(", matriz3x3(i, j), ") "
		FinPara
	FinPara
	
FinAlgoritmo
