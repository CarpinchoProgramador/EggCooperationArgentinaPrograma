Algoritmo sin_titulo
	//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
	//comprendidos entre 1 y 100.
	
	Definir n, cont2, cont3 Como Entero
	
	cont2 = 0
	cont3 = 0
	
	Para n<-1 Hasta 100 Con Paso 1 Hacer
		
		Si n mod 2 = 0 Entonces
			cont2 = cont2 + 1
		FinSi
		
		Si n mod 3 = 0 Entonces
			cont3 = cont3 + 1
		FinSi
		
	FinPara
	
	Escribir "Los multiplos de dos son: ", cont2
	Escribir "Los multiplos de tres son: ", cont3
	
FinAlgoritmo
