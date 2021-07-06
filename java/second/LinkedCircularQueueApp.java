package second;

import courses.second.tda.LinkedCircularQueue;

import java.util.Scanner;

public class LinkedCircularQueueApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        String name;
        LinkedCircularQueue linkedCircularQueue = new LinkedCircularQueue();

        System.out.println("\n\n\nProcesamiento de una lista circular con salida Queue");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Anular Queue" +
                    "\n2). Ingresar un elemento" +
                    "\n3). Eliminar un elemento" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    linkedCircularQueue.cancel();
                    break;
                case 2:
                    System.out.print("Ingrese un elemento: ");
                    name = in.next();
                    linkedCircularQueue.insert(name);
                    break;
                case 3:
                    linkedCircularQueue.leave();
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
            linkedCircularQueue.show();
        } while (true);
    }
}
