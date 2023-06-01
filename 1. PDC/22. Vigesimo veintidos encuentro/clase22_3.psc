Algoritmo clase22_3
	//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
	//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro subpro-
	//grama que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y los re-
	//sultados por pantalla.
	
	Definir matrizN, nFilas, mColumnas Como Entero
	
	Escribir "Ingrese el numero de filas de la matriz A."
	Leer nFilas
	Escribir "Ingrese el numero de columnas de la matriz A."
	Leer mColumnas
	
	Dimension matrizN(nFilas, mColumnas)
	
	calculoSumaMatriz(matrizN, nFilas, mColumnas)
	
FinAlgoritmo

SubProceso calculoSumaMatriz(matrizN Por Referencia, nFilas Por Referencia, mColumnas Por Referencia)
	Definir i, j, suma Como Entero
	suma = 0
	Para i = 0 Hasta nFilas - 1 Con Paso 1 Hacer
		Para j = 0 Hasta mColumnas - 1 Con Paso 1 Hacer
			matrizN(i,j) = Aleatorio(0,100)
			suma = suma + matrizN(i,j)
		FinPara
	FinPara
	Escribir suma
FinSubProceso
	