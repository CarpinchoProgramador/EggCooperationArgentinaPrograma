package Logica;

import java.util.Scanner;

public class Ejerciciointegrador {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Squirtle squirtle = new Squirtle();
    Charmander charmander = new Charmander();
    Bulbasaur bulba = new Bulbasaur();
    Pikachu pika = new Pikachu();
    
    squirtle.atacarArañazo();
    squirtle.atacarHidrobomba();
    charmander.atacarArañazo();
    charmander.atacarPunioFuego();


    }

}
