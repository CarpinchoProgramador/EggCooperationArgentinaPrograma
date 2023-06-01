package ahorcadochatgpt;

import java.util.Scanner;

public class AhorcadoClassGPT {

    private char[] palabra;
    private boolean[] letrasEncontradas;
    private int jugadasMaximas;
    private int jugadasRestantes;

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);

        // Pedir la palabra al usuario
        System.out.print("Ingrese la palabra a adivinar: ");
        String palabraStr = scanner.nextLine().toUpperCase();

        // Pedir la cantidad de jugadas máximas
        System.out.print("Ingrese la cantidad máxima de jugadas: ");
        jugadasMaximas = scanner.nextInt();

        // Inicializar los atributos
        palabra = palabraStr.toCharArray();
        letrasEncontradas = new boolean[palabra.length];
        jugadasRestantes = jugadasMaximas;

        // Mostrar mensaje de inicio
        System.out.println("¡Comienza el juego!");
        System.out.println("La palabra a adivinar tiene " + palabra.length + " letras.");
    }

    public void longitud() {
        System.out.println("La palabra a adivinar tiene " + palabra.length + " letras.");
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;

        // Buscar la letra en la palabra y marcarla como encontrada si corresponde
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                letrasEncontradas[i] = true;
                encontrada = true;
            }
        }

        // Restar una jugada si la letra no fue encontrada
        if (!encontrada) {
            jugadasRestantes--;
            System.out.println("La letra '" + letra + "' no está en la palabra.");
        }

        return encontrada;
    }

    public boolean encontradas(char letra) {
        int encontradas = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra && letrasEncontradas[i]) {
                encontradas++;
            }
        }
        int faltan = palabra.length - encontradas;

        System.out.println("La letra '" + letra + "' se encontró " + encontradas + " veces.");
        System.out.println("Faltan encontrar " + faltan + " letras.");

        return encontradas > 0;
    }

    public void intentos() {
        System.out.println("Le quedan " + jugadasRestantes + " oportunidades.");
    }

    public void juego() {
        Scanner scanner = new Scanner(System.in);

        // Crear el juego
        crearJuego();

        while (jugadasRestantes > 0) {
            // Pedir una letra al usuario
            System.out.print("Ingrese una letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);

            // Buscar la letra en la palabra
            boolean encontrada = buscar(letra);

            // Mostrar las letras encontradas y faltantes
            encontradas(letra);

            // Mostrar las oportunidades restantes
            intentos();

            // Verificar si se adivinó toda la palabra
            boolean adivinado = true;
            for (boolean encontradaActual : letrasEncontradas) {
                if (!encontradaActual) {
                    adivinado = false;
                    break;
                }
            }

            if (adivinado) {
                System.out.println("¡Felicitaciones, has adivinado la palabra");
            }
        }
    }
}
        
    
