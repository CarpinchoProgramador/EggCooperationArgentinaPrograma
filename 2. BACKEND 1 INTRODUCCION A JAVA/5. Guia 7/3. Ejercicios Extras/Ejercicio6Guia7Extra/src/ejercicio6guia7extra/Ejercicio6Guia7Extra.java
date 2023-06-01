package ejercicio6guia7extra;

public class Ejercicio6Guia7Extra {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Servicio sc = new Servicio();
        rectangulo1 = sc.lados();
        sc.calcular_area(rectangulo1);
    }

}
