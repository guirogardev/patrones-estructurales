package es.patrones.decorator;

public class Humano implements Mortal {

	@Override
	public void actuar() {
		System.out.println("Realizando acción humana.");
	}

}
