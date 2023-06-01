Algoritmo sin_titulo
	definir matriz1, matriz2, matriz3, i, j, k como entero
	dimension matriz1[3,3], matriz2[3,3], matriz3[3,3]
	
	          ////MATRIZ 1 ////
	
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			matriz1[i,j] = aleatorio(1,5)
		FinPara
	FinPara
		      ///MATRIZ 2 ////
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			matriz2[i,j] = aleatorio(1,3)
		FinPara
	FinPara
	
				///MATRIZ 3 ///
	
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			matriz3[i,j] = 0
				
			
		FinPara
	FinPara
	
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			para k <- 0 hasta 2 con paso 1 hacer
			matriz3[i,j] = matriz3[i,j] + (matriz1[i,k]*matriz2[k,j])
			finpara
		FinPara
	FinPara
	
	
	
	
	
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			escribir "[" matriz1[i,j] "] " sin saltar
		FinPara
		escribir ""
	FinPara
	
	escribir "     *     "
	
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			escribir "[" matriz2[i,j] "] " sin saltar
		FinPara
		escribir "" 
	FinPara
	
	Escribir "    =     "
	
	para i <- 0 hasta 2 con paso 1 Hacer
		para j <- 0 hasta 2 con paso 1 Hacer
			escribir "[" matriz3[i,j] "] " sin saltar
		FinPara
		escribir ""
	FinPara
	
FinAlgoritmo
