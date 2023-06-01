Algoritmo sin_titulo
	Definir num, valid Como Entero
	
	Escribir "Ingrese un num"
	Leer num
	
	Si	valid <> 0 Entonces
		Escribir Falso
	SiNo
		Escribir Verdadero
	FinSi
	
FinAlgoritmo

Funcion  retorno <- Paridad (num)
	Definir retorno Como Entero
	retorno = num MOD 2
Fin Funcion