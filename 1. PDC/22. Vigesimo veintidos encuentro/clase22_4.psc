Algoritmo clase22_4
	//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
	//principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro subpro-
	//ceso para imprimir la matriz.
	
	todoElLaburo()
	
FinAlgoritmo

SubProceso todoElLaburo()
	Definir matrizCuadrada,i,j, n Como Entero
	Escribir "Ingrese el tamaño de su matriz cuadrada: "
	Leer n
	
	Dimension matrizCuadrada(n,n)
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Para j = 0 Hasta n-1 Con Paso 1 Hacer
			matrizCuadrada(i,j) = azar(2000)
			Si i = j Entonces
				matrizCuadrada(i,j) = 0
			FinSi
		FinPara
	FinPara
	
	imprimirMatriz(matrizCuadrada, n)
FinSubProceso

SubProceso imprimirMatriz(matrizCuadrada, n)
	Definir i, j Como Entero
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Para j = 0 Hasta n-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizCuadrada(i,j), "] "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
	