/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10guiateorica;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;

/**
 *
 * @author Laureano
 */
public class Ejercicio10GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese 4 numeros comprendidos entre 1 y 20: ");
            int numUser;
            
            numUser = num.nextInt();
            String ast = "*";
            
            for (int j = 0; j < numUser; j++) {
                System.out.print(ast);
                System.out.println("");
            }
        }
    }
    
}
