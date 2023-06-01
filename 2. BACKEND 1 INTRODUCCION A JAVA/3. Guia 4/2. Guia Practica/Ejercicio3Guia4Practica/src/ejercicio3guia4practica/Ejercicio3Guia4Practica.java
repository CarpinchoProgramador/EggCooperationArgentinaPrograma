/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia4practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio3Guia4Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int eurosUsuario;
        String monConv;
        
        Scanner x1 = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros a convertir -> € ");
        eurosUsuario = x1.nextInt();
        
        System.out.print("Escriba la divisa a la que desea convertir (Yen - Libra - USD)-> ");
        monConv = x2.nextLine();

        x(eurosUsuario, monConv);

    }

    public static void x(int eurosUsuario, String monConv) {
        switch (monConv.toLowerCase()) {
            case "yen":
                System.out.println("€" + eurosUsuario + " = ¥" + (129.852 * eurosUsuario));
                break;
            case "libra":
                System.out.println("€" + eurosUsuario + " = £" + (0.86 * eurosUsuario));
                break;
            case "usd":
                System.out.println("€" + eurosUsuario + " = U$S" + (1.28611 * eurosUsuario));
                break;
            default:
                System.out.println("Moneda no disponible...");
        }
    }

}
