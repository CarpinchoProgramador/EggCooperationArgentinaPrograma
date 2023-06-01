Algoritmo clase19_2extra
	Definir i, a Como Entero
	Definir prom Como Real
	Dimension a[5]
	
	prom = 0
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Leer a[i]
		prom = prom + a[i]
	FinPara
	
	prom = prom / 5
	
	Escribir "El promedio de los numeros es de: ", prom
FinAlgoritmo
