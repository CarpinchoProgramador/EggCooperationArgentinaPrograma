package ejercicio3guia7extra2;

import java.util.Scanner;

//Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de 
//adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
//El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
//después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
//Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
public class Servicio {

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Juego jugador1 = new Juego();
        Juego jugador2 = new Juego();

        int option = 1, vecesJuego = 0;

        while (option == 1) {
            vecesJuego++;
            System.out.println("--------------------");
            System.out.println("Partida " + vecesJuego);
            System.out.println("--------------------");

//            El jugador 1 establece los numeros
            System.out.println("Jugador 1. Elija un numero a adivinar: ");
            jugador1.setNumero(leer.nextInt());
            System.out.println("Elija el numero de intentos.");
            jugador1.setIntentos(leer.nextInt());

//            A partir de aqui el jugador 2 juega
            for (int i = 1; i <= jugador1.getIntentos(); i++) {

                System.out.print("Adivine el numero. ");
                System.out.println("Intento (" + i + "/" + jugador1.getIntentos() + ")");
                System.out.println("--------------------");
                jugador2.setNumero(leer.nextInt());

                if (jugador2.getNumero() == jugador1.getNumero()) {
                    System.out.println("Ganaste el juego!");
                    System.out.println("--------------------");
                    jugador2.setVictoria(jugador2.getVictoria() + 1);
                    break;
                } else if (jugador2.getNumero() > jugador1.getNumero()) {
                    System.out.println("El numero a adivinar es mas bajo.");
                    System.out.println("--------------------");
                    jugador2.setIntentos(jugador2.getIntentos() + 1);
                } else if (jugador2.getNumero() < jugador1.getNumero()) {
                    System.out.println("El numero a adivinar es mas alto.");
                    System.out.println("--------------------");
                    jugador2.setIntentos(jugador2.getIntentos() + 1);
                } else {
                    System.out.println("invalid input");
                }
            }
//            Si el jugador 2 se quede sin intentos salta este mensaje y se le suma una victoria al jugador 1
            if (jugador2.getIntentos() == jugador1.getIntentos()) {
                System.out.println("Te quedaste sin intentos.");
                System.out.println("--------------------");
                jugador1.setVictoria(jugador1.getVictoria() + 1);
            } else {
                if (jugador2.getIntentos() == 0) {
                    System.out.println("Felicidades! El Jugador 2 adivinó el numero a la primera");
                } else {
                    System.out.println("El jugador 2 adivinó el numero en: " + (jugador2.getIntentos()+1) + " intentos.");
                }
            }

//            una vez finalizada la partida debido a que no haya mas intentos o que el jugador 2 haya adivinado el numero se 
//            le pregunta a los jugadores si quieren comenzar de nuevo         
            System.out.println("¿Desea jugar de nuevo?");
            System.out.println("1. Si.");
            System.out.println("2. No.");
            System.out.println("--------------------");
//            En caso de que seleccionen la opcion 2 (fin de la partida) 
//            se muestra por pantalla la cantidad de victorias de cada uno

            option = leer.nextInt();
            if (option == 2) {
                System.out.println("-------Victorias-------");
                System.out.println("Jugador 1: " + jugador1.getVictoria() + " victoria/s");
                System.out.println("Jugador 2: " + jugador2.getVictoria() + " victoria/s");
                System.out.println("Fin de la partida...");
            } else if (option == 1) {
                jugador2.setIntentos(0);
            }
        }
    }
}
