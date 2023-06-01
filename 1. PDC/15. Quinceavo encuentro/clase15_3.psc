Algoritmo clase15_3
	Definir num1, num2, residuo, cociente Como Real	
	
	Escribir "Ingrese un dividendo: "
	leer num1
	Escribir "Ingrese un divisor: "
	leer num2
	
	residuo = 0
	cociente = 0
	
	operacionRestas(num1, num2, residuo, cociente)
	
	Escribir "El cociente es: ", cociente
	Escribir "El residuo es: ", residuo
FinAlgoritmo

SubProceso operacionRestas(dividendo Por Referencia, divisor por Valor, residuo Por Referencia, cociente Por Referencia)
	Hacer
		residuo = dividendo - divisor
		dividendo = residuo
		cociente = cociente + 1
	Mientras Que residuo > divisor
FinSubProceso
