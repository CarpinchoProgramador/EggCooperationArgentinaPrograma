Algoritmo SinTitulo
	
	Definir i, j, num Como Entero
	
	para i <- 1 hasta 5 hacer
		
		escribir "Ingrese un n�mero entre 1 y 20: "
		leer num
		
		mientras num < 1 o num > 20 hacer
			escribir "Error. Ingrese un n�mero entre 1 y 20: "
			leer num
		finmientras		
		
		escribir num, ": "
		
		para j <- 1 hasta num hacer
			escribir Sin Saltar "*"
		finpara
		
		escribir ""
		
	finpara
	
finalgoritmo
