package first;

import courses.first.consolidate.NumbersBase;

import java.util.Scanner;

public class NumbersBaseApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el valor del número en base 2: ");
        NumbersBase numbersBase = new NumbersBase(in.next(), 2);
        numbersBase.toWrite();
        numbersBase.transformTo10();
        numbersBase.toWrite();
        numbersBase.transformOf10ToAny(16);
        numbersBase.toWrite();
    }
}