Algoritmo clase23_1extra
	//Realizar un programa que rellene de números aleatorios una matriz a través de un subpro-
	//grama y generar otro subprograma que muestre por pantalla la matriz final.
	
	Definir matrizAleatoria Como Entero
	Dimension matrizAleatoria(3,3)
	
	rellenarMatriz(matrizAleatoria)
	escribirMatriz(matrizAleatoria)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz)
	Definir i, j Como Entero
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz(i,j) = azar(100)
		FinPara
	FinPara
FinSubProceso

SubProceso escribirMatriz(matriz)
	Definir i, j Como Entero
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "(", matriz(i,j), ") "
		FinPara
	FinPara
FinSubProceso

