Algoritmo clase23_2extra
	//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
	//con números aleatorios entre 1 y 100 y mostrar su traspuesta.
	
	Definir matrizN, matrizM, i, j, n, m Como Entero
	Escribir "Ingrese el ancho de la matriz:"
	Leer n
	
	Escribir "Ingrese el largo de la matriz:"
	Leer m
	
	Dimension matrizM(n,m), matrizN(n,m)
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Para j = 0 Hasta n-1 Con Paso 1 Hacer
			matrizN(i,j) = Aleatorio(1,100)
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizN(i,j), "] "
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""
	Escribir "Matriz Transpuesta"
	
	Para i = 0 Hasta m-1 Con Paso 1 Hacer
		Para j = 0 Hasta m-1 Con Paso 1 Hacer
			matrizM(j,i) = MatrizN(i,j)
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizM(i,j), "] "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
