Algoritmo clase19_3extra
	Definir longitudNombre, i, x Como Entero
	Definir nombrePersona Como Caracter
	
	Escribir "Ingrese la cantidad de nombres que desea ingresar: "
	Leer x
	
	Dimension longitudNombre[x], nombrePersona[x]
	
	Para i = 0 Hasta x-1 Con Paso 1 Hacer
		Escribir "Ingrese un nombre."
		Leer nombrePersona[i]
		longitudNombre[i] = Longitud(nombrePersona[i])
	FinPara
	
	Para i = 0 Hasta x-1 Con Paso 1 Hacer
		Escribir nombrePersona[i],': ', longitudNombre[i], " Caracteres."
	FinPara
FinAlgoritmo