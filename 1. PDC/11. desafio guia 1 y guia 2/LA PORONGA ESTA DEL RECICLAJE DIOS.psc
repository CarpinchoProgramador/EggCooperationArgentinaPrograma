Algoritmo sin_titulo
	
	///recibimos dinero a cambio de botellas
	
	Definir usuario, contrasena, eleccion  Como Caracter
	Definir intentosContrasena,  j, k, saldo, cantBotellas, pesoBotellas, precioBotellas  Como Entero
	
	intentosContrasena = 2
	j = 0
	pesoBotellas = 0
	saldo = 0
	
	
	Escribir "Ingrese su nombre de usuario."
	Leer usuario
	
	
	//Parte del nombre usuario. Facil de entender
	Si usuario = "Albus_D"
		Escribir "Usuario correcto."
	SiNo
		Mientras usuario <> "Albus_D"
			Escribir "usuario incorrecto. Ingreselo nuevamente."
			Escribir ""
			Leer usuario
		FinMientras
	FinSi
	
	Escribir "Ingrese su contrase�a. posee: 3 intentos."
	Leer contrasena
	
	
	
	//Parte de la contrase�a. Si la contrase�a es incorrecta una vez pasados los 3 intentos se termina la condicional Hacer / Mientras Que 
	Hacer
		
		Si contrasena = "caramelosDeLimon" ///Si la contrase�a es correcta se muestra este mensaje
			Escribir "Contrase�a correcta."
			Escribir ""
			
			Mientras j <> 3 Hacer
				intentosContrasena = 0 ///Se coloca intentosContrasena = 0 porque es necesario para que termin� el programa en si. Chequear Linea 115
				
				Escribir "Seleccione una opci�n:"
				Escribir "1) Ingresar botellas."
				Escribir "2) Consultar saldo."
				Escribir "3) Salir. "
				Leer j
				
				Si j = 1 Entonces
					
					Escribir "�Cuantas botellas ingresar�?"
					Leer cantBotellas
					precioBotellas = 0
					
					Para k = 1 Hasta  cantBotellas Hacer
						
						pesoBotellas = Aleatorio(100, 3000)
						
						Si pesoBotellas <= 500 Entonces
							precioBotellas = precioBotellas + 50
						FinSi
						
						Si pesoBotellas >= 501 y pesoBotellas <= 1500 Entonces
							
							precioBotellas = precioBotellas + 125
						FinSi
						
						si pesoBotellas >= 1501 Entonces
							
							precioBotellas = precioBotellas + 200
							
						FinSi
						
						
					FinPara
					
					Escribir "Usted recibira $", precioBotellas
					Escribir ""
					Escribir "�Desea aceptar la transacci�n? s/n"
					Leer eleccion
					
					Si eleccion = 's'
						Escribir "Transacci�n exitosa."
						Escribir ""
						saldo = saldo + precioBotellas
						Escribir "Usted recibi�: $", precioBotellas
						Escribir ""
					FinSi
					
					Si eleccion = 'n'
						Escribir "Devolviendo material."
						Escribir ""
					FinSi
					
				FinSi
				
				Si j = 2 Entonces
					
					Escribir "Su saldo es de: "
					Escribir '$', saldo
					Escribir ""
				FinSi
				
			FinMientras
			
		SiNo
			Hacer		///Es la parte mas caotica. Basicaly, una vez que te quedas sin intentos se termina el bucle hacer
				Escribir "Contrase�a incorrecta. Posee: " intentosContrasena, " intentos."
				Leer contrasena
				intentosContrasena = intentosContrasena - 1
			Mientras Que intentosContrasena >= 2
			
			Si intentosContrasena = 0 Entonces
				Escribir "Se qued� sin intentos."
			FinSi
			
		FinSi
		
	Mientras que intentosContrasena > 0	///esta parte es importante, porque si la contrase�a que colocas es correcta y seguis teniendo intentos el programa vuelve al principio.
	Escribir "Gracias por venir. Vuelva pronto."
FinAlgoritmo
