package es.patrones.proxy;

public class Proxy implements Peticion {
	private PeticionReal peticionReal;

    public Proxy() {
        this.peticionReal = new PeticionReal();
    }

	@Override
	public void pedir() {
		System.out.println("Proxy: Preprocesando...");
		this.peticionReal.pedir();
        System.out.println("Proxy: Postprocesando...");		
	}
}
