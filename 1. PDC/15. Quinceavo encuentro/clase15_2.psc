Algoritmo clase15_2
	Definir tempMax, tempMin, promedioTemp Como Real
	Definir cantDias Como Entero
	promedioTemp = 0
	tempMin = 0
	tempMax = 0
	
	Escribir "Ingrese la cantidad de dias."
	leer cantDias
	
	calculoTemp(cantDias, tempMax, tempMin, promedioTemp)
	
FinAlgoritmo

SubProceso calculoTemp(cantDias Por Valor, tempMax Por Referencia, tempMin Por Referencia, promedioTemp)
	Definir i Como Entero
	Para i = 1 Hasta  cantDias Hacer
		Escribir "Ingrese la temperatura maxima del dia ", i
		Leer tempMax
		Escribir "Ingrese la temperatura minima del dia ", i
		Leer tempMin
		
		promedioTemp = (tempMax + tempMin) / 2
		Escribir "La temperatura promedio del dia ", i, " es: ", promedioTemp
		Escribir ""
	FinPara
	
	
FinSubProceso
