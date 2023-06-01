package ejercicio1guia9practica;

import java.util.Scanner;
//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
//Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se 
//repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase 
//ingresada por el usuario.
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
//ingresada por el usuario y mostrar la frase resultante.
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
//por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
//devuelve verdadero si la contiene y falso si no.

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    public Cadena insertarFrase() {
        System.out.println("Ingrese su frase o palabra: ");
        Cadena palabra = new Cadena(leer.nextLine());
        return palabra;
    }

    public int mostrarVocales(Cadena palabra) {
        int cont = 0;
        for (int i = 0; i < palabra.getLongitud(); i++) {
            switch (palabra.getFrase().toLowerCase().charAt(i)) {
                case 'a':
                    cont++;
                    break;
                case 'e':
                    cont++;
                    break;
                case 'i':
                    cont++;
                    break;
                case 'o':
                    cont++;
                    break;
                case 'u':
                    cont++;
                    break;
                default:

            }
        }
        System.out.println("La cantidad de vocales que tiene la palabra es de: " + cont);
        return cont;
    }

    public String invertirFrase(Cadena palabra) {
        String fraseInvertida = "";

        for (int i = palabra.getLongitud(); i > 0; i--) {
            fraseInvertida = fraseInvertida.concat(palabra.getFrase().substring(i - 1, i));
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
        return fraseInvertida;
    }

    public int vecesRepetido(Cadena palabra) {
        String letra;
        int cont = 0;
        System.out.println("Ingrese una letra a buscar en la frase: ");
        letra = leer.nextLine();
        for (int i = 1; i < palabra.getLongitud(); i++) {
            if (letra.equals(palabra.getFrase().substring(i - 1, i).toLowerCase())) {
                cont++;
            }
        }
        System.out.println("La cantidad de veces que se repite la letra: " + letra);
        System.out.println("es de: " + cont + " veces.");
        return cont;
    }

    public int compararLongitud(Cadena palabra) {
        String frase;
        int longitud = 0;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();

        if (frase.length() > palabra.getFrase().length()) {
            longitud = frase.length() - palabra.getFrase().length();
            System.out.println("La diferencia de longitud es de: " + longitud);
            return longitud;
        } else if (frase.length() <= palabra.getFrase().length()) {
            longitud = palabra.getFrase().length()-frase.length();
            System.out.println("La diferencia de longitud es de: " + longitud);
            return longitud;
        }
        return longitud;
    }

    public String unirFrases(Cadena palabra) {
        String frase;
        System.out.println("Ingrese una frase para concatenar: ");
        frase = leer.nextLine();
        palabra.setFrase(frase.concat(palabra.getFrase()));
        System.out.println("La nueva frase es: " + palabra.getFrase());
        return frase;
    }

    public String reemplazarLetra(Cadena palabra) {

        String fraseFinal, letra;
        System.out.println("Seleccione un caracter para reemplazar la vocal A: ");
        letra = leer.next();
        fraseFinal = palabra.getFrase().replace("a", letra);
        System.out.println("Su nueva frase es: " + fraseFinal);
        return fraseFinal;
    }

    public boolean contieneLetra(Cadena palabra) {
        System.out.println("Ingrese una letra");
        leer.nextLine();
        String letra = leer.nextLine();
        for (int i = 1; i < palabra.getLongitud(); i++) {
            if (letra.equals(palabra.getFrase().substring(i - 1, i))) {
                return true;
            }
        }
        return false;
    }
    
    

}
