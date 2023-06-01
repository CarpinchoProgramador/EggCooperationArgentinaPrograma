/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.ejercicio11guia4teorica;

import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio11Guia4Teorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto, textoFinal, textoCheck;
        int largoTexto;

        System.out.println("Ingrese una frase. La frase debe terminar en un punto.");
        Scanner x = new Scanner(System.in);

        texto = x.nextLine();
        largoTexto = texto.length();
        textoCheck = texto.substring(largoTexto - 1, largoTexto);

        while (!".".equals(textoCheck)) {
            System.out.println("La frase que ingresó no termina en punto. -> " + texto);
            texto = x.nextLine();
            largoTexto = texto.length();
            textoCheck = texto.substring(largoTexto - 1, largoTexto);
        }
        System.out.println("Frase original -> " + texto);
        textoFinal = fraseMod(texto);
        System.out.println("Frase modificada -> " + fraseMod(texto));
    }

    public static String fraseMod(String texto) {

        StringBuilder textito = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char var = texto.charAt(i);
            switch (var) {
                case 'a':
                    textito.append("@");
                    break;
                case 'e':
                    textito.append("#");
                    break;
                case 'i':
                    textito.append("$");
                    break;
                case 'o':
                    textito.append("%");
                    break;
                case 'u':
                    textito.append("*");
                    break;
                default:
                    textito.append(var);
            }
        }

        return textito.toString();

    }

}
