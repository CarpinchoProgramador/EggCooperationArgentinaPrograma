package ejercicio4guia10practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    List<Pelicula> peli = new ArrayList();

    public void crearPelicula() {
        int d = 1;
        do {
            System.out.print("Ingrese el nombre de una pelicula ->");
            String nombrePelicula = leer.next();
            System.out.print("Ingrese el nombre del autor ->");
            String nombreAutor = leer.next();
            System.out.print("Ingrese la duracion de la pelicula en hs ->");
            int duracionPelicula = leer.nextInt();

            Pelicula p = new Pelicula(nombrePelicula, nombreAutor, duracionPelicula);

            peli.add(p);

            System.out.println("¿Desea agregar otra pelicula? [1. Si / 2. No]");
            d = leer.nextInt();
        } while (d == 1);
    }

    public void mostrarPeliculas() {
        mostrarPeli();
        System.out.println("---------------------");
        mostrarMayorHora();
        System.out.println("---------------------");
        menorDuracion();
        System.out.println("---------------------");
        mayorDuracion();
        System.out.println("---------------------");
        tituloAlfabeticamente();
        System.out.println("---------------------");
        directorAlfabeticamente();
    }

    public void mostrarPeli() {
        System.out.println("Peliculas: ");
        for (int i = 0; i < peli.size(); i++) {
            System.out.println((i + 1) + ". " + peli.get(i).getPelicula() + ": " + peli.get(i).getHoras() + " hs. (" + peli.get(i).getDirector() + ")");
        }
    }

    public void mostrarMayorHora() {
        System.out.println("Las peliculas mayores a 1 hora son: ");
        for (int i = 0; i < peli.size(); i++) {
            if (peli.get(i).getHoras() >= 1) {
                System.out.println((i + 1) + ". " + peli.get(i).getPelicula() + ": " + peli.get(i).getHoras() + " hs. (" + peli.get(i).getDirector() + ")");
            }
        }
    }
       
    public void menorDuracion() {
        System.out.println("Peliculas ordenadas de menor duracion a mayor duracion: ");
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getHoras);
        Collections.sort(peli, comp);
        mostrarPeli();
    }

    public void mayorDuracion() {
        System.out.println("Peliculas ordenadas de mayor duracion a menor duracion: ");
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getHoras);
        Collections.sort(peli, comp.reversed());
        mostrarPeli();
    }

    public void tituloAlfabeticamente() {
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getPelicula);
        System.out.println("Peliculas ordenedas alfabeticamente( A -> Z)");
        Collections.sort(peli, comp);
        mostrarPeli();
    }

    public void directorAlfabeticamente() {
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getDirector);
        System.out.println("Directores ordenedos alfabeticamente( A -> Z)");
        Collections.sort(peli, comp);
        mostrarPeli();        
    }


}
