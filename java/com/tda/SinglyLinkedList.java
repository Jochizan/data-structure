package com.tda;

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

    public void show() {
        Node p;
        System.out.print("\n\tEl contenido de la lista es el siguiente: \n\t");
        p = head;

        while (p != null) {
            System.out.print(p.value + " => ");
            p = p.next;
        }
        System.out.println();
    }
}
