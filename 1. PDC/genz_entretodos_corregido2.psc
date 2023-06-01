Algoritmo genz_entretodos_corregido2
	definir i, j, k, dimen, cont Como Real
	definir matriz, muestra, n como caracter
	escribir " Ingrese la muestra"
	hacer 
		leer muestra
		dimen = raiz(longitud(muestra))
		si dimen <> 3 y dimen <> 4 y dimen <> 37 Entonces
			escribir " la muestra ingresada es incorrecta "
		FinSi
	Mientras Que dimen <> 3 y dimen <> 4 y dimen <> 37
	
	dimension matriz[dimen,dimen]
	Escribir dimen
	cont = 0
	para i = 0 hasta longitud(muestra)-1 con paso 1 Hacer
		si subcadena(muestra,i,i) <> "A" Y subcadena(muestra,i,i) <> "B" Y subcadena(muestra,i,i) <> "C" Y subcadena(muestra,i,i) <> "D" Entonces
			cont = 1
		FinSi
		
	FinPara
	si cont >= 1 entonces
		escribir " La muestra ingresada no es valida"
		
	FinSi
	
	matrizgenz(matriz, muestra, dimen)
	verificaciongenz(matriz, dimen)
FinAlgoritmo

SubProceso matrizgenz(matriz, muestra, dimen)
	definir cont, i, j como real
	cont = 0
	para i = 0 hasta dimen-1 con paso 1 Hacer
		para j = 0 hasta dimen-1 con paso 1 Hacer
			matriz[i,j] = subcadena(muestra,cont,cont)
			cont = cont + 1
		FinPara
	FinPara
	para i = 0 hasta dimen-1 con paso 1 Hacer
		para j = 0 hasta dimen-1 con paso 1 Hacer
			escribir sin saltar "[" matriz[i,j] "] "
		FinPara
		escribir ""
	FinPara
	
	
	
FinSubProceso

SubProceso verificaciongenz(matriz, dimen)
	definir cont, i, j, control, contDiag1, contDiag2 como real
	Definir validDiagonal1, validDiagonal2 Como Caracter
	Dimension validDiagonal1(dimen), validDiagonal2(dimen)
	
	para i = 0 hasta dimen -1
		para j = 0 hasta dimen -1
			si i=j 
				validDiagonal1(i) = matriz(i,j)
			FinSi
			Si i+j = dimen-1
				validDiagonal2(i) = matriz(i,j)
			FinSi
		FinPara
	FinPara
	
	
	contDiag1 = 0
	contDiag2 = 0
	para i = 0 Hasta dimen - 1 Hacer
		si validDiagonal1(i) = matriz(0,0)
			contDiag1 = contDiag1 + 1
		FinSi
		si validDiagonal2(i) = matriz(0,dimen-1)
			contDiag2 = contDiag2 + 1
		FinSi
	FinPara
	
	Si contDiag1 = dimen y contDiag2 = dimen Entonces
		Escribir "Se encontró el GenZ con las letras " matriz(0,0) " y " matriz(0,dimen-1)
	SiNo
		Escribir "No se encontró el GenZ"
	FinSi
FinSubProceso
