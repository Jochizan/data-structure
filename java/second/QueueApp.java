package second;

import courses.second.tda.Queue;

import java.util.Scanner;

public class QueueApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option, value;
        Queue queue = new Queue();

        System.out.println("\n\n\nProcesamiento de una cola o queue simple");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Anular" +
                    "\n2). Añadir a la cola" +
                    "\n3). Quitar de la cola" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    queue.cancel();
                    break;
                case 2:
                    System.out.print("Ingrese un elemento: ");
                    value = in.nextInt();
                    queue.add(value);
                    break;
                case 3:
                    queue.remove();
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
            queue.show();
        } while (true);
    }
}
