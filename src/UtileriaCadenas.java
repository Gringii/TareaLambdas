import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class UtileriaCadenas {

    private UtileriaCadenas() {
    }

    /**
     * 2. El Filtro Selectivo
     */
    public static void filtroSelectivo(ArrayList<String> lista, char letra, int n) {
        if (lista == null) {
            return;
        }
        char letraMin = Character.toLowerCase(letra);
        lista.removeIf(s -> s == null
                || s.length() < n
                || (!s.isEmpty() && Character.toLowerCase(s.charAt(0)) == letraMin));
    }

    /**
     * 3. Conversor de Mayúsculas
     */
    public static ArrayList<String> conversorMayusculas(ArrayList<String> lista) {
        if (lista == null) {
            return new ArrayList<>();
        }
        return lista.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * 5. Mapa de Longitudes
     */
    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> palabras) {
        if (palabras == null) {
            return new HashMap<>();
        }
        return palabras.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        palabra -> palabra,
                        String::length,
                        (a, b) -> a,
                        HashMap::new));
    }

    /**
     * 7. Contador de Frecuencias
     */
    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> frecuencias = new HashMap<>();
        if (palabras == null) {
            return frecuencias;
        }
        for (String palabra : palabras) {
            if (palabra != null) {
                frecuencias.merge(palabra, 1, (actual, uno) -> actual + uno);
            }
        }
        return frecuencias;
    }

    /**
     * 8. Clasificador de Palabras
     */
    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> frecuencias,
                                                         int umbral) {
        if (frecuencias == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(frecuencias.entrySet().stream()
                .filter(e -> e.getValue() != null && e.getValue() < umbral)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList()));
    }

    /**
     * 9. Deduplicación de Palabras
     */
    public static HashSet<String> deduplicacionPalabras(String frase, int n) {
        if (frase == null || frase.isBlank()) {
            return new HashSet<>();
        }
        String[] palabras = frase.split("[^\\p{L}\\p{N}]+");
        return Arrays.stream(palabras)
                .filter(p -> !p.isEmpty() && p.length() >= n)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }
}