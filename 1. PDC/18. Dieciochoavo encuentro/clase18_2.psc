Algoritmo clase18_2
	Definir vector_Numero, suma, resta, multiplicacion, division, inputUsuario Como Real
	Definir i Como Entero
	Dimension vector_Numero[10]
	
	suma = 0
	multiplicacion = 1
	division = 1
	resta = 0
	
	Escribir  "Ingrese diez valores reales: "
	
	Para i = 0 Hasta 9 Con Paso 1 Hacer
		Leer inputUsuario
		Escribir "Valor ", i+1, ' = ', inputUsuario
		vector_Numero[i] = inputUsuario
	FinPara
	
	Escribir ""
	
	///Suma
	
	Para i = 0 Hasta 9 Con Paso 1 Hacer
		suma = suma + vector_Numero[i]
	FinPara
	Escribir "La suma es igual a: ", "[", suma, "]"
	
	///Resta
	
	Para i = 0 Hasta 9 Con Paso 1 Hacer
		resta = resta - vector_Numero[i]
	FinPara
	Escribir "La resta es igual a: ", "[", resta, "]"
	
	///Multiplicacion
	
	Para i = 0 Hasta 9 Con Paso 1 Hacer
		multiplicacion = multiplicacion * vector_Numero[i]
	FinPara
	Escribir "La multiplicación es igual a: ", "[", multiplicacion, "]"
	
FinAlgoritmo
