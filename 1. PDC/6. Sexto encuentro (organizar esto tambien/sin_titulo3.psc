Algoritmo sin_titulo

	Definir bebida, tipoCafe, lecheCafe Como Caracter
	
	Escribir "�Quiere t� o caf�?"
	Leer bebida
	
	Segun bebida hacer	
	"T�":
		Escribir "Usted eligi� t�"
	"Caf�":
		Escribir "�Quiere su caf� solo o cortado?"
		Leer tipoCafe
		Segun tipoCafe Hacer
			
			"Solo":
				Escribir "Usted eligi� caf� solo."
			"Cortado":
				Escribir "�Lo quiere con leche vegetal?"
				Leer lecheCafe
				Segun lecheCafe Hacer
					"Si":
						Escribir "Usted eligi� caf� con leche vegetal."
					"No":
						Escribir "Usted eligi� caf� cortado normal."
				FinSegun
				
		
				FinSegun
		FinSegun
		
FinAlgoritmo
