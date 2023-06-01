package ahorcadomejorado;

import java.util.ArrayList;
import java.util.Arrays;

public class Ahorcado {

    private int letrasEncontradas;
    private int longitud;
    private int intentosMax;
    private String letraUser;
    private ArrayList<String> palabra;
    private ArrayList<String> palCompletada;

    public Ahorcado() {
    }

    public Ahorcado(int letrasEncontradas, int longitud, int intentosMax, String letraUser, ArrayList<String> palabra, ArrayList<String> palCompletada) {
        this.letrasEncontradas = letrasEncontradas;
        this.longitud = longitud;
        this.intentosMax = intentosMax;
        this.letraUser = letraUser;
        this.palabra = palabra;
        this.palCompletada = palCompletada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public String getLetraUser() {
        return letraUser;
    }

    public void setLetraUser(String letraUser) {
        this.letraUser = letraUser;
    }

    public ArrayList<String> getPalabra() {
        return palabra;
    }

    public void setPalabra(ArrayList<String> palabra) {
        this.palabra = palabra;
    }

    public ArrayList<String> getPalCompletada() {
        return palCompletada;
    }

    public void setPalCompletada(ArrayList<String> palCompletada) {
        this.palCompletada = palCompletada;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "letrasEncontradas=" + letrasEncontradas + ", longitud=" + longitud + ", intentosMax=" + intentosMax + ", letraUser=" + letraUser + ", palabra=" + palabra + ", palCompletada=" + palCompletada + '}';
    }

    
    
    
}
