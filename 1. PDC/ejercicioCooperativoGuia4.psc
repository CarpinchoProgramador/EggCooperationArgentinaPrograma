Algoritmo ejercicioCooperativoGuia4
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
///////////////////////////////////////////
SubProceso imprimirMatriz(tablero)
	Definir i, j Como Entero
	Para i = 0 Hasta 8 Hacer
		Para j = 0 Hasta  11 Hacer
			Escribir Sin Saltar tablero(i,j)
		FinPara
		Escribir ""
	FinPara
FinSubProceso
/////////////////////////////////////////////
SubProceso agregarPalabra(tablero, x, i)
	Definir cont, j, posicionR Como Entero
	cont = longitud(x)

	Para j = 0 Hasta cont-1 Hacer
		tablero(i,j) = Subcadena(x, j,j)
	FinPara
	PosFila = i
	
FinSubProceso
/////////////////////////////////////////////
Funcion posicionR <- buscarR(tablero, cont, i, x)
	Definir j, posicionR Como Entero
	posicionR = 0
	Para j = 0 Hasta cont-1 Hacer
		Hacer
			Si tablero(i,j) = 'r' o tablero(i,j) = 'R' Entonces
				posicionR = j
				contR = 1
			FinSi
		Mientras que contR < 1
	FinPara
FinFuncion
/////////////////////////////////////////////
SubProceso acomodarPalabras(tablero)
	Definir posR, i, j Como Entero
	posR = posicionR
	i = PosFila
	
	Para j = 5-posR Hasta Longitud(x)
	
FinSubProceso

Funcion PosFila <- buscarFila(i)
	Definir PosFila como entero
	PosFila = i
FinFuncion



	