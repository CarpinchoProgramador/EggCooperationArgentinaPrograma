Algoritmo sin_titulo
	
	Definir mes Como Caracter
	Definir importe, descuento Como Real
	
	Escribir "ingrese el mes cuando realizó su compra"
	Leer mes
	
	mes = Minusculas(mes)
	
	Si mes = "septiembre" o mes = "octubre" o mes = "noviembre"
		
		Escribir "Ingrese cual fue el importe de su compra"
		Leer importe
		Escribir "Usted debe pagar: $", importe - importe * 0.10
		
	SiNo
		Escribir "Ingrese cual fue el importe de su compra"
		Leer importe
		Escribir "El mes que ingresó no es valido para descuento. Usted debe pagar: $", importe
		
	FinSi
	
	
FinAlgoritmo
