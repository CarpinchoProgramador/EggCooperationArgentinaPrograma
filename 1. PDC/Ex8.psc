Algoritmo sin_titulo
	Definir i,j,m Como Entero
	Definir vend,z Como Caracter
	
	Dimension vend(5),z(7),m(6,7)
	
	
	tabla(vend,z)
	ventasT(m,vend,z)
	totalXV(m)
	totalSemana(m)
	
	
	Escribir Sin Saltar "[            ]"
	para i = 0 Hasta 6 Hacer
		Escribir Sin Saltar "[" z(i) "]"
	FinPara
	Escribir ""
	
	para i = 0 Hasta 3 Hacer
		Escribir Sin Saltar "[" vend(i) "]"
		para j = 0 Hasta 6 Hacer
			Escribir Sin Saltar "[     " m(i,j) "      ]"
		FinPara
		Escribir ""
	FinPara
	
	para i = 4 Hasta 4 Hacer
		Escribir Sin Saltar "[" vend(i) "]"
		para j = 0 Hasta 4 Hacer
			Escribir Sin Saltar "[     " m(i,j) "     ]"
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo

SubProceso tabla(x Por Referencia,z Por Referencia)
	Definir i,j Como Entero
	
	x(0)='Jose        '
	x(1)='Luis        '
	x(2)='Marcelo     '
	x(3)='Jorge       '
	x(4)='TotalTodos_V'
	
	z(0)='Norte       '
	z(1)='Este        '
	z(2)='Oeste       '
	z(3)='Sur         '
	z(4)='Centro      '
	z(5)='TotalVendedor'
	z(6)='Total Ventas'
	
	
	Escribir Sin Saltar "[            ]"
	para i = 0 Hasta 6 Hacer
		Escribir Sin Saltar "[" z(i) "]"
	FinPara
	Escribir ""
	
	para i = 0 Hasta 3 Hacer
		Escribir  "[" x(i) "]"
	FinPara
	Escribir ""
FinSubProceso

SubProceso totalSemana(x Por Referencia)
	Definir i,j,s Como Entero
	
	s=0
	para i = 0 Hasta 3 Hacer
		para j = 0 Hasta 0 Hacer
			s=s+x(i,j)
			x(4,0)=s
		FinPara
	FinPara
	
	s=0
	para i = 0 Hasta 3 Hacer
		para j = 1 Hasta 1 Hacer
			s=s+x(i,j)
			x(4,1)=s
		FinPara
	FinPara
	
	s=0
	para i = 0 Hasta 3 Hacer
		para j = 2 Hasta 2 Hacer
			s=s+x(i,j)
			x(4,2)=s
		FinPara
	FinPara
	
	s=0
	para i = 0 Hasta 3 Hacer
		para j = 3 Hasta 3 Hacer
			s=s+x(i,j)
			x(4,3)=s
		FinPara
	FinPara
	
	s=0
	para i = 0 Hasta 3 Hacer
		para j = 4 Hasta 4 Hacer
			s=s+x(i,j)
			x(4,4)=s
		FinPara
	FinPara
	para i = 0 Hasta 3 Hacer
		para j = 5 Hasta 6 Hacer
			x(4,5)=0
			x(4,6)=0
		FinPara
	FinPara
	
	
FinSubProceso
SubProceso  ventasT(x Por Referencia,z,c)
	Definir i,j,sumTV Como Entero
	
	Escribir "Presione la tecla  *ENTER* para empezar a ingresar los datos"
	Esperar Tecla
	Limpiar Pantalla
	para i = 0 Hasta 3 Hacer
		sumTV=0
		para j = 0 Hasta 4 Hacer
			Escribir "Ingrese las ventas del vendedor " z(i) "en la zona " c(j)
			leer x(i,j)
			sumTV=sumTV+x(i,j)
			x(i,6)=sumTV
		FinPara
		Limpiar Pantalla
		Escribir "Precione *ENTER* para ingresar los datos del proximo vendedor"
		Esperar Tecla
		Limpiar Pantalla
	FinPara
	
	
FinSubProceso

SubProceso totalXV(x por referencia)
	Definir i,j,tV Como Entero
	
	para i = 0 Hasta 3 Hacer
		tV=0
		para j = 0 Hasta 4 Hacer
			si x(i,j) > 0 Entonces
				tV=tV+1
				x(i,5)=tV
			FinSi
		FinPara
	FinPara
FinSubProceso
	