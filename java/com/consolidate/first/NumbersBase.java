package com.consolidate.first;

public class NumbersBase {
    private String number;
    private int base;

    public NumbersBase(String number, int base) {
        this.number = number;
        this.base = base;
    }

    public void toWrite() {
        System.out.println("El número es: " + number + " en la base " + base);
    }

    public void transformTo10() {
        if (this.base >= 10) {
            return;
        }
        this.number = (String.valueOf(Integer.parseInt(this.number, this.base)));
        setBase(10);
    }

    public void transformOf10ToAny(int base) {
        this.number = Integer.toString(Integer.parseInt(this.number), base);
        setBase(base);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
