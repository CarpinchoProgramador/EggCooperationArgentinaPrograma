Algoritmo sin_titulo
	Definir valor1, valor2 Como Entero
	Definir operacion Como Caracter
	
	Escribir "Defina un valor A."
	Leer valor1
	Escribir "Defina un valor B."
	Leer valor2
	
	Escribir "Seleccione una operación aritmetica."
	Escribir "Suma: S"
	Escribir "Resta: R"
	Escribir "División: D"
	Escribir "Multiplicación: M"
	Leer operacion
	
	Segun operacion Hacer
		
		'S','s':
			Escribir "La suma de: ", valor1,' + ',valor2, ' = ', valor1 + valor2
			
		'R', 'r':
			Escribir "La resta de: ", valor1,' - ',valor2, ' = ', valor1 - valor2
			
		'D', 'd':
			
			Si valor2 = 0 Entonces
				Escribir "No se puede resolver."
				
			SiNo
				Escribir "La división de: ", valor1,' / ',valor2, ' = ', valor1 / valor2	
				
			FinSi
			
			
		'M', 'm':
			Escribir "La multiplicación de: ", valor1,' x ',valor2, ' = ', valor1 * valor2
			
		De Otro Modo:
			Escribir "Operación no valida."
			
	FinSegun
	
FinAlgoritmo
