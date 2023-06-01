Algoritmo sin_titulo
	
FinAlgoritmo

SubProceso verificaciongenz(matriz, dimen)
	definir cont, i, j, control como real
	Definir validDiagonal1, validDiagonal2 Como Caracter
	Dimension validDiagonal1(dimen), validDiagonal2(dimen)
	
	para i = 0 hasta dimen -1
		para j = 0 hasta dimen -1
			si i=j 
				validDiagonal1(i) = matriz(i,j)
			FinSi
			Si i+j = m-1
				validDiagonal2 = matriz(i,j)
			FinSi
		FinPara
	FinPara
	
	
	contDiag1 = 0
	contDiag2 = 0
	para i = 0 Hasta dimen - 1 Hacer
		si validDiagonal1(i) = matriz(0,0)
			contDiag1 = contDiag1 + 1
		FinSi
		si validDiagonal1(i) = matriz(0,dimen - 1)
			contDiag2 = contDiag2 + 1
		FinSi
	FinPara
	
	Si contDiag1 = dimen y contDiag2 = dimen Entonces
		Escribir "Se encontró el GenZ con las letras " matriz(0,0) "y " matriz(0,dimen-1)
	SiNo
		Escribir "No se encontró el GenZ"
	FinSi
	
FinSubProceso