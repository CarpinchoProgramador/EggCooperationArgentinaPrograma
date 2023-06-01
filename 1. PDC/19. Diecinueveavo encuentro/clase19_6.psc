Algoritmo clase19_6
	Definir listaCaracteres, frase, caracterUsuario Como Caracter
	Definir siCaracter, i, j Como Entero
	
	Dimension listaCaracteres[20]
	
	Escribir "Ingrese una frase: "
	Leer frase	
	
	para i = 0 Hasta 19 Con Paso 1 Hacer
		listaCaracteres[i] = Subcadena(frase, i, i)
	FinPara
	
	Escribir "Ingrese un caracter a ingresar en el arreglo."
	Leer caracterUsuario
	
	Hacer
		Escribir "Ingrese el subindice donde colocar el caracter." 
		Leer siCaracter
		Si listaCaracteres[siCaracter] <> " " Entonces
			Escribir "Posicion no valida."
		FinSi
	Mientras Que listaCaracteres[siCaracter] <> " "
	
	listaCaracteres[siCaracter] = caracterUsuario
	
	Escribir "El arreglo quedaria de esta manera: "
	
	Para j = 0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar "[", listaCaracteres[j], "] "
	FinPara
FinAlgoritmo
