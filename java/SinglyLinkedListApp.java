import com.tda.Node;
import com.tda.SinglyLinkedList;
//import com.tda.SinglyLinkedListNode;

import java.util.Scanner;
//import java.io.*;

//public class SinglyLinkedListApp {
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
//        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
//
//        if (head == null) {
//            head = newHead;
//        } else {
//            SinglyLinkedListNode node = head;
//            while (node.next != null) {
//                node = node.next;
//            }
//            node.next = newHead;
//        }
//        return head;
//    }
//
//    public static void main(String[] args) throws IOException {
//        SinglyLinkedList llist = new SinglyLinkedList();
//
//        int llistCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < llistCount; i++) {
//            int llistItem = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
//
//            llist.head = llist_head;
//        }
//
//        SinglyLinkedListNode.printSinglyLinkedList(llist.head, " -> ");
//        scanner.close();
//    }
//}


public class SinglyLinkedListApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        String name, beforeName;
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        System.out.println("\n\n\nProcesamiento de una lista simple enlazada");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Anular Lista" +
                    "\n2). Suprime el elemento para un valor dado" +
                    "\n3). Insertar el primer nodo de la lista" +
                    "\n4). Insertar nodo en la primera posición" +
                    "\n5). Insertar nodo después del último nodo" +
                    "\n6). Insertar nodo entre dos nodos" +
                    "\n7). Buscar un nodo en la lista" +
                    "\n8). Reemplazar valores de la lista" +
//                    "\n9). Mostrar lista..." +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    singlyLinkedList.isNull();
                    break;
                case 2:
                    System.out.print("Digite valor a suprimir ==> ");
                    name = in.next();
                    singlyLinkedList.delete(name);
                    break;
                case 3:
                    System.out.print("Digite valor a insertar como primer nodo de la lista ==> ");
                    name = in.next();
                    singlyLinkedList.init(name);
                    break;
                case 4:
                    System.out.print("Digite valor a insertar en la primera posición de la lista ==> ");
                    name = in.next();
                    singlyLinkedList.shift(name);
                    break;
                case 5:
                    System.out.print("Digite valor a insertar después del último nodo de la lista ==> ");
                    name = in.next();
                    singlyLinkedList.push(name);
                    break;
                case 6:
                    System.out.print("Digite valor a insertar entre dos nodos de la lista ==> ");
                    name = in.next();
                    System.out.print("Digite el valor del nodo después del que se insertara el valor ==> ");
                    beforeName = in.next();
                    singlyLinkedList.insert(name, beforeName);
                    break;
                case 7:
                    System.out.print("Ingrese el valor que quiere buscar ==> ");
                    name = in.next();
                    Node search = singlyLinkedList.find(name);
                    if (search != null) {
                        System.out.println("El valor  " + search.value + " esta en la posición: " + search.index + " de la lista");
                    } else {
                        System.out.println("El valor " + name + " no existe en la lista");
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el valor para el remplazo: ");
                    name = in.next();
                    System.out.print("Ingrese el valor que quiere remplazar: ");
                    beforeName = in.next();
                    System.out.print("\nOpciones: " +
                            "\n1). Remplazar la primera busqueda: " +
                            "\n2). Remplazar todas las busquedas: " +
                            "\nIngrese su opción: "
                    );
                    option = in.nextInt();
                    if (option == 1) {
                        singlyLinkedList.replace(name, beforeName);
                    } else {
                        singlyLinkedList.replaceAll(name, beforeName);
                    }
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
            singlyLinkedList.show();
        } while (true);
    }
}