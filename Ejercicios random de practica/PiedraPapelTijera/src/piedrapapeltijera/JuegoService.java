package piedrapapeltijera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//1 = piedra / 2 = papel / 3 = tijera
public class JuegoService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Jugador> Jugadores = new ArrayList<>();

    public void crearJugadores() {
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese el nombre de jugador " + (i + 1) + " -> ");
            Jugador x = new Jugador();
            x.setId(leer.next());
            Jugadores.add(x);
        }
    }

    public void ejecutarJuego() {

        crearJugadores();
        do {
            eleccionDeJugada();
            tablaDePuntos();
            System.out.println("");
        } while (seguirJugando() != 2);
        
        System.out.println("Gracias por jugar!");
    }

    public void comparacion() {
        //1 = piedra / 2 = papel / 3 = tijera
        if (Jugadores.get(0).getDecisionJuego() == 1 && Jugadores.get(1).getDecisionJuego() == 3) {
            Jugadores.get(0).setPuntos(+1);
            System.out.println("Gana jugador 1");
        } else if (Jugadores.get(0).getDecisionJuego() == 2 && Jugadores.get(1).getDecisionJuego() == 1) {
            Jugadores.get(0).setPuntos(+1);
            System.out.println("Gana jugador 1");
        } else if (Jugadores.get(0).getDecisionJuego() == 3 && Jugadores.get(1).getDecisionJuego() == 2) {
            Jugadores.get(0).setPuntos(+1);
            System.out.println("Gana jugador 1");
        } else if (Jugadores.get(0).getDecisionJuego() == Jugadores.get(1).getDecisionJuego()) {
            System.out.println("Empate");
        } else {
            Jugadores.get(1).setPuntos(+1);
            System.out.println("Gana jugador 2");
        }
    }

    public void tablaDePuntos() {
        System.out.println("--------Tabla De Puntos--------");
        Comparator<Jugador> comp1 = Comparator.comparing(Jugador::getPuntos);
        Collections.sort(Jugadores, comp1.reversed());
        for (int i = 0; i < Jugadores.size(); i++) {
            System.out.println(i + 1 + ". " + Jugadores.get(i).getId() + " | Puntos: " + Jugadores.get(i).getPuntos());
        }
    }

    public void eleccionDeJugada() {
        //1 = piedra / 2 = papel / 3 = tijera
        int dec, rondas;
        System.out.print("Ingrese cuantas rondas jugar   -> ");
        rondas = leer.nextInt();
        for (int i = 0; i < rondas; i++) {
            System.out.println("Ronda " + (i + 1));
            for (int j = 0; j < 2; j++) {
                do {
                    System.out.println("Turno de " + Jugadores.get(j).getId());
                    System.out.println("1. Piedra");
                    System.out.println("2. Papel");
                    System.out.println("3. Tijera");
                    dec = leer.nextInt();
                    if (dec == 1 || dec == 2 || dec == 3) {
                        Jugadores.get(j).setDecisionJuego(dec);
                    } else {
                        System.out.println("Opcion invalida...");
                    }
                    
//                    switch (dec) {
//                        case 1:
//                            
//                            break;
//                        case 2:
//                            Jugadores.get(j).setDecisionJuego(dec);
//                            break;
//                        case 3:
//                            Jugadores.get(j).setDecisionJuego(dec);
//                            break;
//                        default:
//                            System.out.println("Opcion invalida...");
//                    }
                } while (dec != 1 && dec != 2 && dec != 3);                                                    
            }
            comparacion();
        }
    }

    public void reiniciarPuntos() {
        System.out.println("¿Desea reiniciar los puntos?");
        int aux;
        do {
            System.out.println("1. Si");
            System.out.println("2. No");            
            aux = leer.nextInt();
            if (aux == 1) {                
                for (int i = 0; i < 2; i++) {
                    Jugadores.get(i).setPuntos(0);
                }
                System.out.println("Puntos reiniciados!");
            }
        } while (aux != 1 && aux != 2);
    }

    public int seguirJugando() {
        int dec;
        do {
            System.out.println("Desea seguir Jugando?");
            System.out.println("1. Si");
            System.out.println("2. No");
            dec = leer.nextInt();
            if (dec == 1) {
                reiniciarPuntos();
            }
        } while (dec != 1 && dec != 2);
        return dec;
    }

}
