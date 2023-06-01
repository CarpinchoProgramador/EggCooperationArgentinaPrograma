Algoritmo generador_numeros_loto
	Definir numerosLoto, numPlus, i Como Entero
	Dimension numerosLoto[6]
	
	Escribir "Numeros: "
	
	Para i <- 0 Hasta 5 Con Paso 1 Hacer
		numerosLoto[i] = azar(45)
		Escribir Sin Saltar '[',numerosLoto[i],'] '
	FinPara
	Escribir ""
	Escribir "Numero Plus: " azar(9)
FinAlgoritmo
