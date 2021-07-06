package second;

import courses.second.tda.DoubleLinkedList;

import java.util.Scanner;

public class DoubleLinkedListApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        String name, beforeName;
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        System.out.println("\n\n\nProcesamiento de una lista doblemente enlazada");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Anular Lista" +
                    "\n2). Insertar un elemento a la lista" +
                    "\n3). Contenido de la lista: Avance" +
                    "\n4). Contenido de la lista: Retroceso" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    doubleLinkedList.isNull();
                    break;
                case 2:
                    System.out.print("Ingrese el valor de la lista: ");
                    name = in.next();
                    doubleLinkedList.push(name);
                    break;
                case 3:
                    doubleLinkedList.advanced();
                    break;
                case 4:
                    doubleLinkedList.recoil();
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        } while (true);
    }
}
