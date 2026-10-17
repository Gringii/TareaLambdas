Descripción del proyecto

Proyecto en Java que reúne 10 métodos estáticos para manipular colecciones 
(ArrayList, HashSet y HashMap) usando expresiones lambda y Streams. 
Los métodos están organizados en dos clases que solo contienen métodos estáticos:
UtileriaNumeros (métodos 1, 4, 6 y 10) y UtileriaCadenas (métodos 2, 3, 5, 7, 8 y 9). 
La clase Main demuestra todos los métodos con casos normales y 
casos extremos (listas vacías y valores nulos).

Lista de métodos
multiplicarArrayList: multiplica cada número de un ArrayList de 
enteros por un factor, usando replaceAll() con una lambda. Modifica la lista original.

filtroSelectivo: elimina de un ArrayList de cadenas las que empiecen con 
una letra dada o tengan menos de N caracteres, usando removeIf().

conversorMayusculas: convierte una lista de palabras a mayúsculas con 
Stream y map(), y devuelve una nueva lista.

cuadradosUnicos: devuelve un HashSet con los cuadrados de los números pares 
únicos de una lista, usando filter(), map() y Collectors.toSet().

mapaLongitudes: crea un HashMap con cada palabra y su longitud, usando Collectors.toMap().

modificadorInventario: imprime un catálogo de productos con 10% de descuento 
en cada precio, usando forEach() con una lambda de tipo BiConsumer. No modifica el mapa.

contadorFrecuencias: cuenta cuántas veces aparece cada palabra de una lista, usando merge().

clasificadorPalabras: devuelve en un ArrayList las palabras cuya 
frecuencia es menor a un valor dado, usando entrySet().stream().

deduplicacionPalabras: divide una frase en palabras, descarta las de menos de N letras, 
las pasa a minúsculas y las guarda en un HashSet sin repetidas.

topeFrecuencias: limita todas las frecuencias de un mapa a un máximo de N, usando replaceAll().

Ejemplo de salida
=== 1. El Multiplicador ===
Antes (factor 3):   [1, 2, 3, 4, 5]
Después:            [3, 6, 9, 12, 15]
Factor -2 sobre [2, -4, 0]: [-4, 8, 0]
Factor 0 sobre [7, 8, 9]: [0, 0, 0]
Lista vacía:        []
Lista con null:     [2, null, 6]
Lista null:

=== 9. Deduplicación de Palabras ===
Frase: "Por Fin pasare POO, QUE ALIVIO!."
Palabras de 4+ letras, únicas y en minúsculas: [alivio, pasare]
Frase: "a A b B"
Con n = 1 (no se descarta nada y las repetidas se unen): [a, b]
n muy grande (50 o sea nada cumple): []
Frase vacía:  []
Solo espacios y signos: []
Frase null:   []