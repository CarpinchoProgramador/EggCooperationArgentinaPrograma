Algoritmo sin_titulo
	
	Definir frase Como Caracter
	Definir n Como Entero
	
	Escribir "Ingrese una frase o palabra."
	Leer frase
	
	Para n<-0 Hasta Longitud(frase) Con Paso 1 Hacer
		
		Escribir Sin Saltar Subcadena(frase, n, n)
		Escribir Sin Saltar " "
		
	FinPara
	
FinAlgoritmo
