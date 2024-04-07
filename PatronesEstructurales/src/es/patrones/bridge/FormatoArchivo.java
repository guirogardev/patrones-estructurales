package es.patrones.bridge;

/**
 * Aquí definimos el comportamiento. Todo lo que implemente esta interfaz, provee una implementación concreta de esas acciones.
 */
public interface FormatoArchivo {
	public abstract void openFile();
    public abstract void closeFile();
    public abstract void readFile();
}
