package es.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Sargento implements Rango {
    private List<Rango> subordinados = new ArrayList<>();

    public void agregarSubordinado(Rango subordinado) {
        this.subordinados.add(subordinado);
    }

    @Override
    public void presentarse() {
        System.out.println("Soy un sargento y se presentan los siguientes " + this.subordinados.size() + " subordinados:");
        for (Rango subordinado : this.subordinados) {
            subordinado.presentarse();
        }
    }
}
