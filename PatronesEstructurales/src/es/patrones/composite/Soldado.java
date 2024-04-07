package es.patrones.composite;

public class Soldado implements Rango {

    @Override
    public void presentarse() {
        System.out.println("Soy un soldado.");
    }
}
