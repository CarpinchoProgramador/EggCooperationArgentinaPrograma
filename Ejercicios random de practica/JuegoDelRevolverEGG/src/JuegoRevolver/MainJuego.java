package JuegoRevolver;

import java.util.ArrayList;

public class MainJuego {

    public static void main(String[] args) {
        ArrayList<Jugador> j = new ArrayList();
        RevolverDeAgua r = new RevolverDeAgua();
        Juego x = new Juego();
        x.ejecutarPrograma(j, r);
    }

}
