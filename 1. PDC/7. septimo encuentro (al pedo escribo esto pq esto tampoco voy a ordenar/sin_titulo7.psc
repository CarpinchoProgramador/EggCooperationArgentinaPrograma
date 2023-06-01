Algoritmo sin_titulo
	
	Definir limInicial, sumaNum, sumaNum2 Como Real
	
	Escribir "Ingrese un numero limite."
	Leer limInicial
	Escribir "Ingrese un numero para ser sumado."
	Leer sumaNum
	
	sumaNum2 = sumaNum
	
	Mientras limInicial > sumaNum2 Hacer
		
		Escribir "ingrese otro numero"
		Leer sumaNum
		
		sumaNum2 = sumaNum2 + sumaNum
		
	FinMientras
	
FinAlgoritmo
