package es.patrones.bridge;

/**
 * Comportamiento concreto de un archivo CSV.
 */
public class ArchivoCsv implements FormatoArchivo {
	
	@Override
    public void openFile() {
        System.out.println("Abriendo un CSV");
    }

    @Override
    public void closeFile() {
    	System.out.println("Cerrando un CSV");
    }

    @Override
    public void readFile() {
    	System.out.println("Leyendo un CSV");
    }
}
