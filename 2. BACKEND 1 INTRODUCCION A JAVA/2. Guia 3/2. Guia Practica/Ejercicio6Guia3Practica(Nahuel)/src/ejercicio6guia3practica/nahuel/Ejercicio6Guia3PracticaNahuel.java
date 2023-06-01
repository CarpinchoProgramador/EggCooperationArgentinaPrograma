/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia3practica.nahuel;

/**
 *
 * @author Laureano
 */
public class Ejercicio6Guia3PracticaNahuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        int opcion;
        char confirmar;
        System.out.println("ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextInt();
        do {
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("la sumatoria de los dos numeros es:" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("la resta de los dos numeros es:" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la multiplicacion de los numeros es:" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("la division de los numeros ingresados es:" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("en serio desea salir del sistema? (s/n) ");
                    confirmar = leer.next().charAt(0);
                    if (confirmar == 'S' || confirmar == 's') {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("opcion no valida elija una del 1 al 5");
                    break;
            }
        } while (true);
    }

}

}
