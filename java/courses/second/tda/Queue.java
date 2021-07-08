package courses.second.tda;

public class Queue {

    private Node head = null;
    private Node peak = null;

//    public static void showTwo(Queue queue1, Queue queue2) {
//        Node node1 = queue1.head;
//        Node node2 = queue2.head;
//
//        while (node1 != null || node2 != null) {
//            System.out.print(node1 == null ? "" : node1.value + "\t" + node2 == null ? "" : node2.value);
//            if (node1 != null) {
//                node1 = node1.next;
//            }
//            if (node2 != null) {
//                node2 = node2.next;
//            }
//        }
//    }

    public void cancel() {
        head = peak = null;
    }

    public void add(String value) {
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
            System.out.println("La cola está vacía");
        }
    }
}
