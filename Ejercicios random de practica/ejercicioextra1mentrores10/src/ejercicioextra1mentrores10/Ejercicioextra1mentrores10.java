package ejercicioextra1mentrores10;

import java.util.Scanner;

public class Ejercicioextra1mentrores10 {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    AgendaService sc = new AgendaService();
    sc.menu();
    }
}
