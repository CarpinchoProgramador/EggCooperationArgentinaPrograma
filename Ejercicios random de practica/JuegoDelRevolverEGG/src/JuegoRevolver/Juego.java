package JuegoRevolver;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;
    String mojado;
    int cantJugadores = 0;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        do {
            System.out.println("Ingrese entre 1 y 6 jugadores:");
            cantJugadores = leer.nextInt();
        } while (cantJugadores > 6 && cantJugadores < 1);

        for (int i = 0; i < cantJugadores; i++) {
            Jugador x = new Jugador();
            x.setId(i + 1);
            x.setNombre("Jugador " + x.getId());
            jugadores.add(i, x);
        }
        revolver.llenarRevolver();
    }

    public void ronda(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        llenarJuego(jugadores, revolver);

        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i).getNombre());

            System.out.println("Te estas apuntando. ¿Disparas? (1. Si - 2. No)");
            int d = leer.nextInt();

            if (d == 1) {
                System.out.print(jugadores.get(i).getNombre() + " ");
                jugadores.get(i).disparo(revolver);
                System.out.println("");
                if (jugadores.get(i).isMojado()) {
                    System.out.println("Fin del juego.");
                    return;
                }
            } else if (d == 2) {

                System.out.println(jugadores.get(i).getNombre() + " es un cobarde...");
                System.out.println("");
            }             
        }
    }

    public void mostrarPorPantalla(ArrayList<Jugador> jugadores) {
        //        Imprimir por pantalla el estado de los jugadores -> Jugador 1 = Morto
        for (Jugador j : jugadores) {
            if (j.isMojado()) {
                mojado = "Morto";
            } else {
                mojado = "Vivo";
            }
            System.out.println(j.getNombre() + " = " + mojado);
        }
    }

    public void ejecutarPrograma(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        ronda(jugadores, revolver);
        System.out.println("-------Tabla-------");
        mostrarPorPantalla(jugadores);
    }

}
