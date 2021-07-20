package courses.second.consolidate;

/*
  Importación de las clases de java.util a usar
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class FileTree {
    /**
     * Node principal para la iteración sobre el árbol de Nodes que se
     * generara.
     */
    private Node head;

    /**
     * List<String> en donde se verán todas las rutas creadas del árbol.
     */
    private List<String> allRoutes;

    /**
     * Función constructora en donde se inicializaran los atributos antes
     * mencionados.
     */
    public FileTree() {
        head = new Node("root");
        allRoutes = new ArrayList<>();
    }

    /**
     * Función que anula el árbol para su reinicio
     */
    public void cancel() {
        head = new Node("root");
        allRoutes = new ArrayList<>();
    }

    /**
     * Función que nos muestra todas las rutas creadas
     * y guardadas en nuestro árbol de archivos
     */
    public void show() {
        Collections.sort(allRoutes);
        for (String str : allRoutes) {
            System.out.println(str);
        }
    }

    /**
     * Función que nos muestra todas las rutas creadas
     * algo parecida al del ejemplo que se dio.
     */
    public void showRoutes() {
        Collections.sort(allRoutes);
        int i = 1;
        for (String str : allRoutes) {
            int length = str.length();
            if (length > 1) {
                System.out.print("|");
            }
            while (i < length) {
                System.out.print("-");
                i = i + 2;
            }
            System.out.println(str.charAt(str.length() - 1));
            i = 1;
        }
    }

    /**
     * Mostrar el árbol con el comando "tree" de la consola de Windows
     * Para que quede como el ejemplo especificado en el pdf.
     */
    public void showTree() {
        createFiles();
        deleteFiles();
    }

    /**
     * La función genera un arreglo de String para identificar la ruta
     * a buscar dentro del árbol luego con la función verify evitamos
     * errores de "NullPointerException" y de esa manera poder iterar
     * sobre el árbol y este solo se detendrá cuando estemos a una ruta
     * hasta previa que es lo que debería contener el árbol creado.
     * <p>
     * Cuando "node" tenga la dirección de memoria del "Node" anterior
     * al último de las rutas en "routes" se detendrá a ver si existe
     * la ruta ya dentro de "allRoutes" para así evitar que tengamos
     * duplicados en las rutas definidas dentro del árbol, es entonces
     * que dentro del atributo group, children y en allRoutes.
     * <p>
     * - En allRoutes con el nombre de la ruta ingresada como parámetro
     * - En su atributo children con el ultimo elemento de "routes" arreglo definido antes.
     * - En su atributo group con una nueva instancia de Node con sus respectivos parámetros
     *
     * @param route String que define la ruta a crear en el árbol
     */
    public void add(String route) {
        String[] routes = route.split("/");
        Node node = head;
        int n = routes.length;

        for (int i = 0; i < n - 1; ++i) {
            if (!verify(node, routes[i])) {
                System.out.println("Error ruta no encontrada");
                return;
            } else {
                for (int j = 0; j < node.group.size(); ++j) {
                    if (node.group.get(j).name.equals(routes[i])) {
                        node = node.group.get(j);
                        break;
                    }
                }
            }
        }

        if (!allRoutes.contains(route)) {
            allRoutes.add(route);
            node.children.add(routes[n - 1]);
            node.group.add(new Node(routes[n - 1], node));
        }
    }

    /**
     * La función genera un arreglo de String para identificar las rutas
     * que se buscará para su eliminación en conjunto con una expresión regular
     * que validara la eliminación de alguna ruta dentro del árbol dependiendo
     * de la ingresada como parámetro "route".
     * <p>
     * Si en caso count cambio de valor significa que se eliminaron del List<String>
     * allRoutes alguna ruta que concuerda con la búsqueda de la expresión regular,
     * entonces ya podemos proseguir con la eliminación de la ruta en el árbol a
     * través de iteraciones con bucles "foreach" de esta manera para ahorrar recursos,
     * por último detectamos la ruta con la expresión regular indicada al principio
     * para con el atributo del "Node" padre poder borrar con el método "remove" de
     * las listas de Java.
     *
     * @param route String que identifica la ruta que se quiere eliminar
     */
    public void delete(String route) {
        Node node = head;
        String regexp = "^" + route + ".*$", auxRoute = "";
        String[] routes = route.split("/");
        int count = allRoutes.size();

        allRoutes.removeIf((allRoute) -> Pattern.matches(regexp, allRoute));

        if (count != allRoutes.size()) {
            for (String s : routes) {
                node = findNode(node, s);
                auxRoute += s + "/";

                if (Pattern.matches(regexp, auxRoute)) {
                    System.out.println("Se ha eliminado la ruta ->" + route);
                    node.prev.children.remove(s);
                    node.prev.group.remove(node);
                }
            }
        } else {
            System.out.println("Ruta no encontrada");
        }
    }

    /**
     * La función genera dos arreglos de String para guardar solo los nombres
     * de las rutas, luego la expresión regular que se necesita para hacer
     * la actualización en todas las rutas que lo tengan.
     * <p>
     * Si se verifica con el entero "count" que si existe la ruta, entonces
     * procedemos a buscar en el árbol el "Node" que se necesita actualizar
     * para eso buscamos con el bucle "for" el nombre de "Node" siguiente,
     * así hasta que la expresión regular definida al inicio se cumpla,
     * entonces sabremos que estamos en el "Node" que contiene al "Node" que
     * necesita ser actualizado y por ultimo haciéndolo con los métodos
     * set() que se le pasa el indice en donde se encontró el nombre que
     * se quiere actualizar y con el atributo del hijo node.name = routes2[i + 1]
     * para terminar con la función.
     * <p>
     * En caso "count == 0" se dirá que la ruta no fue encontrada.
     *
     * @param route    String que define la ruta que se quiere actualizar
     * @param newRoute String que define como quiere actualizar la ruta
     */
    public void replace(String route, String newRoute) {
        String[] routes1 = route.split("/");
        String[] routes2 = newRoute.split("/");
        String regexp = "^" + route + ".*$", auxRoute = "";
        Node node = head;
        int count = 0;

        for (int i = 0; i < allRoutes.size(); ++i) {
            if (Pattern.matches(regexp, allRoutes.get(i))) {
                allRoutes.set(i, allRoutes.get(i).replace(route, newRoute));
                count++;
            }
        }

        if (count != 0) {
            for (int i = 0, j; i < routes1.length; ++i) {
                node = findNode(node, routes1[i]);
                auxRoute += routes1[i] + "/";

                if (Pattern.matches(regexp, auxRoute)) {
                    for (j = 0; j < node.prev.children.size(); ++j)
                        if (node.prev.children.get(j).equals(routes1[i]))
                            break;

                    node.prev.children.set(j, routes2[i]);
                    node.name = routes2[i];
                    System.out.println(
                            "Se ha actualizado la ruta -> " +
                                    route +
                                    " a -> " +
                                    newRoute
                    );
                }
            }
        } else {
            System.out.println("Ruta no encontrada");
        }
    }

    /**
     * @param node Node que tiene una List<String> en donde se buscará la ruta.
     * @param find String(ruta) que se buscara en el List<String> que tiene cada Node.
     * @return Devuelve el Node "node" pero con la dirección en memoria del Node Hijo que se busco.
     */
    public Node findNode(Node node, String find) {
        for (int j = 0; j < node.group.size(); ++j) {
            if (node.group.get(j).name.equals(find)) {
                node = node.group.get(j);
                break;
            }
        }
        return node;
    }

    /**
     * @param node "Node" que tiene una List<String> en donde se buscará el segundo parámetro.
     * @param name String(ruta) que se buscara en el List<String> que tiene cada "Node".
     * @return Boolean retornara verdadero si existe el string ingresado en el List<String> del "Node".
     */
    public boolean verify(Node node, String name) {
        return node.children.contains(name);
    }

    /**
     * La función creará un archivo principal llamado "FileTree" en el cual se almacenaran los
     * archivos dados por el usuario. También crearemos una lista de String "route".
     * Mediante la función de mkdir (creación de una sola carpeta) y mkdirs (creación de varias carpetas),
     * las rutas que se encuentran "allRoutes" se crearán como carpetas.
     * Después empieza a ejecutar un proceso "process" en el cual se ejecuta un comando dado mediante "Runtime".
     * Para obtener los resultados del comando, utilizamos el "BufferedReader" para leer el
     * texto de una secuencia de entrada. Despues en la lista llamada "route" se almacenará
     * cada línea del comando obtenido, para después poder editar esos textos, utilizando la función de "replace".
     */
    public void createFiles() {
        Collections.sort(allRoutes);
        List<String> routes = new ArrayList<>();
        String root = "C:\\FileTree";
        File principal = new File(root);
        principal.mkdir();

        for (String str : allRoutes) {
            String crear = "C:\\FileTree\\" + str;
            File c = new File(crear);
            c.mkdirs();
        }

        try {
            Process process = Runtime.getRuntime().exec("cmd /c tree C:\\FileTree");
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String resultOfExecution;
            while ((resultOfExecution = br.readLine()) != null) {
                routes.add(resultOfExecution);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int n = routes.size();
        for (int j = 0; j < n; j++) {
            int position, count = 0;
            position = routes.get(j).indexOf("�");

            while (position != -1) {
                count++;
                position = routes.get(j).indexOf("�", position + 1);
            }

            count -= 3;
            int tmp = 0;

            while (tmp < count) {
                routes.set(j, routes.get(j).replaceFirst("�", "|"));
                tmp++;
            }

            routes.set(j, routes.get(j).replace("�", "-"));
        }

        for (int j = 2; j < n; j++) {
            System.out.println(routes.get(j));
        }
    }

    /**
     * La función borrará las carpetas almacenadas en una ruta específica.
     * Mediante una iteración se entregarán las rutas almacenadas en "allRoutes" a la función
     * de "delete" el cual eliminará las carpetas. Esta iteración se hace de forma inversa,
     * debido a que la función "delete" solo eliminará carpetas que se encuentren vacías.
     * Al final se eliminará también la carpeta principal "FileTree" para que evitar ocasionar
     * problemas al momento de crear otra vez la carpeta.
     */
    public void deleteFiles() {
        File file;
        String route;
        int n = allRoutes.size();

        for (int i = n - 1; i >= 0; i--) {
            route = "C:\\FileTree\\" + allRoutes.get(i);
            file = new File(route);
            file.delete();
        }

        route = "C:\\FileTree";
        file = new File(route);
        file.delete();
    }
}
