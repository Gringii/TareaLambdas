import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

public class UtileriaNumeros {

    private UtileriaNumeros() {
    }

    /**
     * 1. El Multiplicador
     */
    public static void multiplicarArrayList(ArrayList<Integer> lista, int factor) {
        if (lista == null) {
            return;
        }
        lista.replaceAll(n -> n == null ? null : n * factor);
    }

    /**
     * 4. Cuadrados Únicos
     */
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista) {
        if (lista == null) {
            return new HashSet<>();
        }
        return new HashSet<>(lista.stream()
                .filter(Objects::nonNull)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toSet()));
    }

    /**
     * 6. Modificador de Inventario
     */
        public static void modificadorInventario(HashMap<String, Double> inventario) {
            if (inventario == null || inventario.isEmpty()) {
                System.out.println("  (inventario vacío o nulo)");
                return;
            }
            inventario.forEach((producto, precio) -> {
                if (precio == null) {
                    System.out.printf("  %-12s precio no disponible%n", producto);
                } else {
                    System.out.printf(Locale.US, "  %-12s $%8.2f -> $%8.2f (-10%%)%n",
                            producto, precio, precio * 0.90);
                }
            });
        }

    /**
     * 10. El Tope de Frecuencias
     */
    public static void topeFrecuencias(HashMap<String, Integer> frecuencias, int n) {
        if (frecuencias == null) {
            return;
        }
        frecuencias.replaceAll((palabra, frec) -> (frec != null && frec > n) ? Integer.valueOf(n) : frec);
    }
}