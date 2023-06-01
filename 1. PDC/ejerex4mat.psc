Funcion Sum2 <- MultiMat(x, z, mat1 por referencia, mat2 por referencia)
	definir Sum2, v1,v2,v3  como entero
	Sum2 = 0
	v1 = 0
	v2 = 0
	v3 = 0
		Para z<-0 Hasta 2 Con Paso 1 Hacer
			v1 = v1 + Mat1[x,z]*Mat2[z,x]
		Fin Para
		Sum2 = v1
Fin Funcion

Algoritmo Ejercicio6Mat
	definir mat1, mat2, mat3 como entero
	definir i , j, n , sumamagica, sumd Como Entero
	sumamagica = 0
	sumd = 0

	dimension mat1[3,3]
	dimension mat2[3,3]
	dimension mat3[3,3]
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			mat1[i,j] = aleatorio(1,10)
			mat2[i,j] = aleatorio(1,10)
		Fin Para
	fin para
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			escribir sin saltar " [ " mat1[i,j] " ] "
		Fin Para
		escribir ""
	fin para
	
	escribir " Matriz 2 es esta"
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			escribir sin saltar " [ " mat2[i,j] " ] "
		Fin Para
		escribir ""
	fin para
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			mat3[i,j]= MultiMat(i,j, mat1, mat2)
		Fin Para
	fin para
	
	escribir "matriz resultado es"
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			escribir sin saltar " [ " mat3[i,j] " ] "
		Fin Para
		escribir ""
	fin para
FinAlgoritmo
