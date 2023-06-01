Algoritmo clase24_7extra
	Definir ventasDias, i, j, k, totalProducto, totalSemana, masVendido, aux, aux2 Como Entero
	Dimension ventasDias(7,6)
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 4 Con Paso 1 Hacer
			ventasDias(i,j) = Aleatorio(10, 20)
		FinPara
	FinPara
	
	/// Total de la semana
	totalSemana = 0 
	Para j = 0 Hasta 4 Con Paso 1 Hacer
		Para i = 0 Hasta 4 Con Paso 1 Hacer
			totalSemana = totalSemana + ventasDias(i,j)
			VentasDias(5,j) = totalSemana
		FinPara
		totalSemana = 0
	FinPara
	/// Total producto
	
	totalProducto = 0
	Para i = 0 Hasta 5 Con Paso 1 Hacer
		Para j = 0 Hasta 4 Con Paso 1 Hacer
			totalProducto = totalProducto + ventasDias(i,j)
		FinPara
		ventasDias(i,5) = totalProducto
		totalProducto = 0
	FinPara
	/// Producto mas vendido
	
	masVendido = 0
	aux = 0
	aux2 = 0
	
	Para j = 0 Hasta 4 Con Paso 1 Hacer
		Para i = 0 Hasta 4 Con Paso 1 Hacer
			masVendido = ventasDias(i,j)
			Si masVendido > aux2 Entonces
				aux2 = ventasDias(i,j)
				aux = i
			FinSi
		FinPara
		ventasDias(6,j) = aux + 1
		masVendido = 0
		aux2 = 0
	FinPara
	
	Escribir Sin Saltar "                        L    M    M    J    V   TotProd"
	Escribir ""
	
	Para i = 0 Hasta 5 Hacer
		Segun i hacer
			0:
				Escribir Sin Saltar "Producto 1           | "
			1:
				Escribir Sin Saltar "Producto 2           | "
			2:
				Escribir Sin Saltar "Producto 3           | "
			3:
				Escribir Sin Saltar "Producto 4           | "
			4:
				Escribir Sin Saltar "Producto 5           | "
			5:
				Escribir Sin Saltar "Total De la semana   | "
		FinSegun
		Para j = 0 Hasta 5 Hacer
			Escribir Sin Saltar "(", ventasDias(i,j),") "
		FinPara
		Escribir ""
	FinPara
	
	Escribir Sin Saltar "Producto mas vendido | "
	Para j = 0 Hasta 4 Hacer
		Escribir Sin Saltar "(", ventasDias(6,j), ")  "
	FinPara
	
	Escribir ""
FinAlgoritmo
