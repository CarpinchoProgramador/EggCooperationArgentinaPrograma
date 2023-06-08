package ejercicio1guia11extrasaladecine;

import java.util.ArrayList;
import java.util.Scanner;

public class CineService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Cine> salasDelCine = new ArrayList<>();
    int contadorGenteAdmitida = 0;

    ArrayList<Espectador[][]> espectadoresPorSala = new ArrayList<>();
    ArrayList<Boolean[][]> asientosOcupadosPorSala = new ArrayList<>();

    public void rellenarEspectadores() {
        for (int k = 0; k < salasDelCine.size(); k++) {
            Espectador[][] espectadores = new Espectador[8][6];
            Boolean[][] asientoOcupadoVector = new Boolean[8][6];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    Espectador x = new Espectador();
                    x.setNombre("Espectador: " + (i + 1));
                    x.setDinero(Math.random() * 300 + 1);
                    x.setEdad((int) (Math.random() * 40));
                    espectadores[i][j] = x;
                    asientoOcupadoVector[i][j] = false;
                    espectadoresPorSala.add(espectadores);
                    asientosOcupadosPorSala.add(asientoOcupadoVector);
                }
            }
        }
    }

    public void ocuparAsientos() {
        int precioEntrada = 70;

        for (int k = 0; k < salasDelCine.size(); k++) {
            rellenarEspectadores();
            Espectador[][] espectadoresAdmitidos = new Espectador[8][6];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    if (espectadoresPorSala.get(k)[i][j].getDinero() >= precioEntrada && espectadoresPorSala.get(k)[i][j].getEdad() >= salasDelCine.get(k).getPelicula().getEdadMinima() && asientosOcupadosPorSala.get(k)[i][j] == false) {
                        asientosOcupadosPorSala.get(k)[i][j] = true;
                        espectadoresAdmitidos[i][j] = espectadoresPorSala.get(k)[i][j];
                        contadorGenteAdmitida++;
                    }
                }
            }
            salasDelCine.get(k).setSalaEspectadores(espectadoresAdmitidos);
            salasDelCine.get(k).setAuxAsientoOcupado(asientosOcupadosPorSala.get(k));
        }
    }

    public void rellenarPelicula() {
        for (int i = 0; i < salasDelCine.size(); i++) {
            Pelicula peli = new Pelicula();
            peli.setDirector("Nicki Nicole");
            peli.setDuracion(1.5);
            peli.setEdadMinima(18);
            System.out.print("Ingrese el titulo de la pelicula en la sala " + (i + 1) + " --> ");
            peli.setTitulo(leer.next());
            salasDelCine.get(i).setPelicula(peli);
        }
    }

    private void informacionSalaDelCine() {
        for (int k = 0; k < salasDelCine.size(); k++) {
            System.out.println("--------------------------------------------");
            System.out.println("Sala " + (k + 1) + " | Pelicula: " + salasDelCine.get(k).getPelicula().getTitulo());
            System.out.println("--------------------------------------------");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    boolean auxTrue = asientosOcupadosPorSala.get(k)[i][j];
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

    }

    private boolean comprobarDisponibilidad() {
        boolean disponibilidadSala;
        if (contadorGenteAdmitida < 48) {
            return false;
        } else {
            return true;
        }
    }

    private double calcularGananciaBruta() {
        return contadorGenteAdmitida * 70;
    }

    private void crearSalasDeCine() {
        System.out.print("Ingrese cuantas salas desea crear --> ");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            Cine salaCine = new Cine();
            salasDelCine.add(salaCine);
        }
    }

    private void mostrarTodasLasSalas() {
        informacionSalaDelCine();
    }

    public void ejecutar() {
        crearSalasDeCine();
        rellenarPelicula();
        ocuparAsientos();
        mostrarTodasLasSalas();
    }

}
