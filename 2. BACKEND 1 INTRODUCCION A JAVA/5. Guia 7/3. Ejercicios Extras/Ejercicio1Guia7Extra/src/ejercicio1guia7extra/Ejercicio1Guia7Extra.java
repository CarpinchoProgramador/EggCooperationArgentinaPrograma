package ejercicio1guia7extra;

public class Ejercicio1Guia7Extra {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Servicio sc = new Servicio();

        cancion1 = sc.datosCancion();
        Servicio.escribirDatos(cancion1);
    }
}
