Algoritmo sin_titulo
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero:"
	Leer num	
	
	Escribir EsPrimo(num)
	
FinAlgoritmo

Funcion retorno = EsPrimo(x)
	
	Definir retorno, operacion, operacion2 Como Entero
	
	operacion = x mod x
	operacion2 = x / x
	
	Si operacion = 0 y operacion2 = 1
		Escribir "Es primo."
	SiNo
		Escribir "No es primo."
	FinSi
	
FinFuncion
