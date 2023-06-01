Algoritmo ejercicioCooperativoGuia4_PeroMejor
	Definir tablero como Caracter
	Dimension tablero[9, 12]
	inicializarMatriz(tablero)
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	acomodarPalabras(tablero)
	imprimirMatriz(tablero)
FinAlgoritmo
/////////////////////////////////////////////
SubProceso inicializarMatriz(matrizPalabras)
	Definir i, j Como Entero
	Para i = 0 Hasta 8 Hacer
		Para j = 0 Hasta 11 Hacer
			matrizPalabras(i,j) = '*'
		FinPara
	FinPara
FinSubProceso
/////////////////////////////////////////////
SubProceso agregarPalabra(tablero, x, fila)
	Definir j Como Entero
	Para j = 0 Hasta Longitud(x) - 1 Hacer
		tablero(fila,j) = Mayusculas(Subcadena(x, j,j))
	FinPara
FinSubProceso
/////////////////////////////////////////////
SubProceso acomodarPalabras(tablero)
	Definir i, j, z, holanda Como Entero
	Dimension z(9), holanda(9)
	holanda = buscarR(tablero)
	Para i = 0 Hasta 8 Hacer
		z(i) = holanda(i)
	FinPara
	Para i<-0 Hasta 8 Con Paso 1 Hacer
		Para j<-0 Hasta 11 Con Paso 1 Hacer
			tablero[i,j]=tablero[i,z(i)+j]
		Fin Para
	Fin Para
FinSubProceso
/////////////////////////////////////////////
funcion posicionR <- buscarR(tablero)
	Definir posicionR,cont, i, j Como Entero
	Dimension posicionR[9]
	cont=0
	Para i<-0 Hasta 8 Con Paso 1 Hacer
		Para j<-0 Hasta 11 Con Paso 1 Hacer
			si tablero[i,j] = "R" Entonces
				posicionR[i]= j
				cont=1
			FinSi
		Fin Para
		cont=0
	Fin Para
FinFuncion
/////////////////////////////////////////////
SubProceso imprimirMatriz(tablero)
	Definir i,j Como Entero
	Para i = 0 Hasta 8 Hacer
		Para j = 0 Hasta 11 Hacer
			Escribir Sin Saltar tablero(i,j)
		FinPara
		Escribir ''
	FinPara
FinSubProceso
/////////////////////////////////////////////