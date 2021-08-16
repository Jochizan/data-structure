package courses.third;

import java.util.Scanner;

public class OneDimensionalArray {
    private final Scanner in = new Scanner(System.in);
    public int[] a;
    public int n;

    public void read() {
        System.out.print("Ingrese el valor n: ");
        n = in.nextInt();
        a = new int[n];

        int record = n, i = 0;

        while (record-- > 0) {
            System.out.print("Ingrese la posición " + (i + 1) + " del array: ");
            a[i] = in.nextInt();
            i++;
        }
    }

    public void show() {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
}
