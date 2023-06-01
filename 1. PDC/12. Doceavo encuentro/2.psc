//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo sin_titulo
	Definir num Como Entero
	
	Escribir "Ingrese un numero"
	leer num
	
	si EsPrimo(num) == 2 Entonces
		Escribir "Es primo"
	SiNo
		Escribir "No es primo"
	FinSi
	
FinAlgoritmo

Funcion retornar = EsPrimo(x)
	Definir retornar,i,cont Como Entero
	
	cont=0
	para i = 1 Hasta x Hacer
		si x mod i = 0 Entonces
			cont=cont+1
		FinSi
		
	FinPara
	
	retornar=cont
	
FinFuncion