algoritmo Cantidaddedigitos
	
	Definir  num, digitos Como Real
	
	escribir("Ingrese un n�mero entero: ")
	leer num
	
	digitos = 1
	
	mientras (num >= 10) hacer
		num = num / 10
		digitos = digitos + 1
	finmientras
	
	escribir "El n�mero ingresado tiene ", digitos, " d�gitos."
	
finalgoritmo
