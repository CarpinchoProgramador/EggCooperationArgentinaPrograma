Algoritmo sin_titulo

	Definir bebida, tipoCafe, lecheCafe Como Caracter
	
	Escribir "¿Quiere té o café?"
	Leer bebida
	
	Segun bebida hacer	
	"Té":
		Escribir "Usted eligió té"
	"Café":
		Escribir "¿Quiere su café solo o cortado?"
		Leer tipoCafe
		Segun tipoCafe Hacer
			
			"Solo":
				Escribir "Usted eligió café solo."
			"Cortado":
				Escribir "¿Lo quiere con leche vegetal?"
				Leer lecheCafe
				Segun lecheCafe Hacer
					"Si":
						Escribir "Usted eligió café con leche vegetal."
					"No":
						Escribir "Usted eligió café cortado normal."
				FinSegun
				
		
				FinSegun
		FinSegun
		
FinAlgoritmo
