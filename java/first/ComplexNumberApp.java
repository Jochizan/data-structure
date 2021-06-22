package first;

import courses.first.imaginary.ComplexNumber;

import java.util.Scanner;

public class ComplexNumberApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ComplexNumber cNumber1 = new ComplexNumber();
        ComplexNumber cNumber2 = new ComplexNumber();

        System.out.println("Formato de entrada real|espacio|imaginiario");
        System.out.print("Ingrese los valores del primer imaginario: ");
        cNumber1.toAssign(in.nextFloat(), in.nextFloat());
        cNumber1.toWrite();

        System.out.print("Ingrese los valores del segundo imaginario: ");
        cNumber2.toAssign(in.nextFloat(), in.nextFloat());
        cNumber2.toWrite();

        System.out.println("El valor absoluto de ambos es: " + cNumber1.absolute(cNumber2));

        System.out.print("La suma de ambos es: ");
        (cNumber1.sum(cNumber2)).toWrite();

        System.out.print("La multiplicación es: ");
        (cNumber1.multiply(cNumber2)).toWrite();

        System.out.print("La negación del primero es: ");
        cNumber1.denial();

        System.out.print("La negación del segundo es: ");
        cNumber2.denial();
    }
}
