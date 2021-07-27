package third;

import java.util.Scanner;
import java.util.function.Function;

public class RecursiveApp {

    static final Function<Long, Long> fac = x -> x != 1
            ? x * RecursiveApp.fac.apply(x - 1) // mientras "x" sea diferente de 1 la función se llamará a sí misma con "apply"
            : x; // si se cumple que "x" es igual 1

    private static final Scanner in = new Scanner(System.in);

    public static long factorial(long n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
            // Esta función recursiva devolverá los siguiente
            // caso n = 9
            // 9 * factorial(9 - 1)
            // 9 * 8 * factorial(8 - 1)
            // 9 * 8 * 7 * factorial(7 - 1)
            // . . . . . . ............
            // . . . . . . ............
            // . . . . . . ............
            // 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * factorial(1)
            // 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
        }
    }

    public static long product(long a, long b) {
        if (b == 1) {
            return a;
        } else {
            return (a + product(a, b - 1));
            // Esta función recursiva devolverá los siguiente
            // caso a = 4, b = 2;
            // 4 + product(4, 2 - 1: 1)
            // b == 1:
            //   4 + 4 = 8
        }
    }

    public static long consecutiveSum(long n) {
        if (n == 1) {
            return n;
        } else {
            return (n + consecutiveSum(n - 1));
            // La recursividad se da al llamarse a sí misma para
            // seguir sumando hasta que encontremos el número 1
            // en el parámetro "n" que recibe esta función
            // caso n = 9:
            // 9 + consecutiveSum(9 - 1)
            // 9 + 8 + consecutiveSum(8 - 1)
            // 9 + 8 + 7 consecutiveSum(7 - 1)
            // 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + consecutiveSum(1)
            // n == 1:
            //   9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 45
        }
    }

    public static void main(String[] args) {

        System.out.println(fac.apply(in.nextLong()));
        System.out.println(factorial(in.nextLong()));
        System.out.println(product(in.nextLong(), in.nextLong()));
        System.out.println(consecutiveSum(in.nextLong()));

    }
}
