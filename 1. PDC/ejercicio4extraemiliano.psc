Algoritmo sin_titulo
	//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
	//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 produc-
	//tos en los 5 días hábiles de la semana. Se desea conocer:
	//a) Total de ventas por cada día de la semana.
	//b) Total de ventas de cada producto a lo largo de la semana.
	//c) El producto más vendido en cada semana.
	//d) El nombre, el día de la semana y la cantidad del producto más vendido.
	//El informe final tendrá un formato como el que se muestra a continuación:
	
	//				Lunes Martes Miércoles Jueves Viernes Total producto
	
	//Producto 1
	//Producto 2
	//Producto 3
	//Producto 4
	//Producto 5
	//Total semana
	//Producto más
	//vendido
	Definir ventas,i,j,masVend,pos Como Entero
	Dimension ventas[7,6]
	masVend=0
	pos=0
	Para i = 0 Hasta 6 Hacer
		Segun i Hacer
			0: Escribir Sin Saltar "               "
			1: Escribir Sin Saltar "Lunes     "
			2: Escribir Sin Saltar "Martes    "
			3: Escribir Sin Saltar "Miercoles "
			4: Escribir Sin Saltar "Jueves    "
			5: Escribir Sin Saltar "Viernes   "
			6: Escribir  "Total prod"
		FinSegun
	FinPara
	Para i = 0 Hasta 5 Hacer
		Para j = 0 Hasta 4 Hacer
			Si j==0 Entonces
				ventas[i,j] =Aleatorio(50000,100000)
				ventas[i,5]=0+ventas[i,j]
			SiNo
				ventas[i,j] =Aleatorio(50000,100000)
				ventas[i,5]=ventas[i,5]+ventas[i,j]
			FinSi
			Si i==0 Entonces
				ventas[5,j]=0+ventas[i,j]
			SiNo
				ventas[5,j]=ventas[5,j]+ventas[i,j]
			FinSi
		FinPara
	FinPara
	Para i = 0 Hasta 5 Hacer
		Para j = 0 Hasta 4 Hacer
			Si ventas[j,i]>masVend Entonces
				masVend=ventas[j,i]
				pos=j+1
			FinSi
		FinPara
		ventas[6,i]=pos
		masVend=0
		pos=0
	FinPara
	Para i = 0 Hasta 6 Hacer
		Para j = 0 Hasta 5 Hacer
			Si j==0 Entonces 
				Segun i Hacer
					0: Escribir Sin Saltar "Producto 1     " ventas[i,j] "     "
					1: Escribir Sin Saltar "Producto 2     " ventas[i,j] "     "
					2: Escribir Sin Saltar "Producto 3     " ventas[i,j] "     "
					3: Escribir Sin Saltar "Producto 4     " ventas[i,j] "     "
					4: Escribir Sin Saltar "Producto 5     " ventas[i,j] "     "
					5: Escribir Sin Saltar "Tot Semana     " ventas[i,j] "    "
					6: Escribir Sin Saltar "Prod + vend    " ventas[i,j] "         "
				FinSegun
			SiNo
				Si i==5 Entonces
					Escribir Sin Saltar ventas[i,j] "    "
				SiNo
					Si i==6 Entonces
						Escribir Sin Saltar ventas[i,j] "         "
					SiNo
						Escribir Sin Saltar ventas[i,j] "     "
					FinSi
				FinSi
			FinSi
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo