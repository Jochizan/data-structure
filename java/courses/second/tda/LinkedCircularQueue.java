package courses.second.tda;

public class LinkedCircularQueue {
    SinglyLinkedListNode head;

    public void cancel() {
        head = null;
    }

    public void insert(String tmp) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(tmp);

        if (head == null) {
            head = node;
        } else {
            node.next = head.next;
        }

        head.next = node;
        head = node;
    }

    public void leave() {

        if (head != null) {
            SinglyLinkedListNode node = head;
            long count = 1;
            node = node.next;

            while (node != head) {
                count++;
                node = node.next;
            }

            node = head;

            if (count == 1) {
                cancel();
            } else {
                node.next = node.next.next;
            }
        }
    }

    public void show() {
        SinglyLinkedListNode node;

        System.out.println("Contenido de la lista circular: ");
        node = head;

        if (node != null) {
            while (head != node.next) {
                System.out.print(node.value + " => ");
                node = node.next;
            }
            System.out.println(node.value);
        } else {
            System.out.println("La lista esta vacía");
        }
    }
}
