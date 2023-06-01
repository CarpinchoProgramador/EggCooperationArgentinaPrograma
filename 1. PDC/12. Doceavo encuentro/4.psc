//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La fun-
//ción debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la fun-
//ción Subcadena().

Algoritmo sin_titulo
	Definir frase,letra Como Caracter
	Definir resultado Como Entero
	
	Escribir "Ingrese una frase"
	leer frase
	Escribir "Que letra quieres saber cuantas veces se repite"
	leer letra
	
	resultado=contarLetra(frase,letra)
	
	Escribir "Veces que la letra ",letra," se repitio dentro de la frase ",frase," : ",resultado
	
FinAlgoritmo

Funcion retornar = contarLetra(f,l)
	
	Definir retornar,i,cont Como Entero
	Definir aux Como Caracter
	
	cont= 0
	
	para i = 0 Hasta Longitud(f) Hacer
		aux=''
		aux=Subcadena(f,i,i)
		
		Si aux == l Entonces
			cont=cont+1
		FinSi
		
	FinPara
	
	retornar = cont
	
	//Hola = H 0 O 1 L 2 A 3
FinFuncion