package ejercicio1guia11extrasaladecine;

import java.util.Scanner;

public class CineService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Cine salaCine = new Cine();
    Pelicula peli = new Pelicula();
    Espectador[][] espectadores = new Espectador[8][6];
    boolean[][] asientoOcupadoVector = new boolean[8][6];

    public void rellenarEspectadores() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Espectador x = new Espectador();
                x.setNombre("Espectador: " + (i + 1));
                x.setDinero(Math.random() * 300 + 1);
                x.setEdad((int) (Math.random() * 40));
                espectadores[i][j] = x;
                asientoOcupadoVector[i][j] = false;
            }
        }

    }

    public void ocuparAsientos() {
        int precioEntrada = 70;
        Espectador[][] espectadoresAdmitidos = new Espectador[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (espectadores[i][j].getDinero() >= precioEntrada && espectadores[i][j].getEdad() >= salaCine.getPelicula().getEdadMinima() && asientoOcupadoVector[i][j] == false) {
                    asientoOcupadoVector[i][j] = true;
                    espectadoresAdmitidos[i][j] = espectadores[i][j];
                }
            }
        }
        salaCine.setAuxAsientoOcupado(asientoOcupadoVector);
        salaCine.setSalaEspectadores(espectadoresAdmitidos);
    }

    public void rellenarPelicula() {
        peli.setDirector("Nicki Nicole");
        peli.setDuracion(1.5);
        peli.setEdadMinima(18);
        peli.setTitulo("Nicki Nicole, YSY A - CAEN LAS ESTRELLAS (Official Video)");
        salaCine.setPelicula(peli);
    }

    private void informacionSalaDelCine() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                boolean auxTrue = salaCine.getAuxAsientoOcupado()[i][j];
                switch (j) {
                    case 0:
                        System.out.print((8 - i) + "A");
                        if (auxTrue) {
                            System.out.print(" X");
                            System.out.print("|");
                        } else {
                            System.out.print("  |");
                        }
                        break;
                    case 1:
                        System.out.print((8 - i) + "B");
                        if (auxTrue) {
                            System.out.print(" X");
                            System.out.print("|");
                        } else {
                            System.out.print("  |");
                        }
                        break;
                    case 2:
                        System.out.print((8 - i) + "C");
                        if (auxTrue) {
                            System.out.print(" X");
                            System.out.print("|");
                        } else {
                            System.out.print("  |");
                        }
                        break;
                    case 3:
                        System.out.print((8 - i) + "D");
                        if (auxTrue) {
                            System.out.print(" X");
                            System.out.print("|");
                        } else {
                            System.out.print("  |");
                        }
                        break;
                    case 4:
                        System.out.print((8 - i) + "E");
                        if (auxTrue) {
                            System.out.print(" X");
                            System.out.print("|");
                        } else {
                            System.out.print("  |");
                        }
                        break;
                    case 5:
                        System.out.print((8 - i) + "F");
                        if (auxTrue) {
                            System.out.print(" X");
                            System.out.print("|");
                        } else {
                            System.out.print("  |");
                        }
                        break;
                }
            }
            System.out.println("");
        }
    }

    public void ejecutar() {
        rellenarEspectadores();
        rellenarPelicula();
        ocuparAsientos();
        informacionSalaDelCine();
    }
}
