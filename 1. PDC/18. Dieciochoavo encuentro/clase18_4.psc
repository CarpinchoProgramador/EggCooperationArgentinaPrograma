Algoritmo clase18_4
	menu()
FinAlgoritmo

SubProceso menu()
	Definir a Como Caracter
	
	Escribir "Seleccione una opción"
	
	Escribir ""
	
	Escribir "A: Llenar vector A."
	Escribir "B: Llenar vector B."
	Escribir "C: Llenar vector C con la suma de los vectores A + B (C = A+B)."
	Escribir "D: Llenar vector C con la resta de los vectores A - B (C = A-B)."
	Escribir "E: Mostrar."
	Escribir "F: Salir"
	
	Escribir ""
	
	Leer a
	a = Minusculas(a)
	Segun a Hacer
		'a':
			llenarA()
		'b':
			llenarB()
		'c':
			llenarCSuma()
		'd':
			llenarCResta()
		'e':
			mostrarVectores()
		'f':
			Escribir "Gracias por usar nuestro programa."
	FinSegun
	
FinSubProceso

SubProceso llenarA()
	Definir vectorA, i Como Entero
	Dimension vectorA[5]
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		vectorA[i] = Aleatorio(-100, 100)
		Escribir vectorA[i]
	FinPara
	Escribir "Valores para Vector A asignados exitosamente."
	Esperar 3 Segundos
	menu()
FinSubProceso

SubProceso llenarB()
	Definir vectorB, i Como Entero
	Dimension vectorB[5]
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		vectorB[i] = Aleatorio(-100, 100)
		Escribir vectorB[i]
	FinPara
	Escribir "Valores para Vector B asignados exitosamente."
	Esperar 3 Segundos
	menu()
FinSubProceso

SubProceso llenarCSuma()
	
FinSubProceso


SubProceso llenarCResta()
	
FinSubProceso

SubProceso mostrarVectores()
	
FinSubProceso


