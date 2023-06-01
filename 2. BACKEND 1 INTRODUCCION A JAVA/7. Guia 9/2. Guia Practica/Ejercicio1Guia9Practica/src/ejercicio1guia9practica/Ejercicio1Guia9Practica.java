package ejercicio1guia9practica;

import java.util.Scanner;

//Realizar una clase llamada Cadena, en el paquete de entidades, 
//que tenga como atributos una frase (String) y su longitud. 
//Agregar constructor vacío y con atributo frase solamente. 
//Agregar getters y setters. 
//El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
//Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:



public class Ejercicio1Guia9Practica {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena frase1 = new Cadena();
    Servicio sc = new Servicio();
    
    frase1 = sc.insertarFrase();
    sc.mostrarVocales(frase1);
    sc.invertirFrase(frase1);
    sc.vecesRepetido(frase1);
    sc.compararLongitud(frase1);
    sc.unirFrases(frase1);
    sc.reemplazarLetra(frase1);
    System.out.println(sc.contieneLetra(frase1));
    



    }

}
