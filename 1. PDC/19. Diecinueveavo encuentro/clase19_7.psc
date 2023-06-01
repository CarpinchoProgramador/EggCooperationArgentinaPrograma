Algoritmo clase19_7
	deteccionValores()
FinAlgoritmo

SubProceso deteccionValores()
	
	Definir arregloA, arregloB, c, i Como Entero
	Dimension arregloA[5], arregloB[5] 
	
	c = 0
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		arregloA[i] = azar(17)
		arregloB[i] = azar(17)
	FinPara
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Si arregloA[i] = arregloB[i] Entonces
			c = c + 1
		FinSi
	FinPara
	
	Si c = 5 Entonces
		Escribir "Todos los valores son iguales."
	SiNo
		Escribir "Los valores son diferentes entre si."
		Escribir "Valores de A."
		Para  i = 0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar '[', arregloA[i], ']'
		FinPara
		Escribir ""
		Escribir "Valores de B."
		Para  i = 0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar '[', arregloB[i], ']'
		FinPara
		
	FinSi
FinSubProceso
