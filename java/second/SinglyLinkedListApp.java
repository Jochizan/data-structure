package second;//import com.tda.Node;

import courses.second.tda.*;

import java.util.Scanner;

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

                    System.out.print("\nOpciones: " +
                            "\n1). Borrar la primera busqueda: " +
                            "\n2). Borrar todas las busquedas: " +
                            "\nIngrese su opción: "
                    );
                    option = in.nextInt();
                    if (option == 1) {
                        singlyLinkedList.delete(name);
                    } else {
                        singlyLinkedList.deleteAll(name);
                    }
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
                    SinglyLinkedListNode search = singlyLinkedList.find(name);
                    if (search != null) {
                        System.out.println("El valor  " + search.value + " esta en la posición " + search.index + " de la lista");
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