Algoritmo borradorPqsoyboludo
FinAlgoritmo


SubProceso menu()
	
	Definir a Como Entero
	
	Escribir "Seleccione una opción"
	
	Escribir ""
	
	Escribir "1. Calcular muro de ladrillo"
	Escribir "2. Calcular viga de hormigón"
	Escribir "3. Calcular columnas de hormigón"
	Escribir "4. Calcular contrapisos"
	Escribir "5. Calcular techo"
	Escribir "6. Calcular pisos"
	Escribir "7. Calcular pintura"
	Escribir "8. Calcular iluminación"
	Escribir "9. Salir"
	
	Escribir ""
	
	Leer a
	
	Segun a Hacer
		1:
			calcularMuro()
		2:
			calcularViga()
		3: 
			calcularColumna()
		4:
			calcularContrapisos()
		5:
			calcularTecho()
		6:
			calcularPisos()
		7:
			calcularPintura()
		8:
			calcularIluminacion()
		9:
			Escribir "Gracias por usar nuestro programa."
	FinSegun
	
FinSubProceso

SubProceso calcularMuro()
	Definir espesorMuro Como Entero
	Definir largoMuro, altoMuro,  metroCuadrado, volumen Como Real
	
	Escribir "¿El espesor del muro sera de 20cm o 30cm?"
	Leer espesorMuro
	
	Segun espesorMuro Hacer
		30:
			Escribir "Ingrese el largo del muro:"
			Leer largoMuro
			Escribir "Ingrese el alto del muro:"
			Leer altoMuro
			metroCuadrado = 0 
			
			
			calcularSuperficie(largoMuro, altoMuro, metroCuadrado)
			calcularVolumen(largoMuro, altoMuro, espesorMuro, volumen)
			
			Escribir "En total necesitaremos: "
			Escribir "Cemento: ", 15.2  * metroCuadrado, " KG."
			Escribir "Arena: ", volumen * 0.115, " M3."
			Escribir "Ladrillos: ", 120 * metroCuadrado
			
		20:
			Escribir "Ingrese el largo del muro:"
			Leer largoMuro
			Escribir "Ingrese el alto del muro:"
			Leer altoMuro
			metroCuadrado = 0 
			
			
			calcularSuperficie(largoMuro, altoMuro, metroCuadrado)
			calcularVolumen(largoMuro, altoMuro, espesorMuro, volumen)
			
			Escribir "En total necesitaremos: "
			Escribir "Cemento: ", 10.9  * metroCuadrado, " KG."
			Escribir "Arena: ", volumen * 0.09, " M3."
			Escribir "Ladrillos: ", 90  * metroCuadrado
	FinSegun
	
	Esperar 5 Segundos
	menu()
	
FinSubProceso

SubProceso calcularViga()
	Definir largoViga Como Real
	
	Escribir "Ingrese el largo en metros de la viga:"
	Leer largoViga
	
	Escribir "Cemento: ", largoViga * 9, " KG."
	Escribir "Arena: ", largoViga * 0.02, " M3."
	Escribir "Piedra: ", largoViga * 0.02, " M2."
	Escribir "Hierro 8: ", largoViga * 4, " Mts."
	Escribir "Hierro 4: ", largoViga * 3, " Mts."
	
	Esperar 5 Segundos
	menu()
	
FinSubProceso

SubProceso calcularColumna()
	Definir largoColumna Como Real
	
	Escribir "Ingrese el largo de la columna en metros: "
	Leer largoColumna
	
	Escribir "Cemento: ", largoColumna * 7.5, " Kg."
	Escribir "Arena: ", largoColumna * 0.016, " M3."
	Escribir "Piedra: ", largoColumna * 0.016, " M2."
	Escribir "Hierro del 10: ", largoColumna * 6, " Mts."
	Escribir "Hierro del 4: ", largoColumna * 3, " Mts."
	
	Esperar 5 Segundos
	menu()
	
FinSubProceso

SubProceso calcularContrapisos()
	Definir espesorContrapiso, largoContrapiso, anchoContrapiso, metroCubico Como Real
	
	Escribir "Ingrese el espesor del contrapiso: "
	Leer espesorContrapiso
	Escribir "Ingrese el largo del contrapiso: "
	Leer largoContrapiso
	Escribir "Ingrese el ancho del contrapiso: "
	Leer anchoContrapiso
	
	calcularVolumen(largoContrapiso, espesorContrapiso, anchoContrapiso, metroCubico)
	
	Escribir "Cemento: ", metroCubico * 105, " Kg."
	Escribir "Arena: ", metroCubico * 0.45, " M3."
	Escribir "Piedra:" metroCubico * 0.9, " M2."
	
	Esperar 5 Segundos
	menu()
	
FinSubProceso

SubProceso calcularTecho()
	
	Definir espesorTecho, largoTecho, anchoTecho, metroCuadrado, metroCubico Como Real
	
	Escribir "Ingrese el espesor del techo: "
	Leer espesorTecho
	Escribir "Ingrese el largo del techo: "
	Leer largoTecho
	Escribir "Ingrese el ancho del techo: "
	Leer anchoTecho
	
	calcularVolumen(largoTecho, espesorTecho, anchoTecho, metroCubico)
	calcularSuperficie(largoTecho, anchoTecho, metroCuadrado)
	
	Escribir "Cemento: ", metroCuadrado * 33, " Kg."
	Escribir "Arena: ", metroCubico * 0.072, " M3."
	Escribir "Piedra:" metroCuadrado * 0.072, " M2."
	Escribir "Hierro del 8: ", metroCuadrado * 7, " Mts."
	Escribir "Hierro del 6: ", metroCuadrado * 4, " Mts."
	
	Esperar 5 Segundos
	menu()
	
	
FinSubProceso

SubProceso calcularPisos()
	Definir largoPiso, anchoPiso, metroCuadrado Como Real
	
	Escribir "Ingrese el largo del piso: "
	Leer largoPiso
	Escribir "Ingrese el ancho del piso: "
	Leer anchoPiso
	
	calcularSuperficie(largoPiso, anchoPiso, metroCuadrado)
	
	Escribir "La superficie a cubrir es de: " metroCuadrado + (metroCuadrado * 0.10), " M2."
	
	Esperar 5 Segundos
	menu()
	
FinSubProceso

SubProceso calcularPintura()
	Definir largoPared, anchoPared, metroCuadrado Como Real
	
	Escribir "Ingrese el largo de la pared: "
	Leer largoPared
	Escribir "Ingrese el ancho de la habitacion: "
	Leer anchoPared
	
	calcularSuperficie(largoPared, anchoPared, metroCuadrado)
	
	Escribir "Los litros de pinturas necesarios son " metroCuadrado / 6 " Lts."
	
	Esperar 5 Segundos
	menu()
	
FinSubProceso


SubProceso calcularIluminacion()
	Definir largoHabitacion, anchoHabitacion, metroCuadrado Como Real
	
	Escribir "Ingrese el largo de la habitacion: "
	Leer largoHabitacion
	Escribir "Ingrese el ancho de la habitacion: "
	Leer anchoHabitacion
	
	calcularSuperficie(largoHabitacion, anchoHabitacion, metroCuadrado)
	
	Escribir "la cantidad mínima de superficie de iluminación natural es de ", metroCuadrado * 0.20
	
	Esperar 5 Segundos
	menu()
FinSubProceso

SubProceso calcularSuperficie(x Por Valor,i Por Valor, m2 Por Referencia)
	m2 = x * i
FinSubProceso

SubProceso calcularVolumen(x Por Valor, i Por Valor, z Por Valor, m3 Por Referencia)
	m3 = x * i * z
FinSubProceso