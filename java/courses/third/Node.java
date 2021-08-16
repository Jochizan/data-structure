package courses.third;

public class Node {
    public Object value;
    public Node next;
    public Node prev;

    public Node(Object value) {
        this.value = value;
        this.next = this.prev = null;
    }
}
