Algoritmo sin_titulo
	
	//Realizar un programa que pida al usuario el horario en el que se conect� al zoom. Si ese horario
	//est� entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrar� un mensaje por
	//pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese l�mite,
	//	se mostrar� un mensaje por pantalla que diga "Hoy tendr�s tardanza. Recuerda avisarle a tus
	//	coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es
	//	VITAL"
	
	definir horarioEntrada, aux Como Entero
	
	Escribir "Ingrese su horario de entrada en formato militar."
	Leer horarioEntrada
	
	
	Si horarioEntrada >= 1600 y horarioEntrada < 1900 Entonces
		
		Si horarioEntrada >= 1600 y horarioEntrada <= 1615 Entonces
			
			Escribir "Llegaste a tiempo."
		SiNo
			
			Escribir "hoy tendras tardanza."
			
		FinSi
	SiNo
		Escribir "Horario fuera de turno."
		
	FinSi
	
FinAlgoritmo
