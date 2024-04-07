package es.patrones.decorator;

public class SuperpoderRayos extends Superpoder {
	
    public SuperpoderRayos(Mortal mortal) {
    	super(mortal);
    }

    @Override
    public void actuar() {
        super.actuar();
        System.out.println("Y además tengo el superpoder de lanzar rayos.");
    }
}
