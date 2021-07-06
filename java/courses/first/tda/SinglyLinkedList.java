package courses.first.tda;

public class SinglyLinkedList {

    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void isNull() {
        head = null;
    }

    public void init(String nameTmp) {
        head = new Node();
        head.value = nameTmp;
        head.next = null;
    }

    public void shift(String nameTmp) {
        Node tmp = new Node();
        tmp.value = nameTmp;
        tmp.next = head;
        head = tmp;
    }

    public void push(String nameTmp) {
        if (head == null) {
            shift(nameTmp);
            return;
        }

        Node tmp = new Node();
        tmp.value = nameTmp;
        tmp.next = null;

        Node tmpTwo;
        tmpTwo = head;

        while (tmpTwo.next != null)
            tmpTwo = tmpTwo.next;

        tmpTwo.next = tmp;
    }

    public void insert(String nameTmp, String beforeNameTmp) {
        Node tmpTwo;
        Node tmp = new Node();
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
        Node tmpTwo;
        Node tmp = new Node();

        tmpTwo = head;

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


    public void replace(String nameTmp, String replaceTmp) {
        Node tmpTwo = head;

        while (!tmpTwo.value.equals(replaceTmp))
            tmpTwo = tmpTwo.next;

        tmpTwo.value = nameTmp;
    }

    public void replaceAll(String nameTmp, String replaceTmp) {
        Node tmpTwo = head;

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

    public Node find(String nameTmp) {
        Node tmpTwo = head;
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
        Node tmpTwo = head;

        while (tmpTwo.next != null) {
            tmpTwo = tmpTwo.next;
            count++;
        }

        return count + 1;
    }

    public void show() {
        Node p;
        System.out.print("\n\tEL arreglo tiene un tamaño de: " + size());
        System.out.print("\n\tEl contenido de la lista es el siguiente: \n\t");
        p = head;

        while (p != null) {
            System.out.print(p.value + " => ");
            p = p.next;
        }
        System.out.println();
    }
}
