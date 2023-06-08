package ejercicio2guia12electrodomesticosherencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2Guia12ElectrodomesticosHerencia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Electrodomestico> listaProductos = new ArrayList<>();
        Double suma = 0.0;        

        Lavadora lavadora1 = new Lavadora(35, 0.0, "Lavadora", "BLANCO", "A", 35);
        lavadora1.precioFinal();
        Televisor televisor1 = new Televisor(40, true, 0.0, "Televisor", "Negro", "C", 10);
        televisor1.precioFinal();
        Lavadora lavadora2 = new Lavadora(35, 0.0, "Lavadora", "NEGRO", "A", 35);
        lavadora2.precioFinal();
        Televisor televisor2 = new Televisor(40, true, 0.0, "Televisor", "Negro", "C", 10);
        televisor2.precioFinal();

        listaProductos.add(televisor1);
        listaProductos.add(lavadora1);
        listaProductos.add(lavadora2);
        listaProductos.add(televisor2);

        System.out.println("Precio total de todos los productos: " + suma);

    }

}
