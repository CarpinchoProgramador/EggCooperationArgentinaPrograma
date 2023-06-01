Algoritmo clase20_5ejercicioextra
	Definir frase, fraseVector, caracterVector Como Caracter
	Definir subIndice Como Entero
	Dimension fraseVector[20]
	
	Escribir "Ingrese una frase."
	Leer frase
	
	rellenarVector(frase, fraseVector)
	
	Escribir "Ingrese un caractér a introducir en el arreglo."
	Leer caracterVector
	Escribir "Ingrese el subindice donde introducir el caracterVector."
	Leer subIndice
	
	insertarCaracter(caracterVector, fraseVector, subIndice)
	
FinAlgoritmo


///Este subproceso sirve para que cada subIndice de fraseVector[] tenga como valor 
///una letra de la frase que ingresamos.

SubProceso rellenarVector(frase Por Valor, fraseVector Por Referencia)
	Definir i Como Entero
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		fraseVector[i] = Subcadena(frase, i, i)
	FinPara
FinSubProceso

SubProceso insertarCaracter(caracterVector Por Valor, fraseVector Por Referencia, subIndice Por Valor)
	Definir aux Como Caracter
	Definir i Como Entero
	
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
	
	Si i == subIndice Entonces
		aux = fraseVector[i]
		Escribir Sin Saltar caracterVector
		Escribir Sin Saltar aux
	SiNo
		Escribir Sin Saltar fraseVector[i]
	FinSi
	FinPara

FinSubProceso
	