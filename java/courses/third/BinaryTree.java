package courses.third;

public abstract class BinaryTree {

    public static final int CORRECT = 0;
    public static final int NO_DATA = 100;
    public static final int EXIST = 101;
    public static final int NO_EXIST = 101;
    protected Node tail = null;

    public void preOrder(Node node, boolean ok) {
        Node current;

        if (ok) {
            current = tail;
        } else {
            current = node;
        }

        if (current != null) {
            processing(current.value);
            preOrder(current.prev, false);
            preOrder(current.next, false);
        }
    }

    public void inOrder(Node node, boolean ok) {
        Node current;

        if (ok) {
            current = tail;
        } else {
            current = node;
        }

        if (current != null) {
            inOrder(current.prev, false);
            processing(current.value);
            inOrder(current.next, false);
        }
    }

    public void postOrder(Node node, boolean ok) {
        Node current;

        if (ok) {
            current = tail;
        } else {
            current = node;
        }

        if (current != null) {
            postOrder(current.prev, false);
            postOrder(current.next, false);
            processing(current.value);
        }
    }

    public Object search(Object obj) {

        Node current = tail;
        int count;

        while (current != null) {
            if ((count = compare(obj, current.value)) == 0) {
                return current.value;
            } else if (count < 0) {
                current = current.prev;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    public int insert(Object obj) {
        Node last = null, current = tail;
        int count = 0;

        if (obj == null) return NO_DATA;

        while (current != null) {
            if ((count = compare(obj, current.value)) == 0) {
                break;
            } else {
                last = current;
                if (count < 0) {
                    current = current.prev;
                } else {
                    current = current.next;
                }
            }
        }

        if (current == null) {
            Node newNode = new Node(obj);

            if (last == null) {
                tail = newNode;
            } else if (count < 0) {
                last.prev = newNode;
            } else {
                last.next = newNode;
            }
            return CORRECT;
        } else {
            return EXIST;
        }
    }

    public Object delete(Object obj) {
        Node last = null, current = tail;
        Node marked = null, successor = null;
        int before = 0, count = 0;

        if (obj == null) return null;

        while (current != null) {
            before = count;
            if ((count = compare(obj, current.value)) == 0) {
                break;
            } else {
                last = current;

                if (count < 0) {
                    current = current.prev;
                } else {
                    current = current.next;
                }
            }
        }

        if (current != null) {
            marked = current;

            if ((current.prev == null) && (current.next == null)) {
                successor = null;
            } else if (current.prev == null) {
                successor = current.next;
            } else if (current.next == null) {
                successor = current.prev;
            } else {

                successor = current = current.next;

                while (current.prev != null) {
                    current = current.prev;
                }
                current.prev = marked.prev;
            }

            if (last != null) {
                if (before < 0) {
                    last.prev = successor;
                } else {
                    last.next = successor;
                }
            } else {
                tail = successor;
            }

            return marked.value;
        } else {
            return null;
        }
    }

    public abstract void processing(Object value);

    public abstract int compare(Object a, Object b);

    public abstract void visitInorder();

    public abstract void visitPostorder();

    public abstract void visitPreorder();
}
