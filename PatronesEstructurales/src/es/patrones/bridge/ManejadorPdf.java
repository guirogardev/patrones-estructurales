package es.patrones.bridge;

/**
 * Manejo de ficheros CSV.
 */
public class ManejadorPdf extends Archivo {
	public ManejadorPdf(FormatoArchivo formatoArchivo) {
        super(formatoArchivo);
    }

    @Override
    public void processFile() {
    	this.formatoArchivo.openFile();
    	this.formatoArchivo.readFile();
    	this.formatoArchivo.closeFile();
    }
}
