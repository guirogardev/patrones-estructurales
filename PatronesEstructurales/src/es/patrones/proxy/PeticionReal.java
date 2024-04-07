package es.patrones.proxy;

public class PeticionReal implements Peticion {

	@Override
	public void pedir() {
		System.out.println("Petición real: Pidiendo...");
	}

}
