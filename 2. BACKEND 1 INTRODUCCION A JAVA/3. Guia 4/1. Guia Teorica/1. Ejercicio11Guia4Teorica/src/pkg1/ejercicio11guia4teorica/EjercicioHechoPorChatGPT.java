/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.ejercicio11guia4teorica;

/**
 *
 * @author Laureano
 */

import java.util.Scanner;

public class EjercicioHechoPorChatGPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra o frase para codificar: ");
        String entrada = sc.nextLine();
        
        String codificada = codificar(entrada);
        
        System.out.println("La palabra o frase codificada es: " + codificada);
        
    }

    public static String codificar(String entrada) {
        StringBuilder codificada = new StringBuilder();
        
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            switch (c) {
                case 'a':
                    codificada.append('@');
                    break;
                case 'e':
                    codificada.append('#');
                    break;
                case 'i':
                    codificada.append('$');
                    break;
                case 'o':
                    codificada.append('%');
                    break;
                case 'u':
                    codificada.append('*');
                    break;
                case 'A':
                    codificada.append('@');
                    break;
                case 'E':
                    codificada.append('#');
                    break;
                case 'I':
                    codificada.append('$');
                    break;
                case 'O':
                    codificada.append('%');
                    break;
                case 'U':
                    codificada.append('*');
                    break;
                default:
                    codificada.append(c);
                    break;
            }
        }
        
        return codificada.toString();
    }
}
