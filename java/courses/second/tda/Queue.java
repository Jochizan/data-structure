package courses.second.tda;

public class Queue {

    private Node head = null;
    private Node peak = null;

    public void cancel() {
        head = peak = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (peak == null) {
            peak = newNode;
            head = peak;
        } else {
            peak = newNode;
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = peak;
        }
    }

    public void show() {
        Node node = head;

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public int getHead() {
        if (peak != null) {
            return (int) peak.value;
        } else {
            return -1;
        }
    }

    public void remove() {
        if (head != null) {
            head = head.next;
            peak.next = null;
            peak = head;
        } else {
            System.out.println("La pila está vacía");
        }
    }
}
