Algoritmo clase22_5
	//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encon-
	//trando la manera de que la frase se muestre de manera continua en la matriz.
	
	
	Definir matrizPalabra, fraseUser Como Caracter
	Definir i, j, contador Como Entero
	Dimension matrizPalabra(3,3)
	
	Escribir "Ingrese una palabra de 9 caracteres."
	Leer fraseUser
	
	contador = 0
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matrizPalabra(i,j) = Subcadena(fraseUser, contador, contador)
			contador = contador + 1
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[", matrizPalabra(i,j), "] "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
