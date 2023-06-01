Algoritmo sin_titulo
	
	Definir i, numEnt, j Como Entero
	
	Para i = 1 Hasta 5 Hacer
	
		Escribir "Escriba un numero entero"
		Leer numEnt 
		
		Mientras  numEnt < 1 o numEnt > 20
			Escribir "Error, valor no comprendido."
			Leer numEnt
		FinMientras
		
		
		Si numEnt >= 1 y numEnt <= 20 Entonces
			Escribir Sin Saltar numEnt,": "
			
			Para j = 1 Hasta numEnt
			Escribir Sin Saltar "*"
			FinPara
			
		FinSi
		
		Escribir ""
		
	FinPara
	
	
	
FinAlgoritmo
