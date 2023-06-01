package ejerciciointegradorjavabackend;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioIntegradorJavaBackEND {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    Estudiante x = new Estudiante();
    
    for (int i = 2; i <= 128; i*=2) {
        System.out.println("i"+i);
    }
    
    
    x.programaRun();
    
    

    }

}
