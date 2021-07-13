package second;

import courses.second.tda.Queue;

import java.util.Scanner;

public class QueueAppC1 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String name;
        int quantity;
        Queue queue = new Queue();

        System.out.println("Simulación de tiempos de espera y atención con una cola");
        System.out.print("Ingrese la cantidad de personas de la cola: ");
        quantity = in.nextInt();


        for (int i = 0; i < quantity; i++) {
            System.out.print("Ingrese elemento: ");
            name = in.next();
            queue.add(name);
        }

        try {
            queue.join();
        } catch (InterruptedException e) {
            System.out.println("Error de hilo: " + e);
        }
        queue.show();

        for (int i = 0; i < quantity; ++i) {
            queue.run();
            queue.delete();
            if (i != quantity - 1) {
                queue.show();
            }
        }

        queue.meanTimes(quantity);
    }
}
