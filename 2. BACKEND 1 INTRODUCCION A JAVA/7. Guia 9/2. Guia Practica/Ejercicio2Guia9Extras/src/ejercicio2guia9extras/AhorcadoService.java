package ejercicio2guia9extras;

import java.util.Scanner;

public class AhorcadoService {

    Ahorcado juego1 = new Ahorcado();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String palabrita;

    int cont = 0;

//    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
//    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
//    Después ingresa la palabra en el vector, letra por letra, 
//    quedando cada letra de la palabra en un índice del vector. 
//    Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
    public String[] crearJuego() {
        System.out.println("Ingrese una palabra: ");
        palabrita = leer.nextLine();

        String[] p = new String[palabrita.length()];
        for (int i = 0; i < palabrita.length(); i++) {
            p[i] = palabrita.substring(i, i + 1);
        }
        juego1.setPalabra(p);
        juego1.setLetrasEncontradas(0);
        System.out.println("Ingrese la cantidad de intentos: ");
        juego1.setIntentosMax(leer.nextInt());
        return p;
    }
//    Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
//    Nota: buscar como se usa el vector.length.

    public void longitud() {
        System.out.println("La longitud de la palabra que se debe encontrar es de: " + palabrita.length() + " letras.");
    }

//    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es 
//    parte de la palabra o no. También informará si la letra estaba o no.
    public void buscarLetra() {
        for (int i = 0; i < juego1.getPalabra().length; i++) {
            if (juego1.getLetraUser().equalsIgnoreCase(juego1.getPalabra()[i])) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("La letra se encontró " + cont + " vez/veces.");
        } else {
            System.out.println("la letra no se encontró ninguna vez");
        }
    }
//    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han 
//    sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y 
//    false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le 
//    restará uno a sus oportunidades.

    public boolean encontradas() {
        String letraAux;
        System.out.println("Ingrese una letra: ");
        leer.next();
        juego1.setLetraUser(leer.nextLine());

        for (int i = 0; i < juego1.getPalabra().length; i++) {
            if (juego1.getLetraUser().equalsIgnoreCase(juego1.getPalabra()[i])) {
                juego1.setLetrasEncontradas(juego1.getLetrasEncontradas() + 1);
                System.out.println("La que encontraste es: " + juego1.getLetraUser());
                System.out.println("Te faltan: " + (juego1.getPalabra().length - juego1.getLetrasEncontradas()) + " letras.");
                return true;
            } else if (i == juego1.getPalabra().length && !juego1.getLetraUser().equalsIgnoreCase(juego1.getPalabra()[i])) {
                System.out.println("La letra no se encontró la letra " + juego1.getLetraUser() + " en la palabra");
                juego1.setIntentosMax(juego1.getIntentosMax()-1);
                return false;
            }

        }
        return false;
    }
//    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

    public void intentos() {
        System.out.println("Le quedan: " + juego1.getIntentosMax() + " intento/s.");
    }

//    Método juego(): el método juego se encargará de llamar todos los métodos 
//    previamente mencionados e informará cuando el usuario descubra toda 
//    la palabra o se quede sin intentos. Este método se llamará en el main.
    public void juego() {
        crearJuego();
        longitud();
        do {
            encontradas();
            intentos();
        } while (juego1.getIntentosMax() > 0 && juego1.getLetrasEncontradas() < juego1.getPalabra().length);
    }
}
