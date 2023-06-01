Algoritmo clase15_5
	Definir frase, fraseFinal Como Caracter
	
	Escribir "Ingrese una palabra o frase."
	Leer frase
	
	fraseFinal = ""
	convertirEspaciado(frase, fraseFinal)
	
	Escribir fraseFinal
	
FinAlgoritmo

SubProceso convertirEspaciado(frase Por Valor, fraseFinal Por Referencia)
	
	Definir i Como Entero
	Definir letra Como Caracter
	
	Para i = Longitud(frase) Hasta 0 Hacer
		
		letra = ""  
		letra = Subcadena(frase, i, i)
		
		fraseFinal = Concatenar(letra, fraseFinal)
		fraseFinal = Concatenar(" ", fraseFinal)
		
	FinPara
FinSubProceso