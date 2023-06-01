Algoritmo clase23_3extra
	Definir matrizT, i, j Como Entero
	Dimension matrizT(5,16)
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 14 Con Paso 1 Hacer
			matrizT(i,j) = 0
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 14 Con Paso 1 Hacer
			Segun i Hacer
				0:
					matrizT(i,j) = 1
				1: 
					matrizT(1,0) = 1
					matrizT(1,14) = 1
				2:
					matrizT(2,0) = 1
					matrizT(2,14) = 1
				3:
					matrizT(3,0) = 1
					matrizT(3,14) = 1
				4: 
					matrizT(i,j) = 1
			FinSegun
		FinPara
	FinPara
	
	
	
	escribirMatriz(matrizT)
FinAlgoritmo

SubProceso escribirMatriz(matrizT)
	Definir i,j Como Entero
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 14 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizT(i,j), "] "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	