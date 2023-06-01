Algoritmo sin_titulo

	Definir n, ni, ne, np, numAlum, suma, numRepro, notaPromedio, nota, alumno, contRepro, contInt, contPrac Como Real
	
	contRepro = 0
	contInt = 0
	contPrac = 0
	
	Escribir "Ingresar la cantidad de alumnos."
	Leer numAlum
	
	Para n<-1 Hasta numAlum Con Paso 1 Hacer
		
		Escribir "Ingrese nota integrador."
		Leer ni
		
		Escribir "Ingrese nota exposición."
		Leer ne
		
		Escribir "Ingrese nota practico."
		Leer np
		
		nota = 0.35 * ni + 0.25 * ne + 0.40 * np
		Escribir "la nota del alumno: ", n, " son: ", ni," ", ne," ", np
		Escribir "la nota final es: ", nota
		
		Si nota < 6.5 Entonces
			contRepro = contRepro + 1
		FinSi
		
		Si ni > 7.5 Entonces
			contInt = contInt +1
		FinSi
		
		Si np <= 7.5 y np >= 4 Entonces
			contPrac = contPrac + 1

		FinSi
		
	FinPara
	
	Escribir "La cantidad de alumnos es de: ", numAlum
	Escribir "la cantidad de reprobados es de: ", contRepro, " alumnos."
	Escribir "La cantidad que aprobaron el integrador es de: ", contInt/numAlum * 100, '%'
	Escribir "La cantidad que aprobaron el practico es de: ", contPrac
	
FinAlgoritmo
