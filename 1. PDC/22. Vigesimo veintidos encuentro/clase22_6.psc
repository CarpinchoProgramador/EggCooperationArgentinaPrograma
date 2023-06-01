Algoritmo clase22_6
	Definir b, n, i, j, matrizN Como Entero 
	

	Escribir "Ingrese el tamaño de la matriz."
	Leer n
	
	Si n >= 10 Entonces
		Hacer
			Escribir "El tamaño de la matriz no debe superar orden igual a 10."
			Leer n
		Mientras Que n >= 10
	FinSi
	
	
	Dimension matrizN(n,n)
	
	Escribir "Ingrese ", n*n, " numeros del 1 al 9"
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Para j = 0 Hasta n-1 Con Paso 1 Hacer
			Leer b
			Si b > 9 o b < 0 Entonces
				Escribir "Numero invalido. Ingrese valores entre el 1 al 9."
				Leer b
			FinSi
			matrizN(i,j) = b
		FinPara
	FinPara
	
	escribirMatriz(matrizN)
	
	comprobacion(matrizN, n)
	
FinAlgoritmo

SubProceso comprobacion(matriz, x)
	Definir i, j, sumaDiagonal, sumaFila, sumaColumna Como Entero
	
	sumaDiagonal = 0
	sumaFila = 0
	sumaColumna = 0
	
	Para i = 0 Hasta x-1 Con Paso 1 Hacer
		Para j = 0 Hasta x-1 Con Paso 1 Hacer
			Si j = i Entonces
				sumaDiagonal = sumaDiagonal + matriz(i,j)
			FinSi
			
			si j = 0 Entonces
				sumaFila = sumaFila + matriz(i, 0)
			FinSi
			
			si i = 0 Entonces
				sumaColumna = sumaColumna + matriz(0, j)
			FinSi
			
		FinPara
	FinPara
	

	Si sumaDiagonal = sumaFila y sumaFila = sumaColumna Entonces
		Escribir "Todas las filas, columnas y diagonales son iguales. La suma de los productos es = ", sumaDiagonal
	SiNo
		Escribir "La suma de las filas, columnas y diagonales son diferentes."
	FinSi
	
FinSubProceso

SubProceso escribirMatriz(matrizN)
	Definir i, j Como Entero
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizN(i,j), "] "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
