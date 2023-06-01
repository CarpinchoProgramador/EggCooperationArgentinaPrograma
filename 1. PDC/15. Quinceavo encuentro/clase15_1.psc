Algoritmo clase15_1
	Definir a, b, aux Como Entero
	
	Escribir "Ingrese un numero A."
	leer a
	Escribir "Ingrese un numero B."
	Leer b
	aux = 0
	
	intercambio(aux, a, b)
	
	Escribir "numero A = ", a
	Escribir "numero B = ", b
FinAlgoritmo

SubProceso intercambio (aux Por Valor, numA por referencia, numB por referencia)
	
	aux = numA
	numA= numB
	numB= aux
	
FinSubProceso
	