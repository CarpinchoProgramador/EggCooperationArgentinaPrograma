Algoritmo encuentro15e4
	Definir n,vecUno,vecDos,vecTres Como Entero
	Definir op Como Caracter
	
	Escribir "Indique de que longitud desea el largo del vector: "
	Leer n
	Dimension vecUno[n]
	Dimension vecDos[n]
	Dimension vecTres[n]
	Limpiar Pantalla
	Escribir "- MENU -"
	Escribir ""
	Escribir "A. Llenar Vector A"
	Escribir "B. Llenar Vector B"
	Escribir "C. Llenar Vector C con la suma de los vectores A y B"
	Escribir "D. Llenar Vector C con la resta de los vectores B y A"
	Escribir "E. Mostrar lista A, B, o C"
	Escribir "F. Salir"
	Escribir ""
	Leer op	
	Limpiar Pantalla
	Mientras op="A" o op="B" o op="C" o op="D" o op="E" Hacer
		Si op=="A" Entonces
			Para i = 0 Hasta n-1 Hacer
				vecUno[i]=Aleatorio(-100,100)
			FinPara
		FinSi
		Si op=="B" Entonces
			Para i = 0 Hasta n-1 Hacer
				vecDos[i]=Aleatorio(-100,100)
			FinPara
		FinSi
		Si op=="C" Entonces
			Para i = 0 Hasta n-1 Hacer
				vecTres[i]=vecUno[i]+vecDos[i]
			FinPara
		FinSi
		Si op=="D" Entonces
			Para i = 0 Hasta n-1 Hacer
				vecTres[i]=vecDos[i]-vecUno[i]
			FinPara
		FinSi
		Si op=="E" Entonces
			Para i = 0 Hasta n-1 Hacer
				
			FinPara
		FinSi		
		Escribir "- MENU -"
		Escribir ""
		Escribir "A. Llenar Vector A"
		Escribir "B. Llenar Vector B"
		Escribir "C. Llenar Vector C con la suma de los vectores A y B"
		Escribir "D. Llenar Vector C con la resta de los vectores B y A"
		Escribir "E. Mostrar lista A, B, o C"
		Escribir "F. Salir"
		Escribir ""
		Leer op	
		Limpiar Pantalla
	FinMientras
	
FinAlgoritmo