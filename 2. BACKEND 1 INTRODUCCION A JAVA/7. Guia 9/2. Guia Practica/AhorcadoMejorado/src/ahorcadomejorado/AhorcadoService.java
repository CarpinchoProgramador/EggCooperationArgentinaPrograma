package ahorcadomejorado;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    Ahorcado juego = new Ahorcado();
    ArrayList<String> vector = new ArrayList<>();
    int cont = 0;

    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar: ");
        String frase = leer.nextLine();
        juego.setLongitud(frase.length());
        System.out.println("Ingrese la cantidad de intentos: ");
        juego.setIntentosMax(leer.nextInt());
        ArrayList<String> fraseInVector = new ArrayList<>();
        ArrayList<String> vectorGuion = new ArrayList<>();

        for (int i = 0; i < frase.length(); i++) {
            fraseInVector.add(frase.substring(i, i + 1));
        }
        
        System.out.println("Asi queda el vector: " + fraseInVector);
        
        juego.setPalabra(fraseInVector);
        for (int i = 0; i < frase.length(); i++) {
            vectorGuion.add("_");
        }
        
        System.out.println("Asi queda el vectorGuion" + vectorGuion);
        
        juego.setPalCompletada(vectorGuion);
        juego.setLetrasEncontradas(0);

    }

    public void longitud() {
        System.out.println("La longitud de su palabra es de " + juego.getLongitud() + " letras");
    }

    public void buscar() {
        cont = 0;
        ArrayList<String> vectorAux = juego.getPalabra();
        int aux = juego.getPalabra().size();
        System.out.println("EL VALOR DE AUX ES " + aux);
        for (int i = 0; i < aux; i++) {
            if ((juego.getLetraUser().equalsIgnoreCase(juego.getPalabra().get(i)))) {
                vectorAux.add(i, juego.getLetraUser());
                juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
                juego.setPalCompletada(vectorAux);
                cont++;
            }
        }
        System.out.println(juego.getPalCompletada());
        System.out.println("");
        if (cont == 0) {
            System.out.println("La letra no se encontró en el ahorcado");
        } else if (cont > 0) {
            System.out.println("La letra: " + juego.getLetraUser() + " se encuentra " + cont + " veces,");
            System.out.println("Te faltan encontrar " + (juego.getPalabra().size() - juego.getLetrasEncontradas()));
            System.out.println(juego.getPalCompletada() + " ");
        } else {
            System.out.println("Broken Code. Congratulations. Error 40000004953x000s. Contact my creator to fix me P L E A S E");
        }

    }

    public boolean encontradas() {
        for (int i = 0; i < juego.getPalabra().size(); i++) {
            if (juego.getLetraUser().equalsIgnoreCase(juego.getPalabra().get(i))) {
                buscar();
                return true;
            }
        }
        juego.setIntentosMax(juego.getIntentosMax() - 1);
        buscar();
        return false;
    }

    public void mostrarPalabra() {
        System.out.println(juego.getPalCompletada());
    }

    public void intentos() {
        System.out.println("Usted tiene: " + juego.getIntentosMax() + " intentos.");
    }

    public void juego() {
        
        crearJuego();
        longitud();
        verificacion();
        do {
            intentos();
            System.out.println("Ingrese una letra: ");
            juego.setLetraUser(leer.next().toUpperCase());
            encontradas();
            System.out.println("----------------");
        } while (juego.getIntentosMax() > 0 && juego.getLetrasEncontradas() < juego.getPalabra().size());

    }

    public void verificacion() {
        System.out.println("VERIFICACION");
        juego.getPalabra();
        System.out.println(juego.toString());
        mostrarPalabra();
    }

}
