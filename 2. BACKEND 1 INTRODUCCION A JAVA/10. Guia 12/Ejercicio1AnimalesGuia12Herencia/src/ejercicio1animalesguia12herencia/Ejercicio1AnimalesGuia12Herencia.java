package ejercicio1animalesguia12herencia;

public class Ejercicio1AnimalesGuia12Herencia {

    public static void main(String[] args) {
        //Declaracion del objeto perro
        Animal perro1 = new Perro("Stitch", "Carnivoro", 3, "Doberman");
        perro1.Alimentarse();
        //Declaracion otro objeto perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        //Declaracion del objeto gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();
        //Declaracion del objeto caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();

    }

}
