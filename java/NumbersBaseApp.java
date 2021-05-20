import classes.java.NumbersBase;

public class NumbersBaseApp {
    public static void main(String[] args) {
        NumbersBase numbersBase = new NumbersBase(11, 2);
        numbersBase.transformTo10();
        numbersBase.transformToAny();
    }
}
