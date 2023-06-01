Algoritmo sin_titulo
	
	Definir palabraUno Como Caracter
	Definir numeroUno Como Entero
	
	Escribir "Ingrese una frase o plabara."
	Leer palabraUno
	
	numeroUno = Longitud(palabraUno) - 1

	si Minusculas(Subcadena(palabraUno, 0, 0)) = Minusculas(Subcadena(palabraUno, numeroUno, numeroUno)) Entonces
		Escribir "CORRECTO"
		
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
	
	
FinAlgoritmo