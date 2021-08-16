package third;

import courses.third.Ordering;

import java.util.Scanner;

public class OrderingApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Ordering vector = new Ordering();
        int sw, opcion;
        vector.read();
        sw = 1;
        do {
            System.out.println("\n\n\n\nSeleccione el algoritmo de ordenamiento\n");
            System.out.println("0. Salir");
            System.out.println("1. Burbuja de derecha a izquierda");
            System.out.println("2. Burbuja de izquierda a derecha");
            System.out.println("3. Inserción directa (Baraja)");
            System.out.println("4. Selección directa");
            System.out.println("5. Método de shell");
            System.out.println("6. Ordenamiento rápido");
            System.out.println("7. Busqueda Binaria");
            System.out.print("Opción ==> ");
            opcion = in.nextInt();
            if (opcion > 0) {
                System.out.println("Arreglo antes de ordenar");
                vector.show();
            }
            switch (opcion) {
                case 0:
                    sw = 0;
                    break;
                case 1:
                    vector.burbuja_der_izq();
                    break;
                case 2:
                    vector.burbuja_izq_der();
                    break;
                case 3:
                    vector.baraja();
                    break;
                case 4:
                    vector.seleccion_directa();
                    break;
                case 5:
                    vector.shell();
                    break;
                case 6:
                    vector.quicksort(vector.a, 0, vector.n - 1);
                    break;
            }
            if (opcion > 0) {
                System.out.println("Arreglo despues de ordenar");
                vector.show();
            }
        } while (sw == 1);
    }
}