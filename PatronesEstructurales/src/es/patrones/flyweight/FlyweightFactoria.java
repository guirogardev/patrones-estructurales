package es.patrones.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Gestiona los objetos flyweight y los reutiliza si puede.
 */
public class FlyweightFactoria {
	private Map<String, FlyweightObjeto> flyweights = new HashMap<>();

    public FlyweightObjeto getFlyweight(String data) {
        if (!flyweights.containsKey(data)) {
            flyweights.put(data, new FlyweightObjeto(data));
        }
        return flyweights.get(data);
    }

    public int getFlyweightCount() {
        return flyweights.size();
    }
}
