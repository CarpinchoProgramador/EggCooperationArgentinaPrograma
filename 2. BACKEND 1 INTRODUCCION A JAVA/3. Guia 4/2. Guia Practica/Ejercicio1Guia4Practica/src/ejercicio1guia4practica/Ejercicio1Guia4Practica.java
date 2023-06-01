/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia4practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio1Guia4Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcionUser, numUno, numDos;
        String leerOpcionuser;
        opcionUser = 17;

        System.out.println("Ingrese dos numeros enteros positivos");
        Scanner leerUno = new Scanner(System.in);
        Scanner leerDos = new Scanner(System.in);

        numUno = leerUno.nextInt();
        numDos = leerDos.nextInt();

        while (opcionUser != 5) {
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            Scanner leerOpcion = new Scanner(System.in);
            opcionUser = leerOpcion.nextInt();

            switch (opcionUser) {
                case 1:
                    System.out.println(numUno + " + " + numDos + " = " + suma(numUno, numDos));
                    break;
                case 2:
                    System.out.println(numUno + " - " + numDos + " = " + resta(numUno, numDos));
                    break;
                case 3:
                    System.out.println(numUno + " * " + numDos + " = " + multiplicacion(numUno, numDos));
                    break;
                case 4:
                    if (numDos != 0) {
                        System.out.println(numUno + " / " + numDos + " = " + division(numUno, numDos));
                        break;
                    } else if (numDos == 0) {
                        System.out.println("No se puede dividir entre cero. Ingrese otro denominador.");
                        numDos = leerDos.nextInt();
                        break;
                    }
                case 5:
                    System.out.println("¿Esta seguro que quiere salir? S/N");
                    Scanner leer5 = new Scanner(System.in);

                    leerOpcionuser = leer5.nextLine();
                    if (leerOpcionuser.equals("S") || leerOpcionuser.equals("s")) {
                        break;
                    } else if (leerOpcionuser.equals("N") || leerOpcionuser.equals("n")) {
                        opcionUser = 17;
                        break;
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida. Intente nuevamente.");
            }
        }

    }

    public static int multiplicacion(int var1, int var2) {
        int x;
        x = var1 * var2;
        return x;
    }

    public static int resta(int var1, int var2) {
        int x;
        x = var1 - var2;
        return x;
    }

    public static int suma(int var1, int var2) {
        int x;
        x = var1 + var2;
        return x;
    }

    public static int division(int var1, int var2) {
        int x;
        x = var1 / var2;
        return x;
    }
}
