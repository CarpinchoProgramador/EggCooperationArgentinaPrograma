Algoritmo clase24_4extra
	
	Definir matrizA, matrizB, matrizC, i, j, k Como Entero
	Dimension matrizA(3,3), matrizB(3,3), matrizC(3,3)
	
	para i = 0 Hasta 2 Con Paso 1 Hacer
		para j = 0 Hasta 2 Con Paso 1 Hacer
			matrizA(i,j) = Aleatorio(1, 50)
			matrizB(i,j) = Aleatorio(1, 50)
		FinPara
	FinPara
	
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			matrizC[i,j] = 0
		FinPara
	FinPara
	
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			para k <- 0 hasta 2 con paso 1 hacer
				matrizC[i,j] = matrizC[i,j] + (matrizA[i,k]*matrizB[k,j])
			finpara
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizA(i,j),"] "
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""
	
	para i = 0 Hasta 2 Con Paso 1 Hacer
		para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizB(i,j),"] "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	para i = 0 Hasta 2 Con Paso 1 Hacer
		para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizC(i,j),"] "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo

