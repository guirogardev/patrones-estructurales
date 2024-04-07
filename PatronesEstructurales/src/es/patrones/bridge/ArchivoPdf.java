package es.patrones.bridge;

/**
 * Comportamiento concreto de un archivo PDF.
 */
public class ArchivoPdf implements FormatoArchivo {
	
	@Override
    public void openFile() {
        System.out.println("Abriendo un PDF");
    }

    @Override
    public void closeFile() {
    	System.out.println("Cerrando un PDF");
    }

    @Override
    public void readFile() {
    	System.out.println("Leyendo un PDF");
    }
}
