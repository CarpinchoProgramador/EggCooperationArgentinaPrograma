/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia7practica;

import Entidad.Libro;
import java.util.Scanner;

/*Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar 
mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
*/
public class Ejercicio1Guia7Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro Poesia = new Libro();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cargue ISBN");
        Poesia.setISBN(leer.nextInt());
        
        System.out.println("Cargue el titulo");
        Poesia.setTitulo(leer.next());
        
        System.out.println("Cargue el autor");
        Poesia.setAutor(leer.next());
        
        System.out.println("Cargue el numero de paginas.");
        Poesia.setTitulo(leer.next());
        
        System.out.println("");
        System.out.println(Poesia.toString());
        System.out.println("");
        
        System.out.println("El ISBN es: " + Poesia.getISBN());
        System.out.println("El Autor es: " + Poesia.getAutor());
        System.out.println("El Titulo es: " + Poesia.getTitulo());
        System.out.println("El numero de paginas es: " + Poesia.getPaginas());
        
    }
    
}
