package ejerciciobarajadecartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Carta> monton = new ArrayList<>();
    
    public Baraja crearBaraja() {
        Baraja baraja = new Baraja();
        String[] palos = {"Basto", "Copa", "Espada", "Oro"};
        ArrayList<Carta> mazo = new ArrayList<>();
        for (int j = 0; j < palos.length; j++) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    mazo.add(new Carta(i, palos[j]));
                }
            }
        }
        baraja.setMazo(mazo);
        return baraja;
    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getMazo());
    }

    public void siguienteCarta(Baraja baraja) {        
        if (baraja.getMazo().size() > 1) {
            System.out.println("Se entregó: " + baraja.getMazo().get(0));
            monton.add(baraja.getMazo().remove(0));
            baraja.setMonton(monton);
        } else if (baraja.getMazo().size() == 1) {
            System.out.println("Se entregó: " + baraja.getMazo().get(0));
            monton.add(baraja.getMazo().remove(0));
            baraja.setMonton(monton);
            System.out.println("No quedan mas cartas");
        }
    }

    public int cartasDisponibles(Baraja baraja) {        
        return baraja.getMazo().size();
    }

    public void darCartas(Baraja baraja) {
        System.out.print("Ingrese el numero de cartas que desea tomar ->");        
        int cantidadCartas = leer.nextInt();
        if (cantidadCartas > cartasDisponibles(baraja)) {
            System.out.println("Estas pidiendo mas cartas de las que hay en el mazo");
        } else {
            for (int i = 0; i < cantidadCartas; i++) {
                siguienteCarta(baraja);
            }
        }
    }

    public void cartasMonton(Baraja baraja) {
        if (baraja.getMonton().isEmpty()) {
            System.out.println("No salio ninguna carta.");
        } else {
            System.out.println(baraja.getMonton());
        }
    }

    public void mostrarBaraja(Baraja baraja) {
        System.out.println(baraja.getMazo());
    }
}
