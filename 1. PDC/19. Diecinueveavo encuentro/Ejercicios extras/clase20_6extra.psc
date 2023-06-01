Algoritmo clase20_6extra
	Definir numAlto, numBajo, datosNum, i Como Entero
	
	Dimension datosNum[17]
	numAlto = 0
	numBajo = 1654
	
	Para i <- 0 Hasta 16 Con Paso 1 Hacer
		datosNum[i] = azar(1654)
		Si datosNum[i] > numAlto Entonces
			numAlto = datosNum[i]
		FinSi
		
		Si datosNum[i] < numBajo Entonces
			numBajo = datosNum[i]
		FinSi
	FinPara
	
	Escribir "La diferencia entre el numero mas alto [", numAlto ,"] y el numero mas bajo [", numBajo,"] es de: ", numAlto-numBajo
FinAlgoritmo
