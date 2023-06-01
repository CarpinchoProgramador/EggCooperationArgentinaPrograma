Algoritmo sin_titulo
	
	Escribir "Ingrese un número"
	Definir num Como Entero
	Leer num
	
	Definir cuenta Como Entero
	cuenta = 0
	
	Definir carga Como Entero
	carga = 0
	
	Mientras num <> -1 Hacer
		
		cuenta = cuenta + 1
		
		carga = carga + num
		
		Leer num
		
	Fin Mientras
	
	Definir promedio Como Real
	promedio = carga / cuenta
	Escribir "El promedio de la secuencia es: ", promedio
	
FinAlgoritmo