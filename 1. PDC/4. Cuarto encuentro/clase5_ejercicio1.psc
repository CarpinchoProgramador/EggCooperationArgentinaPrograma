Algoritmo sin_titulo
	
	//Realizar un programa que pida al usuario el horario en el que se conectó al zoom. Si ese horario
	//está entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrará un mensaje por
	//pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese límite,
	//	se mostrará un mensaje por pantalla que diga "Hoy tendrás tardanza. Recuerda avisarle a tus
	//	coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es
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
