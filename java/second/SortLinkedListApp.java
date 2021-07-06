package second;

import courses.second.tda.SortLinkendList;

import java.util.Scanner;

public class SortLinkedListApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        String name;

        SortLinkendList sortLinkendList1 = new SortLinkendList();
        SortLinkendList sortLinkendList2 = new SortLinkendList();

        System.out.println("\n\n\nProcesamiento de una lista de operaciones");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Anular listas" +
                    "\n2). Ingrese un elemento a la lista 1" +
                    "\n3). Ingrese un elemento a la lista 2" +
                    "\n4). Fusionar listas" +
                    "\n5). Contenido de la lista" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    sortLinkendList1.cancel();
                    sortLinkendList2.cancel();
                    break;
                case 2:
                    System.out.print("Ingrese un elemento a la lista: ");
                    name = in.next();
                    sortLinkendList1.push(name);
                    break;
                case 3:
                    System.out.print("Ingrese un elemento a la lista: ");
                    name = in.next();
                    sortLinkendList2.push(name);
                    break;
                case 4:
                    System.out.println("El resultado de fusionar las listas es: ");
                    sortLinkendList1 = sortLinkendList1.merge(sortLinkendList2);
                    sortLinkendList1.show();
                    break;
                case 5:
                    sortLinkendList1.show();
                    sortLinkendList2.show();
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        } while (true);
    }
}
