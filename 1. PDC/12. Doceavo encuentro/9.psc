//Realiza una funci�n llamada Cooperar que reciba dos variables de tipo car�cter, una variable debe
//contener el mensaje "Cooperando" y la otra "trabajamos mejor". La funci�n debe concatenar am-
//bos textos.

Algoritmo sin_titulo
	Definir f1,f2,fraseCompleta Como Caracter
	
	f1="Cooperando "
	f2="Trabajamos Mejor"
	
	fraseCompleta = concantenarFrase(f1,f2)
	
	
	Escribir fraseCompleta
	
	Escribir concantenarFrase(f1,f2)
	
FinAlgoritmo

Funcion conc = concantenarFrase(frase1,frase2)
	Definir conc Como Caracter
	
	conc=Concatenar(frase1,frase2)	
FinFuncion