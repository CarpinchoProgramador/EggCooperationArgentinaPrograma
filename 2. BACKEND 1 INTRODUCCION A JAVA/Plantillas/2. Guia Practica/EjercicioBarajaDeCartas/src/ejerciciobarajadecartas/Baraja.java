package ejerciciobarajadecartas;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> mazo;
    private ArrayList<Carta> monton;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }
    
    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

}
