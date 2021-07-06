package second;

import courses.second.tda.Stack;

import java.util.Scanner;

public class StackApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option, value;
        Stack stack = new Stack();

        System.out.println("\n\n\nProcesamiento de una pila o stack simple");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Anular" +
                    "\n2). Apilar" +
                    "\n3). Desapilar" +
                    "\n4). Eliminar un nodo" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    stack.cancel();
                    break;
                case 2:
                    System.out.print("Ingrese un elemento: ");
                    value = in.nextInt();
                    stack.stack(value);
                    break;
                case 3:
                    stack.unstack();
                    break;
                case 4:
                    System.out.print("Ingrese que elemento quiero eliminar: ");
                    value = in.nextInt();
                    stack.deleteNode(value);
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
            stack.show();
        } while (true);
    }
}
