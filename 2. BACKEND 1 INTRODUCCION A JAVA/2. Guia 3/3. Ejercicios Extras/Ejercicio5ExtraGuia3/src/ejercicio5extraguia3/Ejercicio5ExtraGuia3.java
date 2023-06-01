/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5extraguia3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio5ExtraGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String var, claseUser;
        double valorT, descuentoA, descuentoB;
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Ingrese su clase (A, B, C)");
        Scanner x = new Scanner(System.in);

        var = x.nextLine();
        claseUser = var.toLowerCase();
        
        valorT = 12737412.40;
        descuentoA = valorT / 2;
        descuentoB = valorT / 1.35;
        
        
        switch (claseUser) {
            case "a":
                System.out.println("El valor del tratamiento es de : $" + df.format(valorT));
                System.out.println("La clase A tiene un descuento de un %50, por ende el valor de su tratamiento es de : $" + df.format(descuentoA));
                System.out.println("El monto descontado es de: $" + (df.format(valorT - descuentoA) ));
                break;
            case "b":
                System.out.println("El valor del tratamiento es de : $" + df.format(valorT));
                System.out.println("La clase B tiene un descuento de un %35, por ende el valor de su tratamiento es de : $" + df.format(valorT / 1.35));
                 System.out.println("El monto descontado es de: $" + (df.format(valorT - descuentoB) ));
                break;
            case "c":
                System.out.println("El valor del tratamiento es de : $" + df.format(valorT));
                System.out.println("La clase C tiene un descuento de un %0, por ende el valor de su tratamiento es de : $" + valorT);
                break;
            default:
                System.out.println("Valor no valido.");
        }

    }

}
