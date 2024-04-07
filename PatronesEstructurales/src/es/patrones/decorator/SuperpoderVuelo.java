package es.patrones.decorator;

public class SuperpoderVuelo extends Superpoder {
	
    public SuperpoderVuelo(Mortal mortal) {
    	super(mortal);
    }

    @Override
    public void actuar() {
        super.actuar();
        System.out.println("Y además tengo el superpoder de volar.");
    }
}
