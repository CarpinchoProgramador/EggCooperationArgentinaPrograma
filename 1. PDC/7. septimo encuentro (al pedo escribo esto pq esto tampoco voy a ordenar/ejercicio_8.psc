Algoritmo ejercicio_8
	
	Escribir "Escriba un número entero positivo"
	Definir num Como Entero
	Leer num
	
	definir varReal Como Real
	
	
	Definir contabilizador Como Entero
	contabilizador = 1
	
	Mientras num >= 10 Hacer
		
		contabilizador = contabilizador + 1
		varReal = num / 10 
		num= Trunc(varReal)
	Fin Mientras
	
	Escribir "La cantidad de dígitos que posee el número ingresado es de: ", contabilizador
	
FinAlgoritmo