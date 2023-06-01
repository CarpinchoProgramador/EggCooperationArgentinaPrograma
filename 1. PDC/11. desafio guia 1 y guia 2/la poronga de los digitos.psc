Algoritmo sin_titulo
	
	Definir i, digitos, num Como Real
	
	Escribir "Ingrese un numero."
	Leer num
	
	digitos = 1 
	
	Mientras num >= 10 Hacer
		num = num / 10
		digitos = digitos + 1
	FinMientras
	
	Escribir "La cantidad de digitos es de: ", digitos
	
FinAlgoritmo
