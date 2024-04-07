package es.patrones.bridge;

/**
 * Define un manejo concreto de archivos dado un comportamiento inicial concreto.
 */
public abstract class Archivo {
	protected FormatoArchivo formatoArchivo;

    public Archivo(FormatoArchivo formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public abstract void processFile();
}
