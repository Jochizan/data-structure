import com.imaginary.Polynomial;

import java.util.Scanner;

public class PolynomialApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese el máximo coeficiente del polinomio: ");
        int MAX = in.nextInt();

        long[] index = new long[MAX];

        for(int i = index.length - 1; i >= 0; --i) {
            System.out.print("Ingrese el indice " + i + " de el polinomio: ");
            index[i] = in.nextLong();
        }

        Polynomial polynomial = new Polynomial(index);
        polynomial.toWrite();

        System.out.print("Ingrese el valor para reemplazar en el polinomio: ");
        long value = in.nextInt();

        System.out.println("El valor númerico con " + value + " es: " + polynomial.replaceAndOperate(value));
    }
}
