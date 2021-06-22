package second;

import courses.second.imaginary.Polynomial;

import java.util.Scanner;

public class PolynomialApp {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Polynomial polynomial = new Polynomial();
        int option;
        double value;

        System.out.println("\n\n\nProcesamiento de un Polinomio");
        do {
            System.out.print("\nOpciones: " +
                    "\n0). Salir" +
                    "\n1). Borrar el Polinomio" +
                    "\n2). Agregar un estructura al polinomio" +
                    "\n3). Visualizar el polinomio" +
                    "\n4). Calcular el polinomio" +
                    "\nOpcion ==> ");
            option = in.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    polynomial.isNull();
                    break;
                case 2:
                    polynomial.insert();
                    break;
                case 3:
                    polynomial.write();
                    break;
                case 4:
                    System.out.print("Digite el número a reemplazar en el polinomio: ");
                    value = in.nextDouble();
                    Object ans = polynomial.replaceAndOperate(value);
                    if (ans != null) {
                        System.out.println("El valor reemplazando " + value + " es: " + ans);
                    } else {
                        System.out.println("No se puede calcular el polinomio esta vacío");
                    }
                    break;
                default:
                    System.out.println("Esta opción no esta contemplada");
            }
        } while (true);
    }
}
