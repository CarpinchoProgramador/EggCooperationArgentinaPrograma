package ejercicio6guia10practica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    HashMap<String, Integer> productosAux = new HashMap<>();

    public void execute() {
        int var = 0;
        do {
            System.out.println("-----Seleccione una opcion-----");
            System.out.println("1. Ingresar producto.");
            System.out.println("2. Modificar el precio de un producto.");
            System.out.println("3. Eliminar un producto.");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir del programa.");
            var = leer.nextInt();

            switch (var) {
                case 1:
                    introElemento();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProducto();
                    break;
                default:
                    System.out.println("Gracias por usar el programa!");
            }

        } while (var != 5);

    }

    public void introElemento() {
        System.out.print("Ingrese el producto que quiere ingresar ->");
        String nombreProducto = leer.next();
        System.out.print("Ingrese el precio del producto ->");
        Integer precioProducto = leer.nextInt();
        productosAux.put(nombreProducto, precioProducto);
        System.out.println("-----Producto añadido correctamente-----");

    }

    public void modificarPrecio() {
        System.out.print("Ingrese el producto a modificar->");
        String productoModificar = leer.next();
        if (productosAux.containsKey(productoModificar)) {
            System.out.print("Ingrese el valor nuevo ->");
            productosAux.replace(productoModificar, leer.nextInt());
        } else {
            System.out.println("El producto no se encuentra en la lista o esta mal escrito. menso");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el producto al cual eliminar->");
        String productoEliminar = leer.next();
        if (productosAux.containsKey(productoEliminar)) {
            productosAux.remove(productoEliminar);
            System.out.println("-----Producto eliminado correctamente-----");
        } else {
            System.out.println("El producto no se encuentra en la lista o esta mal escrito. menso");
        }

    }

    public void mostrarProducto() {
        for (Map.Entry<String, Integer> producto : productosAux.entrySet()) {
            System.out.println("Producto: " + producto.getKey());
            System.out.println("Precio: " + producto.getValue());
        }
    }

}
