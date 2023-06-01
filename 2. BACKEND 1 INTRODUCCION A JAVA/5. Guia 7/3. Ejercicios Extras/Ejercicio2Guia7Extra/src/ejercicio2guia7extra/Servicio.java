package ejercicio2guia7extra;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Puntos objeto = new Puntos();

    public Puntos crearPuntos() {
        System.out.println("Ingrese un numero entero para el EJE X del primer punto: ");
        objeto.setX1(leer.nextInt());
        System.out.println("Ingrese otro numero entero para el EJE Y del primer punto: ");
        objeto.setY1(leer.nextInt());

        System.out.println("Ingrese un numero entero para EJE X del segundo punto: ");
        objeto.setX2(leer.nextInt());
        System.out.println("Ingrese otro numero entero para el EJE Y delsegundo punto: ");
        objeto.setY2(leer.nextInt());
        return objeto;
    }

    public void calcularPuntos(Puntos objeto) {
        double distancia = 0;
        // (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)
        distancia = ((objeto.getX2() - objeto.getX1()) * (objeto.getX2() * objeto.getX1())) + ((objeto.getY2() - objeto.getY1()) * (objeto.getY2() - objeto.getY1()));
        distancia = Math.sqrt(distancia);
        System.out.println("La DISTANCIA entre los puntos es de " + distancia);
    }

}
