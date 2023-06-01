
Algoritmo genz_entretodos
	definir i, j, k, dimen, cont Como Real
	definir matriz, muestra, n como caracter
	escribir " Ingrese la muestra"
	hacer 
		leer muestra
		dimen = raiz(longitud(muestra))
		si dimen <> 3 y dimen <> 4 y dimen <> 37 Entonces
			escribir " la muestra ingresada es incorrecta "
		FinSi
	Mientras Que dimen <> 3 y dimen <> 4 y dimen <> 37
	
	dimension matriz[dimen,dimen]
	Escribir dimen
	cont = 0
	para i = 0 hasta longitud(muestra)-1 con paso 1 Hacer
		si subcadena(muestra,i,i) <> "A" Y subcadena(muestra,i,i) <> "B" Y subcadena(muestra,i,i) <> "C" Y subcadena(muestra,i,i) <> "D" Entonces
			cont = 1
		FinSi
		
	FinPara
	si cont >= 1 entonces
		escribir " La muestra ingresada no es valida"
		
	FinSi
	
	matrizgenz(matriz, muestra, dimen)
	verificaciongenz(matriz, dimen)
FinAlgoritmo

SubProceso matrizgenz(matriz, muestra, dimen)
	definir cont, i, j como real
	cont = 0
	para i = 0 hasta dimen-1 con paso 1 Hacer
		para j = 0 hasta dimen-1 con paso 1 Hacer
			matriz[i,j] = subcadena(muestra,cont,cont)
			cont = cont + 1
		FinPara
	FinPara
	para i = 0 hasta dimen-1 con paso 1 Hacer
		para j = 0 hasta dimen-1 con paso 1 Hacer
			escribir sin saltar "[" matriz[i,j] "] "
		FinPara
		escribir ""
	FinPara
	
	
	
FinSubProceso

SubProceso verificaciongenz(matriz, dimen)
	definir control, control2 como caracter
	definir cont, i, j como real
	definir validacion, validacion2 como logica	
	control = matriz[0,0]
	escribir control
	para i = 0 hasta dimen -1
		para j = 0 hasta dimen -1
			si matriz[i,i] = control Entonces
				validacion = Verdadero
			FinSi
		FinPara
	FinPara
	control2 = matriz[0,dimen-1]
	escribir control2
	para i = 0 hasta dimen -1
		para j = 0 hasta dimen -1
			si i + j = dimen-1
				matriz[i,j] = control2
				validacion2 = Verdadero
			FinSi
		FinPara
	FinPara
	si validacion2 = verdadero y validacion = verdadero Entonces
		escribir " Su muestra tiene el gen z "
		
		
	FinSi
FinSubProceso

