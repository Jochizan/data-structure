package second;

import courses.second.tda.CircularLinkedList;
import courses.second.tda.DoubleLinkedList;

import java.util.Scanner;

public class CircularLinkedListApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        String name;
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        System.out.println("\n\n\nProcesamiento de una lista circular enlazada");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Anular Lista" +
                    "\n2). Insertar un elemento a la lista" +
                    "\n3). Contenido de la lista" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    circularLinkedList.cancel();
                    break;
                case 2:
                    System.out.print("Ingrese el valor de la lista: ");
                    name = in.next();
                    circularLinkedList.insert(name);
                    break;
                case 3:
                    circularLinkedList.show();
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        } while (true);
    }
}
