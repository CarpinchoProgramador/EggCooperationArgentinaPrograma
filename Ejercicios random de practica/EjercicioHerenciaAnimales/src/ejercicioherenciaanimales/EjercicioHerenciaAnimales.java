package ejercicioherenciaanimales;

import java.util.ArrayList;
import java.util.List;

public class EjercicioHerenciaAnimales {

//    Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
//“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
//método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
//un ArrayList de animales y los siguientes animales
//Animal a = new Animal();
//Animal b = new Perro();
//Animal c = new Gato();
//Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
//método hacerRuido() de cada ítem
    public static void main(String[] args) {
        Animal a = new Animal();
        Perro p1 = new Perro();
        Gato c = new Gato();
        
        List<Animal> lista1 = new ArrayList<>();
        
        p1 = p1.crearPerro();
        
        lista1.add(a);
        lista1.add(p1);
        lista1.add(c);
        
        System.out.println(p1.toString());
        
        lista1.forEach((xd) -> {
            System.out.println("El ruido que hace es: " + xd.hacerRuido());
        });
        
    }

}
