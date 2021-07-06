package courses.second.tda;


import java.util.ArrayList;
import java.util.List;

public class Stack {

    private Node head = null;
    private Node peak = null;

    public void cancel() {
        head = peak = null;
    }

    public void stack(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            peak = head;
        } else {
            head = newNode;
            newNode.next = peak;
            peak = newNode;
        }
    }

    public void show() {
        Node node = head;

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public int getPeak() {
        if (head != null) {
            return (int) head.value;
        } else {
            return -1;
        }
    }

    public void unstack() {
        if (peak != null) {
            head = head.next;
            peak.next = null;
            peak = head;
        } else {
            System.out.println("La pila está vacía");
        }
    }

    public void deleteNode(int value) {
        List<Integer> arr = new ArrayList<>();

        while (true) {
            if (getPeak() == -1) {
                System.out.println("No existe ese elemento");
                break;
            }

            System.out.println(getPeak());

            if (getPeak() == value) {
                unstack();
                break;
            } else {
                arr.add(getPeak());
                unstack();
            }
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            stack(arr.get(i));
        }
    }
}
