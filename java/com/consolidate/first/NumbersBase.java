package com.consolidate.first;

public class NumbersBase {
    private String number;
    private int base;

    public NumbersBase(String number, int base) {
        this.number = number;
        this.base = base;
    }

    public String convertToNormal(String number) {
        char[] lt = number.toCharArray();
        String answer = "";
        for (int i = 0; i < lt.length; i++) {
            String add = "(" + (Character.toUpperCase(lt[i]) - '6') + ")";
            answer += lt[i] >= 'a' ? add : lt[i];
        }
        return answer;
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
        this.number = convertToNormal(this.number);
        setBase(base);
    }

    public String getNumber() {
        return number;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
