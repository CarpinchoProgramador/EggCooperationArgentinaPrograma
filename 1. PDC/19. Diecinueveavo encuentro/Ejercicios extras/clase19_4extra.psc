Algoritmo clase19_4extra
	Definir notasAlumnos, i, contadorD, contadorr, contadorb, contadore Como Entero
	Dimension notasAlumnos[100]
	
	contadorD = 0
	contadorR = 0
	contadorB = 0
	contadorE = 0
	
	Para i = 0 Hasta 99 Con Paso 1 Hacer
		notasAlumnos[i] = azar(20)
	FinPara
	
	Para i = 0 Hasta 99 Con Paso 1 Hacer
		Segun notasAlumnos[i] Hacer
			0,1,2,3,4,5:
				contadorD = contadorD + 1
			6,7,8,9,10:
				contadorR = contadorR + 1
			11,12,13,14,15:
				contadorB = contadorB + 1
			16,17,18,19,20:
				contadorE = contadorE + 1
		FinSegun
	FinPara
	
	Escribir "Alumnos deficientes: ", contadorD
	Escribir "Alumnos regulares: ", contadorR
	Escribir "Alumnos buenos: ", contadorB
	Escribir "Alumnos excelentes: ", contadorE
	
FinAlgoritmo
