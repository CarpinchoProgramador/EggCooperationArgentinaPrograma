package ejercicio2guia10mentores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//En el programa principal, crear una lista de tipo "EquipoDe…" y agregar 10 objetos de tipo equipo a la lista. 
//Luego, mostrar por pantalla de forma ordenada según cantidad de puntos, los nombres de cada equipo, su cantidad 
//de puntos, partidos jugados, ganados, perdidos y empatados.
//Una vez finalizado el torneo, determinar el equipo ganador, eliminar al último equipo de la tabla por haber 
//descendido, sumar al nuevo equipo que ascendió de la división inferior, reiniciar los valores de partidos y 
//puntos a 0 para el inicio del siguiente campeonato y mostrar la lista en orden alfabético de los equipos.
public class EquipoService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Equipo> lista = new ArrayList<>();

    public void configEquipos() {
        Equipo Equipo1 = new Equipo("Equipo 1", 10, 3, 4, 3, 3);
        Equipo Equipo2 = new Equipo("Equipo 2", 10, 10, 0, 0, 10);
        Equipo Equipo3 = new Equipo("Equipo 3", 10, 5, 0, 5, 5);
        Equipo Equipo4 = new Equipo("Equipo 4", 10, 4, 0, 6, 4);
        Equipo Equipo5 = new Equipo("Equipo 5", 10, 8, 0, 2, 8);
        Equipo Equipo6 = new Equipo("Equipo 6", 10, 5, 0, 5, 5);
        Equipo Equipo7 = new Equipo("Equipo 7", 10, 4, 4, 0, 4);
        Equipo Equipo8 = new Equipo("Equipo 8", 10, 3, 3, 4, 3);
        Equipo Equipo9 = new Equipo("Equipo 9", 10, 8, 0, 2, 8);
        Equipo Equipo10 = new Equipo("Equipo 10", 10, 0, 0, 10, 0);

        lista.add(Equipo1);
        lista.add(Equipo2);
        lista.add(Equipo3);
        lista.add(Equipo4);
        lista.add(Equipo5);
        lista.add(Equipo6);
        lista.add(Equipo7);
        lista.add(Equipo8);
        lista.add(Equipo9);
        lista.add(Equipo10);
    }

    public void mostrarEquipos() {
        Comparator<Equipo> comp1 = Comparator.comparing(Equipo::getPuntosTotales);
        System.out.println("Equipos ordenados por puntos: ");
        Collections.sort(lista, comp1.reversed());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + " " + lista.get(i).getNombre() + "| Puntos: " + lista.get(i).getPuntosTotales());
        }
    }

    public void determinarGanador() {
        System.out.println("El ganador es: " + lista.get(0).getNombre());
        System.out.println("Sera eliminado: " + lista.get(9).getNombre());
        lista.remove(9);
        System.out.println("El nuevo equipo que jugara la liga sera Equipo 11, que sera agregado.");
        Equipo Equipo11 = new Equipo("Equipo 11", 0, 0, 0, 0, 0);
        
        reiniciarValores();
        
        Comparator<Equipo> comp1 = Comparator.comparing(Equipo::getNombre);
        System.out.println("Equipos ordenados por nombre: ");
        Collections.sort(lista, comp1);
        lista.add(Equipo11);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + " " + lista.get(i).getNombre() + "| Puntos: " + lista.get(i).getPuntosTotales());
        }

    }

    public void reiniciarValores() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setPartidosEmpatados(0);
            lista.get(i).setPartidosGanados(0);
            lista.get(i).setPartidosJugados(0);
            lista.get(i).setPartidosPerdidos(0);
            lista.get(i).setPuntosTotales(0);
        }
    }

}
