Algoritmo ejercicio_8
	
	Escribir "Escriba un n�mero entero positivo"
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
	
	Escribir "La cantidad de d�gitos que posee el n�mero ingresado es de: ", contabilizador
	
FinAlgoritmo