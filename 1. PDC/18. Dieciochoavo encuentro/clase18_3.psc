Algoritmo clase18_3
	Dimension vector[5]
	Definir i, vector, busqueda, contador Como Entero
	
	contador = 0
	
	Escribir "Ingrese 5 valores."
	Para i = 0 Hasta 4 Hacer
		Leer vector[i]
	FinPara
	
	Escribir "Ingrese que valor desea encontrar en el vector: "
	Leer busqueda
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Si busqueda = vector[i] Entonces
			contador = contador + 1
			Escribir "El valor se encuentra en SubIndice ", i
		FinSi
	FinPara
	
	Si contador = 0 Entonces
		Escribir "El valor no se encuentra en el vector."
	FinSi
FinAlgoritmo
