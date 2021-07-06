package courses.second.tda;

public class SortLinkendList {
    SinglyLinkedListNode head;

    public SortLinkendList() {
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

    public SortLinkendList merge(SortLinkendList sll) {

        SortLinkendList snew = new SortLinkendList();
        SinglyLinkedListNode node = head, tmp = sll.head;

        while (node.next != null || tmp.next != null) {
            if (Long.parseLong((String) tmp.value) <= Long.parseLong((String) node.value)) {
                snew.push((String) tmp.value);
                tmp = tmp.next;
            } else {
                snew.push((String) node.value);
                node = node.next;
            }

            if (node.next == null && tmp.next == null) {
                if (Long.parseLong((String) tmp.value) <= Long.parseLong((String) node.value)) {
                    snew.push((String) tmp.value);
                    snew.push((String) node.value);
                } else {
                    snew.push((String) node.value);
                    snew.push((String) tmp.value);
                }
            }
        }


        return snew;
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
            System.out.print(point.value + " => ");
            point = point.next;
        }

        System.out.println();
    }
}
