package es.patrones.facade;

/**
 * Fachada.
 */
public class OperacionesMalignas {
	private final SubsistemaAniquilacionTotal subsistemaAniquilacionTotal;
    private final SubsistemaConquistaMundial subsistemaConquistaMundial;

    public OperacionesMalignas() {
        this.subsistemaAniquilacionTotal = new SubsistemaAniquilacionTotal();
        this.subsistemaConquistaMundial = new SubsistemaConquistaMundial();
    }
    
    public void aplicarMalignidadAbsoluta() {
    	this.subsistemaConquistaMundial.conquistarMundo();
    	this.subsistemaAniquilacionTotal.aniquilar();
    }
}
