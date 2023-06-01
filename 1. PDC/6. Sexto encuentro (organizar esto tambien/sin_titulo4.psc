Algoritmo sin_titulo
	
	Definir eleccion, tipoCafe Como Caracter
	Escribir "Ingrese que desea tomar: Té o café"
	Leer eleccion
	
	
	Si eleccion = "te" O eleccion = "Te" O eleccion = "Té" O eleccion = "té" Entonces
		
		Escribir "Se preparará té"
	SiNo 
		Si eleccion = "cafe" O eleccion = "café" O eleccion = "Cafe" O eleccion = "Café" Entonces
			
			Escribir "Cortado?"
			Leer eleccion
			
			Si eleccion = "si" o eleccion = "Si" Entonces
				
				Escribir "¿Quiere su café con leche vegetal?"
				Leer eleccion
				
				Si eleccion = "Si" o eleccion = "si" Entonces
					Escribir "Usted eligió tomar Café con leche vegetal."
				SiNo
					Escribir "Usted eligió tomar Café Cortado normal."
				FinSi
			SiNo
				Escribir "Se preparará café solo"
			FinSi
		FinSi
	FinSi
	
	Si eleccion <> "te" O eleccion <> "Te" O eleccion <> "Té" O eleccion <> "té" o eleccion <> "cafe" O eleccion <> "café" O eleccion <> "Cafe" O eleccion <> "Café" Entonces
		Escribir "Opcion no disponible."
	FinSi
FinAlgoritmo
