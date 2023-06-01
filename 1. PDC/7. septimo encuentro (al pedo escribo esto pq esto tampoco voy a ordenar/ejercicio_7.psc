Algoritmo ejercicio_7
	
	Escribir "Escriba el nombre del alumno"
	Definir nombre Como Caracter
	Leer nombre
	
	Definir var1 Como Entero
	var1 = Longitud(nombre)
	
	Definir notaPra Como Real
	notaPra = 0
	
	Definir notaPro Como Real
	notaPro = 0
	
	Definir notaT Como Real
	notaT = 0
	
	Definir calificacion Como Real
	calificacion = 0
	
	Mientras var1 <> 0  Hacer
		
		Escribir "Escriba la nota de práctica"
		Leer notaPra
		
		Escribir "Escriba la nota de problemas"
		Leer notaPro
		
		Escribir "Escriba la nota de teoría"
		Leer notaT
		
		calificacion = (notaPra *  0.1) + (notaPro * 0.5) + (notaT * 0.4)
		
		Escribir "La calificación de ", nombre, " es de: " calificacion
		
		Escribir "--------------------- "
		Escribir "Escriba el nombre del siguiente alumno"
		Leer nombre
		var1 = Longitud(nombre)
		
		
	Fin Mientras
	
	
FinAlgoritmo