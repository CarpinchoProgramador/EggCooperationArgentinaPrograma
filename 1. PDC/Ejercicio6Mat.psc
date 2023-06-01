Funcion Sum2 <- SumaFoC ( n, x , matmagica por referencia, banderaf por valor)
	definir Sum2 , z como entero
	Sum2 = 0
	Si banderaf entonces
	   Para z<-0 Hasta n-1 Con Paso 1 Hacer
		Sum2 = Sum2 + matmagica[x,z]
	   Fin Para
	sino
		Para z<-0 Hasta n-1 Con Paso 1 Hacer
			Sum2 = Sum2 + matmagica[z,x]
		Fin Para
	finsi
Fin Funcion

Algoritmo Ejercicio6Mat
	definir matmagica como entero
	definir i , j, n , sumamagica, sumd Como Entero
	definir banderamagica, banderaf como logico
	sumamagica = 0
	sumd = 0
	banderamagica = verdadero
	hacer
	escribir " Introduce una dimension para la matriz magica"
	leer n
	mientras que n > 10
	dimension matmagica[n,n]
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta n-1 Con Paso 1 Hacer
			hacer 
				escribir "introduce un valor para agregar a la matriz (entre 1 y 9)" 
				leer matmagica[i,j]
			Mientras Que matmagica[i,j] >9 o matmagica[i,j] <= 0
		Fin Para
	fin para
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta n-1 Con Paso 1 Hacer
			escribir sin saltar " [ " matmagica[i,j] " ] "
		Fin Para
		escribir ""
	fin para

		Para j<-0 Hasta n-1 Con Paso 1 Hacer
				sumamagica = sumamagica + matmagica[1,j]
		Fin Para

	banderaf = verdadero
		Para i<-0 Hasta n-1 Con Paso 1 Hacer
			Si sumamagica == SumaFoC(n,i,matmagica,banderaf) entonces
				Escribir "Comprobando Matriz magica"
			sino 
				banderamagica = falso
			FinSi
		fin para
	banderaf = falso	
		Para j<-0 Hasta n-1 Con Paso 1 Hacer
			Si sumamagica == SumaFoC(n,j,matmagica,banderaf) entonces
				Escribir "Comprobando Matriz magica"
			sino 
				banderamagica = falso
			FinSi
		fin para
		
		Para i<-0 Hasta n-1 Con Paso 1 Hacer
			Para j<-0 Hasta n-1 Con Paso 1 Hacer
				si i = j entonces
					sumd = sumd + matmagica[i,j]
				FinSi
			Fin Para
		fin para
		    Si sumamagica == sumd entonces
				Escribir "Comprobando Matriz magica"
			sino 
				banderamagica = falso
			FinSi
			
			sumd = 0
			Para i<-0 Hasta n-1 Con Paso 1 Hacer
				Para j<-0 Hasta n-1 Con Paso 1 Hacer
					si i+j+2 == n+1 entonces
						escribir matmagica[i,j]
						sumd = sumd + matmagica[i,j]
					FinSi
				Fin Para
			fin para
			Si sumamagica == sumd entonces
				Escribir "Comprobando Matriz magica"
			sino 
				banderamagica = falso
			FinSi
		
		si banderamagica == verdadero Entonces
			escribir "la matriz es magica y la suma magica de sus filas, columnas y diagonales es " sumamagica
		SiNo
			escribir "la matriz no es magica"
	    finsi
FinAlgoritmo
