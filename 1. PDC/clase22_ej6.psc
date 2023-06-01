Algoritmo clase22_ej6
	Definir matriz, matrizMagica Como Entero
	Dimension matriz[3,3],matrizMagica[3,3]
	llenarMatriz(matriz)
	
	matrizMagica[0,0]=2
	matrizMagica[0,1]=7
	matrizMagica[0,2]=6
	matrizMagica[1,0]=9
	matrizMagica[1,1]=5
	matrizMagica[1,2]=1
	matrizMagica[2,0]=4
	matrizMagica[2,1]=3
	matrizMagica[2,2]=8
	
	si matrizEsMagica(matriz) = Verdadero Entonces
		Escribir "La matriz generada es una matriz mágica"
	SiNo
		Escribir "La matriz generada no es mágica"
		
	FinSi
	
	si matrizEsMagica(matrizMagica) = Verdadero Entonces
		Escribir "La matriz ingresada es una matriz mágica"
	SiNo
		Escribir "La matriz ingresada no es mágica"
		
	FinSi
	
FinAlgoritmo

SubProceso llenarMatriz(matriz)
	Definir i,j Como Entero
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j]=Aleatorio(1,9)
		Fin Para
	Fin Para
FinSubProceso


funcion validacion<-matrizEsMagica(matriz)
	Definir validacion Como Logico
	Definir i,j,suma1,suma2 Como Entero
	suma1=0
	suma2=0
	Para i<-0 Hasta 0 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			suma1=suma1+matriz[i,j]
		Fin Para
	Fin Para
	Para i<-1 Hasta 1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			suma2=suma2 + matriz[i,j]
		Fin Para
	Fin Para
	Si suma1 = suma2 Entonces
		suma2=0
		Para i<-2 Hasta 2 Con Paso 1 Hacer
			Para j<-0 Hasta 2 Con Paso 1 Hacer
				suma2=suma2+matriz[i,j]
			Fin Para
		Fin Para
		si suma1=suma2 entonces
			suma2=0
			Para j<-0 Hasta 0 Con Paso 1 Hacer
				Para i<-0 Hasta 2 Con Paso 1 Hacer
					suma2=suma2+matriz[j,i]
				Fin Para
			Fin Para
			si suma1=suma2 Entonces
				suma2=0
				Para j<-1 Hasta 1 Con Paso 1 Hacer
					Para i<-0 Hasta 2 Con Paso 1 Hacer
						suma2=suma2+matriz[j,i]
					Fin Para
				Fin Para
				si suma1=suma2 Entonces
					suma2=0
					Para j<-2 Hasta 2 Con Paso 1 Hacer
						Para i<-0 Hasta 2 Con Paso 1 Hacer
							suma2=suma2+matriz[j,i]
						Fin Para
					Fin Para
					si suma1=suma2 Entonces
						suma2=0
						Para i<-0 Hasta 2 Con Paso 1 Hacer
							Para j<-0 Hasta 2 Con Paso 1 Hacer
								si i=j Entonces
									suma2=suma2+matriz[i,j]
								FinSi
							Fin Para
						Fin Para
						si suma1=suma2 Entonces
							suma2=0
							Para i<-0 Hasta 2 Con Paso 1 Hacer
								Para j<-0 Hasta 2 Con Paso 1 Hacer
									si i+j=2 Entonces
										suma2=suma2+matriz[i,j]
									FinSi
								Fin Para
							Fin Para
						FinSi
						si suma1=suma2 Entonces
							validacion=Verdadero
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	SiNo
		validacion=Falso
	Fin Si
	
	
	
FinFuncion
	