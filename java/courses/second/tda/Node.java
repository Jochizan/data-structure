package courses.second.tda;

public class Node {
    public Object value;
    public Node next;
    public int attentionTime = 0;
    public int waitTime = 0;

    public Node (Object value) {
        this.value = value;
        this.next = null;
    }
}
