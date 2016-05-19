#Array
Una de las desventajas es que no son muy amigables, por ejemplo para agregar un elemento tendríamos que implementar nuestro propio método.


#ArrayList

* Son solo del mismo tipo, Ejemplo: [String, String, String]
* En cuestión de performance los ArrayList son buenos en términos de búsqueda de un elemento ya que es O(1), eso quiere decir que no recorre toda la lista para poder encontrar un elemento, si no que va a la posición especifica y nos desenvuelve el elemento que estamos buscando.

#LinkedList

* En un LinkedList todos los elementos están encadenados, es decir cada elemento es considerado como un nodo, y cada nodo apunta hacia un el siguiente elemento y hacia el interior.
* Los linkedList son mas rápidos en cuestión de inserción y eliminación de elementos, ya que solo tienen que romper la cadena y apuntar al siguiente elemento en el caso de agregar, o dejar de apuntar a un elemento en el caso de eliminar.


#HashSet

* Esta basado en HashMap
* Los elementos son únicos, cuando ingresas un elemento dentro de un HashSet este no ingresa si ya existe dentro de la colección.


#TreeSet

* Esta basado en TreeMap
* El tiempo para esta estructura es de log(n)
* No se permiten duplicados
* Para poder ingresar objetos custom dentro de un TreeSet es necesario implementar el método compareTo() dentro de la clase del Objeto, en el cual regresas 1 = Mayor que, -1 = Menor que, 0 = Igual a.
* Todos los elementos tienen que ser del mismo tipo.
* Se acepta null solo una vez

#Constructores de TreeSet

1.- TreeSet t = new TreeSet();
Crea un TreeSet Object con DNSO (Default Natural Sorter Order), por ejemplo: si es un numero DNSO seria ordenarlos numéricamente, si es un String, DNSO los ordena alfabeticamente.

2.- TreeSet t = new TreeSet(Comparator c);
Crea un TreeSet ordenado por el Comparator implementado.



#EnumSet
* Son utilizados para guardar objetos Enum.

