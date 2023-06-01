package juegodecartas;

import java.util.HashMap;

public class Cartas {
    
    private HashMap<Integer, String> cartaEspada;
    private HashMap<Integer, String> cartaBasto;
    private HashMap<Integer, String> cartaOro;
    private HashMap<Integer, String> cartaCopa;

    public Cartas() {
    }

    public Cartas(HashMap<Integer, String> cartaEspada, HashMap<Integer, String> cartaBasto, HashMap<Integer, String> cartaOro, HashMap<Integer, String> cartaCopa) {
        this.cartaEspada = cartaEspada;
        this.cartaBasto = cartaBasto;
        this.cartaOro = cartaOro;
        this.cartaCopa = cartaCopa;
    }

    public HashMap<Integer, String> getCartaEspada() {
        return cartaEspada;
    }

    public void setCartaEspada(HashMap<Integer, String> cartaEspada) {
        this.cartaEspada = cartaEspada;
    }

    public HashMap<Integer, String> getCartaBasto() {
        return cartaBasto;
    }

    public void setCartaBasto(HashMap<Integer, String> cartaBasto) {
        this.cartaBasto = cartaBasto;
    }

    public HashMap<Integer, String> getCartaOro() {
        return cartaOro;
    }

    public void setCartaOro(HashMap<Integer, String> cartaOro) {
        this.cartaOro = cartaOro;
    }

    public HashMap<Integer, String> getCartaCopa() {
        return cartaCopa;
    }

    public void setCartaCopa(HashMap<Integer, String> cartaCopa) {
        this.cartaCopa = cartaCopa;
    }

    

    
    
    
    
    
    
    
    
}
