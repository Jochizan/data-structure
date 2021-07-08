package second;

import courses.second.tda.Queue;

import java.util.Scanner;
import java.util.regex.Pattern;

public class QueueApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        String value, regexp = "^([0-9])*$";
        Queue queue1 = new Queue();
        Queue queue2 = new Queue();

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
                    queue1.cancel();
                    queue2.cancel();
                    break;
                case 2:
                    System.out.print("Ingrese un elemento: ");
                    value = in.next();

                    System.out.println(Pattern.matches(regexp, value));

                    if (Pattern.matches(regexp, value))  {
                        queue1.add(value);
                    } else {
                        queue2.add(value);
                    }
                    break;
                case 3:
                    queue1.remove();
                    queue2.remove();
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
            System.out.println("Contenido de la cola con números");
            queue1.show();
            System.out.println("Contenido de la cola con palabras");
            queue2.show();
        } while (true);
    }
}
