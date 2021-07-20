package courses.second.tda;

import java.util.ArrayList;
import java.util.List;

public class Queue extends Thread {

    private List<Integer> meanAttentionTime = new ArrayList<>();
    private List<Integer> meanWaitTime = new ArrayList<>();
    private Node peak = null;
    private Node head = null;
    private Node down = null;

    public void cancel() {
        head = peak = down = null;
    }

    public void add(String e) {
        Node nuevo = new Node(e);

        if (peak == null) {
            peak = nuevo;
            head = down = nuevo;
        } else {
            down.next = nuevo;
            down = nuevo; //down = down.next;
        }

    }// down de inserta

    public void show() {
        Node p = peak;

        while (p != null) {
            System.out.print(p.value + "-->");
            p = p.next;
        }
        System.out.println("null");
    }

    public void delete() {
        peak = peak.next;
        head = peak;
    }

    public void meanTimes(int size) {
        int meanAttention = 0, meanWait = 0, sizeAttention = meanAttentionTime.size(), sizeWait = meanWaitTime.size();

        for (Integer value : meanAttentionTime) {
            meanAttention += value;
        }

        for (Integer integer : meanWaitTime) {
            meanWait += integer;
        }

        System.out.println("Suma de tiempos de espera: " + meanWait);
        System.out.println("Suma de tiempos de atención: " + meanAttention);
        System.out.println("Tamaño de la cola: " + size);
        System.out.println("Los promedios de tiempos son:" +
                "\nDe espera: " + String.format("%.2f", (double) meanWait / (size - 1)) +
                "\nDe atención: " + String.format("%.2f", (double) meanAttention / sizeAttention)
        );
    }

    @Override
    public void run() {
        int time = (int) (Math.random() * 8 + 2);
        for (int i = 1; i <= time; i++) {
            System.out.println(i + "s...");
            try {
                Queue.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error de ejecución de hilo principal");
            }
        }

        Node p = peak;
        p.attentionTime = time;
        meanAttentionTime.add(p.attentionTime);

        p = p.next;
        while (p != null) {
            p.waitTime += time;
            meanWaitTime.add(time);
            p = p.next;
        }
    }
}
