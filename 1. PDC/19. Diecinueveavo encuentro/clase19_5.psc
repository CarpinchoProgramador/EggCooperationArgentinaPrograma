//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usua-
//rio. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor m�s
//
//grande del vector.


Algoritmo sin_titulo
	
	definir lista, max Como Real
	definir n, i Como Entero
	
	escribir " ingrese dimension de vector"
	leer n
	dimension lista[n]	
	max = 0
	para i <- 0 hasta n-1 hacer
		leer lista[i]
		si lista[i] > max Entonces
			max = lista[i]
		FinSi
	finpara
	
	escribir " el valor maximo es " max
	
	
	
	
	
FinAlgoritmo
