import java.util.Scanner;

public class Test_ComplexNumber {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ComplexNumber cNumber1 = new ComplexNumber();
        ComplexNumber cNumber2 = new ComplexNumber();

        float real = in.nextFloat();
        float imaginary = in.nextFloat();

        cNumber1.toAssign(real, imaginary);
        cNumber1.toWrite();

        cNumber2.toAssign(20, 100);
        System.out.println(cNumber2.absolute(cNumber2));
    }
}
