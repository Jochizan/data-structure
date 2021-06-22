package courses.first.tda;

public class Stack {
    private Object[] array;
    private int head;
    private int MAX_ELEMENT = 100;

    public Stack() {
        array = new Object[MAX_ELEMENT];
        head = -1; // pila vacía estado inicial
    }

    public void stack(Object x) {
        if (head + 1 < MAX_ELEMENT) { // Si esta llena se produce OVERFLOW
            head++;
            array[head] = x;
        }
    }

    public Object unstack() {
        if (!isEmpty()) { // Si esta vacía se produce un UNDERFLOW
            Object x = array[head];
            head--;
            return x;
        } else {
            return "La cola esta vacía";
        }
    }

    public Object head() {
        if (!isEmpty()) { // Si esta vacía es un error
            Object x = array[head];
            return x;
        } else {
            return "La cola esta vacía";
        }
    }

    public void toWrite() {
        if (isEmpty()) {
            System.out.println("La cola esta vacía");
        } else {
            int i = 0;
            while (i < array.length && array[i] != null) {
                Object x = array[i];
                System.out.print(x + "->");
                i++;
            }
            System.out.print("NULL");
        }
    }

    public boolean isEmpty() {
        if (head == -1) {
            return true;
        } else {
            return false;
        }
    }
}
