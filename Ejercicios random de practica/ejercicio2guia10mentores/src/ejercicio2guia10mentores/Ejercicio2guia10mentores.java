package ejercicio2guia10mentores;

//En este ejercicio vamos a mostrar la tabla de posiciones final de un torneo del deporte que deseen. 
//Para ello deberán crear una clase llamada "EquipoDe…" que represente a un equipo del deporte seleccionado. 
//La clase debe tener los siguientes atributos: nombre del equipo, ciudad, cantidad de partidos jugados, ganados, 
//perdidos y empatados, y puntos totales.
public class Ejercicio2guia10mentores {

    public static void main(String[] args) {

        EquipoService x = new EquipoService();
        x.configEquipos();
        x.mostrarEquipos();
        x.determinarGanador();

    }

}
