package es.patrones.bridge;

/**
 * Manejo de ficheros CSV.
 */
public class ManejadorCsv extends Archivo {
	public ManejadorCsv(FormatoArchivo formatoArchivo) {
        super(formatoArchivo);
    }

    @Override
    public void processFile() {
    	this.formatoArchivo.openFile();
    	this.formatoArchivo.readFile();
    	this.formatoArchivo.closeFile();
    }
}
