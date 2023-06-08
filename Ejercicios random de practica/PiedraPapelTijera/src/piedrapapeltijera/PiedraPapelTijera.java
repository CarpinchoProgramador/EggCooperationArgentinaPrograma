package piedrapapeltijera;

import java.util.Scanner;

public class PiedraPapelTijera {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    JuegoService JS = new JuegoService();
    JS.ejecutarJuego();


    }

}
