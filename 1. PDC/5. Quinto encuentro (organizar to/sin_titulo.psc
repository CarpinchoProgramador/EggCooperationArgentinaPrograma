Algoritmo sin_titulo
	
	Definir tiempoUso, litrosGastados Como Real
	
	Escribir "Ingrese las horas que us� el vehiculo."
	Leer tiempoUso
	
	Si tiempoUso <= 2 Entonces
		
		Escribir "Usted debe pagar $400."
		
	SiNo
		Escribir "Ingrese el combustible que consumi�."
		Leer litrosGastados
		
		Escribir "Usted tiene que pagar: $", litrosGastados * 40 + (tiempoUso * 60) * 5.20
		
	FinSi
	
FinAlgoritmo
