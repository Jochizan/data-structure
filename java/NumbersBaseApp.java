import com.consolidate.first.NumbersBase;

import java.util.Scanner;

public class NumbersBaseApp {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        NumbersBase numbersBase = new NumbersBase("1111110", 2);
        numbersBase.toWrite();
        numbersBase.transformTo10();
        numbersBase.toWrite();
        numbersBase.transformOf10ToAny(16);
        numbersBase.toWrite();
        System.out.println(numbersBase.getNumber());
    }
}
