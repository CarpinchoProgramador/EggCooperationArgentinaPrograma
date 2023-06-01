package ejercicio3guia7extra;

import java.util.Scanner;

/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de 
adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);
    Juego jugador = new Juego();
    int contador = 0;

    public Juego iniciar_juego() {
        System.out.println("Elija un numero: ");
        jugador.setNumero(leer.nextInt());
        System.out.println("Elija el numero de intentos: ");
        jugador.setIntento(leer.nextInt());
        return jugador;
    }

    public void jugar(Juego jugador) {
        int num2 = 0, p1victory = 0, p2victory = 0, option = 1;
        while (contador < jugador.getIntento() || option == 1) {
            System.out.println("Adivine el numero: ");
            num2 = leer.nextInt();
            if (num2 == jugador.getNumero()) {
                System.out.println("Ganaste el juego!");
                p2victory++;
                break;
            } else if (num2 > jugador.getNumero()) {
                System.out.println("El numero a adivinar es mas bajo.");
                contador++;
            } else if (num2 < jugador.getNumero()) {
                System.out.println("El numero a adivinar es mas alto.");
                contador++;
            }
        }
        if (contador == jugador.getIntento()) {
            System.out.println("Te quedaste sin intentos.");
            p1victory++;
        }
        System.out.println("¿Desea jugar de nuevo?");
        System.out.println("1. Si.");
        System.out.println("2. No.");
        contador = 0;
        option = leer.nextInt();
        if (option == 2) {
            System.out.println("Fin del juego");
            System.out.println("-------Victorias-------");
            System.out.println("Jugador 1: " + p1victory);
            System.out.println("Jugador 2: " + p2victory);
        }
    }
}
