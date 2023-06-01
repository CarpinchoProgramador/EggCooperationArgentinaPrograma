package ejercicio1guia9extras;

import java.util.Scanner;

public class Juego {

    String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String mesSecreto = mes[9];
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void jugar() {
        String aux = "";
        do {
            System.out.println("Intente adivinar el mes: ");
            aux = leer.nextLine();
            if (aux.toLowerCase().equals(mesSecreto)) {
                System.out.println("Adivinaste!!");
                break;
            } else {
                System.out.println("Erraste, intenta de nuevo.");
            }
        } while (!aux.toLowerCase().equals(mesSecreto));
    }

}
