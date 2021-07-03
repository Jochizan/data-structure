package courses.second.tda;

public class SinglyLinkedList {

    public SinglyLinkedListNode head;

    public SinglyLinkedList() {
        head = null;
    }

    public void isNull() {
        head = null;
    }

    public void init(String nameTmp) {
        head = new SinglyLinkedListNode();
        head.value = nameTmp;
        head.next = null;
    }

    public void shift(String nameTmp) {
        SinglyLinkedListNode tmp = new SinglyLinkedListNode();
        tmp.value = nameTmp;
        tmp.next = head;
        head = tmp;
    }

    public void push(String nameTmp) {
        if (head == null) {
            shift(nameTmp);
            return;
        }

        SinglyLinkedListNode tmp = new SinglyLinkedListNode();
        tmp.value = nameTmp;
        tmp.next = null;

        SinglyLinkedListNode tmpTwo;
        tmpTwo = head;

        while (tmpTwo.next != null)
            tmpTwo = tmpTwo.next;

        tmpTwo.next = tmp;
    }

    public void insert(String nameTmp, String beforeNameTmp) {
        SinglyLinkedListNode tmpTwo;
        SinglyLinkedListNode tmp = new SinglyLinkedListNode();
        tmp.value = nameTmp;

        tmpTwo = head;

        while (!tmpTwo.value.equals(beforeNameTmp)) {
            tmpTwo = tmpTwo.next;
            assert tmpTwo != null;
            if (tmpTwo.next == null && !tmpTwo.value.equals(beforeNameTmp)) {
                System.out.println("Error el valor " + beforeNameTmp + " no existe en la lista");
                return;
            }
        }

        tmp.next = tmpTwo.next;
        tmpTwo.next = tmp;
    }

    public void delete(String nameTmp) {
        SinglyLinkedListNode tmpTwo = head;
        SinglyLinkedListNode tmp = new SinglyLinkedListNode();

        if (tmpTwo == null) {
            System.out.println("Lista vacia");
        } else {
            if (head.value.equals(nameTmp)) {
                head = head.next;
            } else {
                while (tmpTwo != null && !tmpTwo.value.equals(nameTmp)) {
                    tmp = tmpTwo;
                    tmpTwo = tmpTwo.next;
                }
            }
        }

        if (tmpTwo == null)
            System.out.println("Elemento no encontrado");
        else
            tmp.next = tmpTwo.next;
    }

    public void deleteAll(String nameTmp) {
        SinglyLinkedListNode tmpTwo = head;

        if (tmpTwo == null) {
            System.out.println("Lista vacia");
        } else {
            while (tmpTwo.next != null) {
                if (tmpTwo.next.value.equals(nameTmp)) {
                    tmpTwo.next = tmpTwo.next.next;
                }
                tmpTwo = tmpTwo.next;
            }
        }
    }

    public void replace(String nameTmp, String replaceTmp) {
        SinglyLinkedListNode tmpTwo = head;

        while (!tmpTwo.value.equals(replaceTmp))
            tmpTwo = tmpTwo.next;

        tmpTwo.value = nameTmp;
    }

    public void replaceAll(String nameTmp, String replaceTmp) {
        SinglyLinkedListNode tmpTwo = head;

        while (tmpTwo.next != null) {
            if (tmpTwo.value.equals(replaceTmp)) {
                tmpTwo.value = nameTmp;
            }
            tmpTwo = tmpTwo.next;
        }

        if (tmpTwo.value.equals(replaceTmp)) {
            tmpTwo.value = nameTmp;
        }
    }

    public void insertBefore(String D, String E) {
        SinglyLinkedListNode node = head;

        while (node != null) {
            if (node.next != null) {
                if (node.next.value.equals(D)) {
                    SinglyLinkedListNode nodeTmp = node.next;
                    SinglyLinkedListNode tmp = new SinglyLinkedListNode(E);
                    node.next = tmp;
                    tmp.next = nodeTmp;
                    break;
                }
            } else {
                node.next = new SinglyLinkedListNode(E);
                break;
            }

            node = node.next;
        }
    }

    public SinglyLinkedListNode find(String nameTmp) {
        SinglyLinkedListNode tmpTwo = head;
        int count = 0;

        while (!tmpTwo.value.equals(nameTmp)) {
            if (tmpTwo.next == null)
                return null;

            tmpTwo = tmpTwo.next;
            count++;
        }

        tmpTwo.index = count + 1;

        return tmpTwo;
    }

    public long size() {
        int count = 0;

        if (head == null) {
            return 0;
        }

        SinglyLinkedListNode tmpTwo = head;


        while (tmpTwo.next != null) {
            tmpTwo = tmpTwo.next;
            count++;
        }

        return count + 1;
    }

    public void show() {
        SinglyLinkedListNode point;
        System.out.print("\n\tEl arreglo tiene un tamaño de: " + size());
        System.out.print("\n\tEl contenido de la lista es el siguiente: \n\t");

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
