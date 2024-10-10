package practicas.prototype;

import java.util.HashMap;
import java.util.Map;

public class RecetaCache {
    private static Map<String, Receta> recetaMap = new HashMap<>();

    public static Receta getReceta(String recetaNombre) {
        Receta cachedReceta = recetaMap.get(recetaNombre);
        return (Receta) cachedReceta.clone();
    }

    public static void cargarCache() {
        Paella paella = new Paella();
        recetaMap.put("Paella", paella);

        Ramen ramen = new Ramen();
        recetaMap.put("Ramen", ramen);
    }
}


