Algoritmo clase22_2
	//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
	//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las coorde-
	//nadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En caso de no
	//encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	
	Definir matriz5x5, numUsuario, i, j, aux1, aux2 Como Entero
	Dimension matriz5x5(5,5)
	
	Escribir "Ingrese un numero"
	Leer numUsuario
	
	aux1 = 0
	aux2 = 0
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 4 Con Paso 1 Hacer
			matriz5x5(i,j) = azar(100)
			Si matriz5x5(i,j) = numUsuario Entonces
				aux1 = i
				aux2 = j
			FinSi
		FinPara
	FinPara
	
	Si matriz5x5(aux1, aux2) = numUsuario Entonces
		Escribir "El numero se encuentra en la fila (", aux1,") columna(", aux2,")."
	SiNo
		Escribir "El numero no se encuentra."
	FinSi
	
FinAlgoritmo
