package ejerciciobarajadecartas;

import java.util.Scanner;

public class EjercicioBarajaDeCartas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        BarajaService sc = new BarajaService();
        Baraja obj = sc.crearBaraja();
        int var = 0;
        do {
            System.out.println("-----Seleccione una opcion-----");
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente carta");
            System.out.println("3. Cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Monton de cartas");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            var = leer.nextInt();

            switch (var) {
                case 1:
                    sc.barajar(obj);
                    break;
                case 2:
                    sc.siguienteCarta(obj);
                    break;
                case 3:
                   ;
                    System.out.println("Quedan "+ sc.cartasDisponibles(obj) + " cartas");
                    break;
                case 4:
                    sc.darCartas(obj);
                    break;
                case 5:
                    sc.cartasMonton(obj);
                    break;
                case 6:
                    sc.mostrarBaraja(obj);
                    break;
                case 7:
                    System.out.println("Gracias por jugar");
                    break;
                default:
                    System.out.println("valor incorrecto, intentelo nuevamente.");
            }

        } while (var != 7);

    }

}
