package courses.second.tda;

public class DoubleLinkedListNode {
    public Object value;
    public DoubleLinkedListNode next, prev;

    public DoubleLinkedListNode(Object element) {
        this(element, null, null);
    }

    public DoubleLinkedListNode(Object element, DoubleLinkedListNode next, DoubleLinkedListNode prev) {
        this.value = element;
        this.next = next;
        this.prev = prev;
    }
}
