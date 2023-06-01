Algoritmo sin_titulo
	
	Definir i,x,vector,val,z Como Entero
	Escribir "Ingrese la cantidad de elementos del vector"
	leer x
	Dimension vector[x]
	
	valoresVector(x,vector)
	
	Escribir "Ingrese el valor que desea buscar dentro del vector"
	Leer val
	
	Definir c Como Entero
	c=0
	Para i<-0 Hasta x-1 Con Paso 1 Hacer
		si vector[i] = val Entonces
			Escribir "El número ", val, " se encuentra en la posición ", i " del vector"
			c=c+1
		FinSi
	Fin Para	
	
	si c=0 Entonces
		Escribir "El elemento no se encuentra dentro del vector"
	FinSi
	
FinAlgoritmo

SubProceso valoresVector(x Por valor, vector Por Referencia)
	Definir i,z Como Entero
	
	Para i<-0 Hasta x-1 Con Paso 1 Hacer
		Escribir "Ingrese un valor para el vector" 
		Leer z
		vector[i] = z
	Fin Para
	
FinSubProceso