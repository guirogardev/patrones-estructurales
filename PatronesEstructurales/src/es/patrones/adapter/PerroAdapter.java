package es.patrones.adapter;

/**
 * En lugar de ser el perro el que implementa directamente Animal, se crea este
 * adaptador.
 */
public class PerroAdapter implements Animal {
    private Perro perro;

    public PerroAdapter(Perro perro) {
        this.perro = perro;
    }

    @Override
    public void hacerSonido() {
        this.perro.ladrar();
    }
}
