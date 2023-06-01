Algoritmo sin_titulo

	Definir i, j, x Como Entero
	
	Escribir "Ingrese un numero entero."
	Leer i
	
	Para x <- 2 Hasta i Con Paso 1 Hacer
		
		Escribir Sin Saltar "*", " "
		
		Si x = i Entonces
			Para x <- 1 Hasta i Con Paso 1 Hacer
				Escribir "*"
			FinPara
		FinSi
	FinPara
FinAlgoritmo
