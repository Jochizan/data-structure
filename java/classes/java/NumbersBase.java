package classes.java;

public class NumbersBase {
    private int number;
    private int base;

    public NumbersBase(int number, int base) {
        this.number = number;
        this.base = base;
    }

    public void toWrite() {
        System.out.println("El número la base " + base + " es: " + number);
    }

    public void transformTo10() {
        this.number = Integer.parseInt(String.valueOf(this.number), this.base);
    }

    public void transformOf10ToAny(int base) {
        this.number = Integer.parseInt(String.valueOf(this.number), base);
    }
}
