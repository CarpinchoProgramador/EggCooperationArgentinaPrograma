Algoritmo sin_titulo
	
	Definir vocalUsuario, Random Como caracter
	Definir auxRandom Como Entero
	
	auxRandom = AZAR(5)
	Random  = Subcadena("aeiou", auxRandom, auxRandom)	
	
	Escribir "Elija una vocal"
	leer vocalUsuario
	
	Mientras Minusculas(vocalUsuario) <> Random
		
		Escribir "Intente nuevamente."
		leer vocalUsuario
		
	FinMientras
	
	Escribir "Usted acertó la vocal."
	
FinAlgoritmo