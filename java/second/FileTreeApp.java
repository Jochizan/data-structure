package second;

import courses.second.consolidate.FileTree;

import java.util.Scanner;

public class FileTreeApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        String name;
        FileTree fileTree = new FileTree();

        System.out.println("\n\n\nProcesamiento de una árbol de carpetas");
        do {
            System.out.print(
                    "\nOpciones:" +
                    "\n0). Salir" +
                    "\n1). Anular" +
                    "\n2). Insertar una ruta" +
                    "\n3). Borrar una ruta" +
                    "\n4). Actualizar una ruta" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    fileTree.cancel();
                    break;
                case 2:
                    System.out.print("Ingrese una ruta a crear: ");
                    name = in.next();
                    fileTree.add(name);
                    break;
                case 3:
                    System.out.print("Ingrese una ruta a eliminar: ");
                    name = in.next();
                    fileTree.delete(name);
                    break;
                case 4:
                    System.out.print("Ingrese la ruta a actualizar: ");
                    name = in.next();
                    System.out.print("Ingrese la ruta actualizada: ");
                    fileTree.replace(name, in.next());
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }

            System.out.println("Impresión normal");
            fileTree.show();

            System.out.println("\nImpresión en forma de 'Árbol de Carpetas':");
            fileTree.showTree();
        } while (true);
    }
}