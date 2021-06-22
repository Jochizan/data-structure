package courses.second.tda;

public class CircularLinkedList {
    SinglyLinkedListNode head;

    public void cancel() {
        head = null;
    }

    public void insert(String tmp) {
        SinglyLinkedListNode node = new SinglyLinkedListNode();
        node.value = tmp;

        if (head == null) {
            head = node;
        } else {
            node.next = head.next;
        }

        head.next = node;
        head = node;
    }

    public void show() {
        SinglyLinkedListNode node;

        System.out.println("Contenido de la lista: ");
        node = head;

        if (node != null) {
            while (head != node.next) {
                System.out.print(node.value + " => ");
                node = node.next;
            }
            System.out.println(node.value);
        }
    }
}
