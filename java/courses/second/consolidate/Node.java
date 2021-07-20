package courses.second.consolidate;

/*
  Importación de las clases de java.util a usar
 */

import java.util.ArrayList;
import java.util.List;

public class Node {
    /**
     * String que define el nombre del Node actual por instancia.
     */
    public String name;

    /**
     * Node que identificar el "Node" padre del Node actual.
     */
    public Node prev;

    /**
     * List<String> en donde se definen los nombres de los Nodes hijos de este.
     */
    public List<String> children;

    /**
     * List<Node> que define las instancias de Node que tiene enlazadas la
     * instancia particular.
     */
    public List<Node> group;

    /**
     * Función constructora que se definen cuando se crea una instancia de Node.
     *
     * - Esta inicializara la List<String> y también la List<Node> para su
     * posterior uso y almacenamiento de más Nodes hijos, con la diferencia
     * del otros que este si identifica al "Node" padre.
     *
     * @param name parámetro que identifica el nombre del Node actual
     * @param prev parámetro que identifica el "Node" padre del Node actual
     */
    public Node(String name, Node prev) {
        this.name = name;
        this.prev = prev;
        this.children = new ArrayList<>();
        this.group = new ArrayList<>();
    }

    /**
     * Función constructora que se definen cuando se crea una instancia de Node.
     * - Esta inicializara la List<String> y también la List<Node> para su
     * posterior uso y almacenamiento de más Nodes hijos.
     *
     * @param name parámetro que identifica el nombre del Node actual
     */
    public Node(String name) {
        this.name = name;
        this.prev = null;
        this.children = new ArrayList<>();
        this.group = new ArrayList<>();
    }
}
