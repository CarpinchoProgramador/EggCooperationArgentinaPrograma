Algoritmo sin_titulo
	
	Definir palabra Como Caracter;
	
	Escribir "Introduzca una palabra"
	Leer palabra
	
	Si Longitud(palabra) = 4 Entonces
		Escribir Concatenar(palabra, '!')
	SiNo
		Escribir Concatenar(palabra, '?')
	FinSi
	
FinAlgoritmo