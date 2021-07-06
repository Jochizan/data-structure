package courses.second.imaginary;

import courses.second.tda.SinglyLinkedListNode;

public class LinkedListOperations {

    private SinglyLinkedListNode head;

    public LinkedListOperations() {
        head = null;
    }

    public void cancel() {
        head = null;
    }

    public void shift(String nameTmp) {
        SinglyLinkedListNode tmp = new SinglyLinkedListNode(nameTmp);
        tmp.next = head;
        head = tmp;
    }

    public void push(String nameTmp) {
        if (head == null) {
            shift(nameTmp);
            return;
        }

        SinglyLinkedListNode tmp = new SinglyLinkedListNode(nameTmp);
        SinglyLinkedListNode tmpTwo = head;

        tmp.next = null;

        while (tmpTwo.next != null)
            tmpTwo = tmpTwo.next;

        tmpTwo.next = tmp;
    }

    public long operation() {
        SinglyLinkedListNode node = head, prev = head, next = head;
        long ans = 0;

        while (node.next != null) {

            if (node.value.equals("*")) {
                if (ans == 0) {
                    ans = (Long.parseLong((String) prev.value) * Long.parseLong((String) next.value));
                } else {
                    ans *= Long.parseLong((String) next.value);
                }
            }

            if (node.value.equals("/")) {
                if (ans == 0) {
                    ans = (Long.parseLong((String) prev.value) / Long.parseLong((String) next.value));
                } else {
                    ans /= Long.parseLong((String) next.value);
                }
            }

            if (node.value.equals("+")) {
                if (ans == 0) {
                    ans = (Long.parseLong((String) prev.value) + Long.parseLong((String) next.value));
                } else {
                    ans += Long.parseLong((String) next.value);
                }
            }

            if (node.value.equals("-")) {
                if (ans == 0) {
                    ans = (Long.parseLong((String) prev.value) - Long.parseLong((String) next.value));
                } else {
                    ans -= Long.parseLong((String) next.value);
                }
            }

//            System.out.println(ans);

            if (node != head) {
                prev = prev.next;
            }

            node = node.next;
            next = node.next;
        }

        return ans;
    }

    public void insert(String name) {
        String[] ans = name.split("");

        for (String an : ans) {
            push(an);
        }

    }

    public void show() {
        SinglyLinkedListNode point;
        System.out.print("\n\tEl contenido de la lista es: \n\t");

        if (head != null) {
            point = head;
        } else {
            return;
        }

        while (point != null) {
            System.out.print(point.value + " ");
            point = point.next;
        }
        System.out.println();
    }
}
