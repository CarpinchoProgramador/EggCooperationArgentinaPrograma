Algoritmo sin_titulo
	
	Definir num Como Entero
	Escribir "Ingrese un numero entero."
	Leer num

	Escribir sumaDivisores(num)
FinAlgoritmo


Funcion resultado = sumaDivisores(x)
	
	Definir resultado, i, suma, resto Como Entero
	suma = 0
	
	Para i = 1 Hasta x Hacer
		resto = x % i
		Si resto = 1  
			suma = i + suma
		FinSi
	FinPara
	resultado = suma
	
FinFuncion
	