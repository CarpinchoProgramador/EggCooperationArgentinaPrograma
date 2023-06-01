Algoritmo clase15_4
	Definir frase, fraseFinal, chequeoPunto Como Caracter

	Escribir "Ingrese una palabra o frase."
	Leer frase
	
	chequeoPunto = Subcadena(frase, Longitud(frase)-1, Longitud(frase)-1) ///Esta variable sirve para guardar el ultimo caracter de nuestra frase.
	
	Mientras chequeoPunto <> '.' Hacer /// Con este mientras chequeamos si el ultimo caracter es un punto. De no serlo el programa nos vuelve a pedir una frase.
		Escribir "Su frase no termina en punto. Ingresela de nuevo."
		Leer frase
		chequeoPunto = Subcadena(frase, Longitud(frase)-1, Longitud(frase)-1)
	FinMientras
	
	fraseFinal = ""
	conversioCaracteres(frase, fraseFinal)
	
	Escribir fraseFinal
	
FinAlgoritmo

SubProceso conversioCaracteres(frase Por Valor, fraseFinal Por Referencia)
	
	Definir i Como Entero
	Definir letra Como Caracter
	
	Para i = Longitud(frase) Hasta 0 Hacer
		
		letra = ""  
		letra = Minusculas(Subcadena(frase, i, i))
		
		Segun letra Hacer
			'a':
				fraseFinal = concatenar('@', fraseFinal)
			'e':
				fraseFinal = concatenar('#', fraseFinal)
			'i':
				fraseFinal = concatenar('$', fraseFinal)
			'o':
				fraseFinal = concatenar('%', fraseFinal)
			'u':
				fraseFinal = concatenar('*', fraseFinal)
			De Otro Modo:
				fraseFinal = Concatenar(letra, fraseFinal)
		FinSegun 
		
	FinPara
FinSubProceso
	