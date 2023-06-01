Algoritmo clase15_4_estructurapara
	
	Definir frase, letra, fraseFinal Como Caracter
	
	Escribir "Ingrese una palabra o frase."
	Leer frase
	fraseFinal = ""
	conversioCaracteres(frase, fraseFinal)
	
	Escribir fraseFinal
	
FinAlgoritmo

SubProceso conversioCaracteres(frase Por Valor, fraseFinal Por Referencia)
	Definir i Como Entero
	Definir letra Como Caracter
	
	Para i = 0 Hasta Longitud(frase) Hacer
		
		letra = ""
		
		letra = Minusculas(Subcadena(frase, i, i))
		
		Si letra = 'a' 
			fraseFinal = concatenar('@', fraseFinal)
		FinSi
		Si letra = 'e' 
			fraseFinal = concatenar('#', fraseFinal)
		FinSi
		Si letra = 'i' 
			fraseFinal = concatenar('$', fraseFinal)
		FinSi
		Si letra = 'o' 
			fraseFinal = concatenar('%', fraseFinal)
		FinSi
		Si letra = 'u' 
			fraseFinal = concatenar('*', fraseFinal)
		FinSi
		
		Si letra <> 'a' y letra <> 'e' y letra <> 'i' y letra <> 'o' y letra <> 'u' Entonces
			fraseFinal = Concatenar(letra, fraseFinal)
		FinSi
	FinPara
	
	
FinSubProceso