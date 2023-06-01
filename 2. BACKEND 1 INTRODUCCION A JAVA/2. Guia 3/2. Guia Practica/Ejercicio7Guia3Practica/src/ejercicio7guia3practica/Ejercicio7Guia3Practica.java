/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7guia3practica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio7Guia3Practica {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String cadenaUsuario, caracterUno, caracterDos;
        int largoCadena, lecturaCorrecta, lecturaIncorrecta, verificacion;
        
        lecturaCorrecta = 0;
        lecturaIncorrecta = 0;
        verificacion = 0;
       
        /*
        leer las cadenas de los usuarios
        maximo 5 caracteres minimo 2.
        la cadena debe empezar con X y terminar con O
        si respetan el formato se consideran "CORRECTAS"
         */

        System.out.println("Ingrese caracteres");

        Scanner leer = new Scanner(System.in);
        cadenaUsuario = leer.nextLine();
        largoCadena = cadenaUsuario.length();

        caracterUno = cadenaUsuario.substring(0, 1);
        caracterDos = cadenaUsuario.substring(largoCadena - 1, largoCadena);

        while (verificacion == 0) {
            if (5 >= largoCadena) {
                if (caracterUno.equals("X") && caracterDos.equals("O")) {
                    System.out.println("CORRECTO");
                    lecturaCorrecta = lecturaCorrecta + 1;
                } else if (cadenaUsuario.equals("&&&&&")) {
                    System.out.println("Lectura correcta. Final de los envios...");
                    verificacion = 1;
                } else {
                    System.out.println("Lectura incorrecta...");
                    lecturaIncorrecta = lecturaIncorrecta + 1;
                }
            } else {
                lecturaIncorrecta = lecturaIncorrecta + 1;
                System.out.println("Lectura incorrecta...");
            }
            if (verificacion == 0) {
                System.out.println("Ingrese otros caracteres.");
                cadenaUsuario = leer.nextLine();
                largoCadena = cadenaUsuario.length();
                caracterUno = cadenaUsuario.substring(0, 1);
                caracterDos = cadenaUsuario.substring(largoCadena - 1, largoCadena);
            }
        }
        System.out.println("Cantidad de lecturas correctas: " + lecturaCorrecta);
        System.out.println("Cantidad de lecturas incorrectas: " + lecturaIncorrecta);
        
    }
}
