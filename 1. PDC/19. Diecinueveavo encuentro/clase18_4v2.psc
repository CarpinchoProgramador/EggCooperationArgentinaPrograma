Algoritmo Guia5Encuentro_18192021_Ejer4
	Definir N como entero 	
	N=0
	Escribir " Ingrese el tamaño de las listas N (menor 100) de valores que desee "
	Leer N
	Menu(N)
FinAlgoritmo

SubProceso Menu(N Por Referencia)
	Definir Opc Como Entero
	Definir Lista1,Lista2,Lista3,Lista4 Como Real
	Dimension Lista1(N)
	Dimension Lista2(N)
	Dimension Lista3(N)
	Dimension Lista4(N)
	
	Escribir "         ------ Ingrese una opción del Menu ------ "
	Escribir " 1 -- Lista 1, se llenará de manera aleatoria entre valores -100 a 100  "
	Escribir " 2 -- Lista 2, se llenará de manera aleatoria entre valores -100 a 100  "
	Escribir " 3 -- Lista 3, se llenará de la suma de las primeras 2 listas "
	Escribir " 4 -- Lista 4, se llenará de la resta de las primeras 2 listas,(elemento de 2 - elemento 1)"
	Escribir " 5 -- Mostrar lista "
	Escribir " 6 -- Salir "
	
	Leer Opc
	mientras opc>=1 y opc<6 
		Segun Opc Hacer
			1:Lis1(N,Lista1)
			2:Lis2(N,Lista2)
			3:Lis3(N,Lista1,Lista2,Lista3)
			4:Lis4(N,Lista1,Lista2,Lista4)
			5:Most(N,Lista1,Lista2,Lista3,Lista4)
		FinSegun
		Leer Opc
		Finmientras
FinSubProceso

SubProceso Lis1(N Por Referencia,Lista1 Por Referencia)
	
Definir i como real

	Para i<-0 hasta N-1 Hacer
		Lista1(i)= Aleatorio(-100,100)
	FinPara
FinSubProceso

SubProceso Lis2(N Por Referencia,Lista2 Por Referencia)
	
Definir i como real
	
	Para i<-0 hasta N-1 Hacer
		Lista2(i)= Aleatorio(-100,100)
	FinPara	
FinSubProceso

SubProceso Lis3(N Por Referencia,Lista1 Por Referencia,Lista2 Por Referencia,Lista3 Por Referencia)
	Definir i como real
	
	Para i<-0 hasta N-1 Hacer
		Lista3(i)=Lista1(i)+Lista2(i)
	FinPara
FinSubProceso

SubProceso Lis4(N Por Referencia,Lista1 Por Referencia,Lista2 Por Referencia,Lista4 Por Referencia)
	Definir i como real
	
	Para i<-0 hasta N-1 Hacer
		Lista4(i)=Lista2(i)-Lista1(i)
	FinPara
FinSubProceso

Subproceso Most(N Por Referencia,Lista1 Por Referencia,Lista2 Por Referencia,Lista3 Por Referencia,Lista4 Por Referencia )
	Definir Opc,i como entero
	
	Escribir "Escribir una Opcion a mostar "
	
	Escribir "1 --- Ver Lista 1 "
	Escribir "2 --- Ver Lista 2 "
	Escribir "3 --- Ver Lista 3:Suma de anteriores "
	Escribir "4 --- Ver Lista 4:Resta de anteriores "
	Leer Opc
	Mientras Opc>=1 y Opc<5
	Segun Opc
		1: Para i<-0 hasta N-1
				Escribir Lista1(i)
			FinPara
		2:
			Para i<-0 hasta N-1
				Escribir Lista2(i)
			FinPara
		3:	Para i<-0 hasta N-1
				Escribir  Lista3(i)
			FinPara
		4:Para i<-0 hasta N-1
				Escribir Lista4(i)
			FinPara
	FinSegun
	Leer Opc
FinMientras	
FinSubProceso
	