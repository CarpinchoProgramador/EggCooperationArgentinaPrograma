Algoritmo sin_titulo
	Definir num Como Entero
	Definir res Como Logico
	
	Escribir "Ingrese un numero para ver si es par o impar"
	leer num
	
	res=Paridad(num)
	
	Escribir res
FinAlgoritmo

Funcion retorno <- Paridad (num)
	Definir retorno Como logico
	
    retorno = num MOD 2 == 0
	
Fin Funcion