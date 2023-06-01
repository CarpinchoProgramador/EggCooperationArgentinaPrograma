Algoritmo sin_titulo
	
	Definir minNum1, maxNum1, midNum, contador  Como Entero
	
	Escribir "Ingrese un valor minimo entero."
	Leer minNum1
	Escribir "Ingrese un valor maximo entero."
	Leer maxNum1
	
	Escribir "A continuacion, ingrese un valor  que se encuentre entre ", minNum1, ' y ', maxNum1
	Leer midNum
	
	contador = 0
	
	Mientras midNum >= minNum1 y midNum <= maxNum1 Hacer
		
		Escribir "Ingrese otro valor que se encuentre entre ", minNum1,' y ',maxNum1
		Leer midNum
		contador = contador + 1
		
	FinMientras
	
	Escribir "Usted colocó ", contador, " veces un numero."
  	
FinAlgoritmo
