Algoritmo sin_titulo
	
	Definir eleccion, tipoCafe Como Caracter
	Escribir "Ingrese que desea tomar: T� o caf�"
	Leer eleccion
	
	
	Si eleccion = "te" O eleccion = "Te" O eleccion = "T�" O eleccion = "t�" Entonces
		
		Escribir "Se preparar� t�"
	SiNo 
		Si eleccion = "cafe" O eleccion = "caf�" O eleccion = "Cafe" O eleccion = "Caf�" Entonces
			
			Escribir "Cortado?"
			Leer eleccion
			
			Si eleccion = "si" o eleccion = "Si" Entonces
				
				Escribir "�Quiere su caf� con leche vegetal?"
				Leer eleccion
				
				Si eleccion = "Si" o eleccion = "si" Entonces
					Escribir "Usted eligi� tomar Caf� con leche vegetal."
				SiNo
					Escribir "Usted eligi� tomar Caf� Cortado normal."
				FinSi
			SiNo
				Escribir "Se preparar� caf� solo"
			FinSi
		FinSi
	FinSi
	
	Si eleccion <> "te" O eleccion <> "Te" O eleccion <> "T�" O eleccion <> "t�" o eleccion <> "cafe" O eleccion <> "caf�" O eleccion <> "Cafe" O eleccion <> "Caf�" Entonces
		Escribir "Opcion no disponible."
	FinSi
FinAlgoritmo
