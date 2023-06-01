Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	Escribir "El numero ", num " tiene todos sus digitos impares? ", cant_Impar(num)
FinAlgoritmo

Funcion retorno<- cant_Impar(num)
	Definir retorno Como Logico
	Definir contImpar, contDigitos Como Entero
	Definir aux1 Como Real
	contImpar = 0
	aux1 = 0
	contDigitos = 0
	Hacer
		aux1 = num%10
		num = trunc(num/10)
		si aux1%2 <> 0 Entonces
			contImpar = contImpar + 1
		FinSi
		contDigitos = contDigitos + 1
	Mientras Que num <> 0
	retorno = (contImpar = contDigitos)
FinFuncion
