Algoritmo sin_titulo
	
	Definir notaPractica, notaTeoria, notaProblemas, promedio Como Real
	Definir alumno Como Caracter
	
	Escribir "Ingrese su nombre"
	Leer alumno
	
	Mientras Longitud(alumno) > 0 Hacer
		
		Escribir "Ingrese su nota de practica."
		leer notaPractica
		
		Mientras notaPractica >= 0 y notaPractica <= 10 Hacer
			
			Escribir "Ingrese su nota de teoria."
			leer notaTeoria
			
			Mientras notaTeoria >= 0 y notaTeoria <= 10 Hacer
				
				Escribir "Ingrese su nota de problemas."
				leer notaProblemas
				
				Mientras notaProblemas >= 0 y notaProblemas <= 10 Hacer 
					
					promedio = (notaPractica * 0.1) + (notaTeoria * 0.4) + (notaProblemas * 0.5)
					
					Escribir "El promedio de ", alumno, " es de ", promedio
					
					Escribir "Ingrese el nombre del siguiente alumno."
					Leer alumno
					
				FinMientras
			FinMientras
		FinMientras
	FinMientras
	
	Escribir "Error. Nombre o Calificacíon invalida."
	
FinAlgoritmo
