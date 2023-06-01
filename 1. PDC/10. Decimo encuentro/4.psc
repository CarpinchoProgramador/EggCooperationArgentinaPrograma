Algoritmo sin_titulo
	
	Definir j, ventas, comisiones, sueldoBase, salario, cantEmp, n, sumaVenta, valorVenta Como Real
	
	
	Escribir "Ingrese la cantidad de empleados."
	Leer cantEmp
	
	sumaVenta = 0
	sueldoBase = 500
	
	Para n <- 1 Hasta cantEmp Con Paso 1 Hacer
		Escribir "Ingrese las cantidad de ventas de vendedor ", n
		Leer ventas
		
		Para j <- 1 Hasta ventas Con Paso 1 Hacer
			
			Escribir "Ingrese el valor de cada venta."
			Leer valorVenta
			sumaVenta = sumaVenta + valorVenta
			
			Escribir "La venta ", j, " es de $", valorVenta
			
			Si j = ventas
				comisiones = sumaVenta * 0.10
				Escribir "El pago semanal por comisiones del empleado ", n , " es de :$", comisiones
				Escribir "El pago total del empleado ", n, " es de: $", sueldoBase + comisiones
			FinSi
		FinPara
	FinPara
	
FinAlgoritmo
