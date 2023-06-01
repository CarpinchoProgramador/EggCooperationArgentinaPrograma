Algoritmo sin_titulo
	
	Definir notaUno, notaDos, notaTres Como Entero
	Definir validacion Como Logico
	
	Escribir "Ingrese tres notas."
	Leer notaUno, notaDos, notaTres
	
	validacion = notaUno >= 1 y notaUno <= 10 y notaDos >= 1 y notaDos <= 10 y notaTres >= 1 y notaTres <= 10
	
	Si validacion Entonces
		Escribir "Las tres notas son correctas."
		
	SiNo
		Escribir "No todas las notas son correctas."
	FinSi
	
	
FinAlgoritmo
