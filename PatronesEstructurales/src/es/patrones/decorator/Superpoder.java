package es.patrones.decorator;

public abstract class Superpoder implements Mortal {
    private Mortal mortal;

    public Superpoder(Mortal mortal) {
        this.mortal = mortal;
    }

    @Override
    public void actuar() {
        this.mortal.actuar();
    }
}
