package courses.second.tda;

public class DoubleLinkedList {
    public DoubleLinkedListNode head, tail;

    public DoubleLinkedList() {
        head = tail = null;
    }

    public void isNull() {
        head = null;
        tail = null;
    }

    public void push(String nameTmp) {
        if (isEmpty()) {
            head = tail = new DoubleLinkedListNode(nameTmp);
        } else {
            tail = new DoubleLinkedListNode(nameTmp, null, tail);
            tail.prev.next = tail;
        }
    }

    public void advanced() {
        DoubleLinkedListNode point;
        System.out.print("\n\tEl contenido de la lista es el siguiente: \n\t");

        if (head != null) {
            point = head;
        } else {
            return;
        }

        while (point != null) {
            System.out.print(point.value + " <=> ");
            point = point.next;
        }
        System.out.println();
    }

    public void recoil() {
        DoubleLinkedListNode point;
        System.out.print("\n\tEl contenido de la lista es el siguiente: \n\t");

        if (tail != null) {
            point = tail;
        } else {
            return;
        }

        while (point != null) {
            System.out.print(point.value + " <=> ");
            point = point.prev;
        }
        System.out.println();

    }

    public boolean isEmpty() {
        return head == null;
    }
}
