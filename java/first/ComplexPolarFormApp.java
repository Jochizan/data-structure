package first;

import courses.first.imaginary.ComplexPolarForm;

import java.util.Scanner;

public class ComplexPolarFormApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Formato de entrada real|espacio|imaginiario");
        System.out.print("Ingrese los valores del primer imaginario: ");
        ComplexPolarForm cPolarForm1 = new ComplexPolarForm(in.nextDouble(), in.nextDouble());
        cPolarForm1.toWriteNormal();
        cPolarForm1.toWritePolar();

        System.out.print("Ingrese los valores del segundo imaginario: ");
        ComplexPolarForm cPolarForm2 = new ComplexPolarForm(in.nextDouble(), in.nextDouble());
        cPolarForm2.toWriteNormal();
        cPolarForm2.toWritePolar();

        System.out.print("La suma de ambos es: \n");
        ComplexPolarForm newCPolar = ComplexPolarForm.sum(cPolarForm1, cPolarForm2);
        newCPolar.toWriteNormal();
        newCPolar.toWritePolar();

        System.out.print("La multiplicación es: \n");
        newCPolar = ComplexPolarForm.multiply(cPolarForm1, cPolarForm2);
        newCPolar.toWriteNormal();
        newCPolar.toWritePolar();

    }
}
