Algoritmo encuentro18_19_20_21_extra5
	
	definir arreglo, car como caracter
	definir pos1 , pos2, p,i,j como entero
	definir cad como cadena
	definir bandera como logico
	dimension arreglo[20]
	pos1 = 0
	pos2 = 0
	bandera = falso
	
	escribir " escribir una frase"
	leer cad
	
	Para i<-0 Hasta 20-1 Con Paso 1 Hacer
		arreglo[i] = subcadena(cad,i,i)
	fin para
	
	escribir " escribir un caracter a agregar"
	leer car
	
	escribir "ingresar posicion"
	leer p
	
	si arreglo[p] <> " " Entonces
		Para i<-p Hasta 0 Con Paso -1 Hacer
			
			si arreglo[i] = " " y pos1 = 0 Entonces
				escribir arreglo[i]
				pos1 = i
				escribir pos1
				bandera = Verdadero
			FinSi
		fin para
		
		Para j<-p Hasta 20-1 Con Paso 1 Hacer
			si arreglo[j] = " " y pos2 = 0 Entonces
				pos2 = j
				escribir pos2
				bandera = Verdadero
			FinSi
		fin para
		
		si (p-pos1) >= (pos2-p) y bandera Entonces
			
			Para i<-19 Hasta p Con Paso -1 Hacer
				arreglo[i] = arreglo [i-1]
			fin para
			arreglo[p] = car
		sino 
			Para i<-pos1 Hasta p Con Paso 1 Hacer
				arreglo[i] = arreglo [i+1]
			fin para
			arreglo[p] = car
		FinSi
	SiNo
		arreglo[p] = car
	finsi	
	Para i<-0 Hasta 20-1 Con Paso 1 Hacer
		escribir sin saltar "[" arreglo[i] "]"
	fin para
	Escribir ""
FinAlgoritmo