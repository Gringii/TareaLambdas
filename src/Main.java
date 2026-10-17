import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Clase Main para probar diferentes casos.
 */
public class Main {

    public static void main(String[] args) {

        //1. El Multiplicador (ArrayList)
        System.out.println("\n=== 1. El Multiplicador ===");
        ArrayList<Integer> normal = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Antes (factor 3):   " + normal);
        UtileriaNumeros.multiplicarArrayList(normal, 3);
        System.out.println("Después:            " + normal);

        ArrayList<Integer> negativo = new ArrayList<>(Arrays.asList(2, -4, 0));
        UtileriaNumeros.multiplicarArrayList(negativo, -2);
        System.out.println("Factor -2 sobre [2, -4, 0]: " + negativo);

        ArrayList<Integer> cero = new ArrayList<>(Arrays.asList(7, 8, 9));
        UtileriaNumeros.multiplicarArrayList(cero, 0);
        System.out.println("Factor 0 sobre [7, 8, 9]: " + cero);

        ArrayList<Integer> vacia1 = new ArrayList<>();
        UtileriaNumeros.multiplicarArrayList(vacia1, 10);
        System.out.println("Lista vacía:        " + vacia1);

        ArrayList<Integer> conNulo1 = new ArrayList<>(Arrays.asList(1, null, 3));
        UtileriaNumeros.multiplicarArrayList(conNulo1, 2);
        System.out.println("Lista con null:     " + conNulo1);

        UtileriaNumeros.multiplicarArrayList(null, 5);
        System.out.println("Lista null:         ");

        // ===== 2. El Filtro Selectivo =====
        System.out.println("\n=== 2. El Filtro Selectivo ===");
        ArrayList<String> palabras2 = new ArrayList<>(Arrays.asList("manzana", "Mango", "pera",
                "uva", "burrito", "Aguacate", "melón", "fresa"));
        System.out.println("Antes:  " + palabras2);
        UtileriaCadenas.filtroSelectivo(palabras2, 'm', 5);
        System.out.println("Después (quitar letra 'm' o longitud < 5): " + palabras2);

        ArrayList<String> vacia2 = new ArrayList<>();
        UtileriaCadenas.filtroSelectivo(vacia2, 'a', 3);
        System.out.println("Lista vacía: " + vacia2);

        ArrayList<String> conNulo2 = new ArrayList<>(Arrays.asList("hola", null, "adiós", ""));
        UtileriaCadenas.filtroSelectivo(conNulo2, 'a', 2);
        System.out.println("Con null y cadena vacía ['hola', null, 'adiós', '']: " + conNulo2);

        UtileriaCadenas.filtroSelectivo(null, 'a', 3);
        System.out.println("Lista null:");

        // ===== 3. Conversor de Mayúsculas =====
        System.out.println("\n=== 3. Conversor de Mayúsculas ===");
        ArrayList<String> original3 = new ArrayList<>(Arrays.asList("hola", "Mundo", "java", "LaMbDaS"));
        ArrayList<String> resultado3 = UtileriaCadenas.conversorMayusculas(original3);
        System.out.println("Original (no cambia): " + original3);
        System.out.println("Nueva lista:          " + resultado3);
        System.out.println("Lista vacía:          " + UtileriaCadenas.conversorMayusculas(new ArrayList<>()));
        System.out.println("Con null ['a', null]: "
                + UtileriaCadenas.conversorMayusculas(new ArrayList<>(Arrays.asList("a", null))));
        System.out.println("Lista null:           " + UtileriaCadenas.conversorMayusculas(null));

        // ===== 4. Cuadrados Únicos =====
        System.out.println("\n=== 4. Cuadrados Únicos ===");
        ArrayList<Integer> numeros4 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 6));
        System.out.println("Lista:      " + numeros4);
        System.out.println("Cuadrados de pares únicos: " + UtileriaNumeros.cuadradosUnicos(numeros4));
        System.out.println("Solo impares [1,3,5]:      "
                + UtileriaNumeros.cuadradosUnicos(new ArrayList<>(Arrays.asList(1, 3, 5))));
        System.out.println("Con negativos y 0 [-2,-2,0]: "
                + UtileriaNumeros.cuadradosUnicos(new ArrayList<>(Arrays.asList(-2, -2, 0))));
        System.out.println("Lista vacía: " + UtileriaNumeros.cuadradosUnicos(new ArrayList<>()));
        System.out.println("Lista null:  " + UtileriaNumeros.cuadradosUnicos(null));

        // ===== 5. Mapa de Longitudes =====
        System.out.println("\n=== 5. Mapa de Longitudes ===");
        ArrayList<String> palabras5 = new ArrayList<>(Arrays.asList("sol", "luna", "estrella", "cielo"));
        System.out.println("Palabras: " + palabras5);
        System.out.println("Mapa:     " + UtileriaCadenas.mapaLongitudes(palabras5));
        System.out.println("Con palabras repetidas ['sol','sol','luna']: "
                + UtileriaCadenas.mapaLongitudes(new ArrayList<>(Arrays.asList("sol", "sol", "luna"))));
        System.out.println("Lista vacía: " + UtileriaCadenas.mapaLongitudes(new ArrayList<>()));
        System.out.println("Lista null:  " + UtileriaCadenas.mapaLongitudes(null));

        // ===== 6. Modificador de Inventario =====
        System.out.println("\n=== 6. Modificador de Inventario ===");
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Laptop", 15000.0);
        inventario.put("Mouse", 250.50);
        inventario.put("Teclado", 799.99);
        System.out.println("Catálogo con 10% de descuento:");
        UtileriaNumeros.modificadorInventario(inventario);
        System.out.println("Precio original de Mouse (no se modifica): " + inventario.get("Mouse"));

        System.out.println("Inventario vacío:");
        UtileriaNumeros.modificadorInventario(new HashMap<>());

        HashMap<String, Double> conNulo6 = new HashMap<>();
        conNulo6.put("Cable", null);
        System.out.println("Precio null:");
        UtileriaNumeros.modificadorInventario(conNulo6);

        System.out.println("Mapa null:");
        UtileriaNumeros.modificadorInventario(null);

        // ===== 7. Contador de Frecuencias =====
        System.out.println("\n=== 7. Contador de Frecuencias ===");
        ArrayList<String> palabras7 = new ArrayList<>(
                Arrays.asList("casa", "perro", "casa", "gato", "perro", "casa"));
        System.out.println("Palabras:    " + palabras7);
        System.out.println("Frecuencias: " + UtileriaCadenas.contadorFrecuencias(palabras7));
        System.out.println("Lista vacía: " + UtileriaCadenas.contadorFrecuencias(new ArrayList<>()));
        ArrayList<String> muchas = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            muchas.add(i % 2 == 0 ? "si" : "no");
        }
        System.out.println("1000 palabras (500 'si' y 500 'no'): " + UtileriaCadenas.contadorFrecuencias(muchas));
        System.out.println("Con null ['a', null, 'a']: "
                + UtileriaCadenas.contadorFrecuencias(new ArrayList<>(Arrays.asList("a", null, "a"))));
        System.out.println("Lista null:  " + UtileriaCadenas.contadorFrecuencias(null));

        // ===== 8. Clasificador de Palabras =====
        System.out.println("\n=== 8. Clasificador de Palabras ===");
        HashMap<String, Integer> frecuencias8 = new HashMap<>();
        frecuencias8.put("casa", 5);
        frecuencias8.put("perro", 2);
        frecuencias8.put("gato", 1);
        frecuencias8.put("sol", 3);
        System.out.println("Frecuencias: " + frecuencias8);
        System.out.println("Frecuencia < 3: " + UtileriaCadenas.clasificadorPalabras(frecuencias8, 3));
        System.out.println("Mapa original sin cambios: " + frecuencias8);
        System.out.println("Frecuencia < 1 (nadie cumple): " + UtileriaCadenas.clasificadorPalabras(frecuencias8, 1));
        System.out.println("Frecuencia < 100 (todas cumplen): " + UtileriaCadenas.clasificadorPalabras(frecuencias8, 100));
        System.out.println("Mapa vacío: " + UtileriaCadenas.clasificadorPalabras(new HashMap<>(), 3));
        System.out.println("Mapa null:  " + UtileriaCadenas.clasificadorPalabras(null, 3));

        // ===== 9. Deduplicación de Palabras =====
        System.out.println("\n=== 9. Deduplicación de Palabras ===");
        String frase = "Por Fin pasare POO, QUE ALIVIO!.";
        System.out.println("Frase: \"" + frase + "\"");
        HashSet<String> resultado9 = UtileriaCadenas.deduplicacionPalabras(frase, 4);
        System.out.println("Palabras de 4+ letras, únicas y en minúsculas: " + resultado9);

        String fraseCorta = "a A b B";
        System.out.println("Frase: \"" + fraseCorta + "\"");
        System.out.println("Con n = 1 (no se descarta nada y las repetidas se unen): "
                + UtileriaCadenas.deduplicacionPalabras(fraseCorta, 1));

        System.out.println("n muy grande (50 o sea nada cumple): " + UtileriaCadenas.deduplicacionPalabras(frase, 50));
        System.out.println("Frase vacía:  " + UtileriaCadenas.deduplicacionPalabras("", 3));
        System.out.println("Solo espacios y signos: " + UtileriaCadenas.deduplicacionPalabras("  ...  ", 1));
        System.out.println("Frase null:   " + UtileriaCadenas.deduplicacionPalabras(null, 3));

        // ===== 10. El Tope de Frecuencias =====
        System.out.println("\n=== 10. El Tope de Frecuencias ===");
        HashMap<String, Integer> frecuencias10 = new HashMap<>();
        frecuencias10.put("casa", 10);
        frecuencias10.put("perro", 3);
        frecuencias10.put("gato", 7);
        frecuencias10.put("sol", 5);
        System.out.println("Antes (tope 5): " + frecuencias10);
        UtileriaNumeros.topeFrecuencias(frecuencias10, 5);
        System.out.println("Después:        " + frecuencias10);

        HashMap<String, Integer> vacio10 = new HashMap<>();
        UtileriaNumeros.topeFrecuencias(vacio10, 5);
        System.out.println("Mapa vacío:     " + vacio10);

        HashMap<String, Integer> conNulo10 = new HashMap<>();
        conNulo10.put("x", null);
        conNulo10.put("y", 9);
        UtileriaNumeros.topeFrecuencias(conNulo10, 4);
        System.out.println("Con valor null y 9 (tope asignado 4): " + conNulo10);

        UtileriaNumeros.topeFrecuencias(null, 5);
        System.out.println("Mapa null:      ");
    }
}