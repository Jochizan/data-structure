package second;

import courses.second.imaginary.LinkedListOperations;

import java.util.Scanner;

public class LinkedListOperationsApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        String name;
        LinkedListOperations linkedListOperations = new LinkedListOperations();

        System.out.println("\n\n\nProcesamiento de una lista de operaciones");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Anular Lista" +
                    "\n2). Ingrese un elemento" +
                    "\n3). Ingrese una expresión" +
                    "\n4). Sacar el resultado" +
                    "\n5). Contenido de la lista" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    linkedListOperations.cancel();
                    break;
                case 2:
                    System.out.print("Ingrese una parte de las operaciones: ");
                    name = in.next();
                    linkedListOperations.push(name);
                    break;
                case 3:
                    System.out.print("Ingrese una expresión: ");
                    name = in.next();
                    linkedListOperations.insert(name);
                    break;
                case 4:
                    System.out.print("El resultado de operar es: ");
                    long answer = linkedListOperations.operation();
                    System.out.print(answer);
                    break;
                case 5:
                    linkedListOperations.show();
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        } while (true);
    }
}
