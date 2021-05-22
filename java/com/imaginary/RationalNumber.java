package com.imaginary;

import java.util.Scanner;

public class RationalNumber {
    private Scanner in = new Scanner(System.in);
    static int MAX = 2;
    int[] rational = new int[MAX];

    public RationalNumber() {
        rational[0] = 0;
        rational[1] = 1;
    }

    public void read() {
        for (int i = 0; i < MAX; ++i) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            rational[i] = in.nextInt();
        }
    }

    public String toString() {
        if (rational[0] == rational[1]) {
            return "" + rational[0] / rational[1];
        } else if (rational[1] == 1) {
            return "" + rational[0] + "\n";
        } else {
            return rational[0] + "/" + rational[1];
        }
    }

    public RationalNumber sum(RationalNumber rN) {
        RationalNumber sum = new RationalNumber();

        sum.rational[0] = rational[0] * rN.rational[1] + rational[1] * rN.rational[0];
        sum.rational[1] = rational[1] * rN.rational[1];
        sum.simplify();
        return sum;
    }

    public RationalNumber substraction(RationalNumber rN) {
        RationalNumber substraction = new RationalNumber();

        substraction.rational[0] = rational[0] * rN.rational[1] - rational[1] * rN.rational[0];
        substraction.rational[1] = rational[1] * rN.rational[1];
        substraction.simplify();
        return substraction;
    }

    public RationalNumber multiply(RationalNumber rN) {
        RationalNumber multiply = new RationalNumber();

        multiply.rational[0] = rational[0] * rN.rational[0];
        multiply.rational[1] = rational[1] * rN.rational[1];
        multiply.simplify();

        return multiply;
    }

    public RationalNumber division(RationalNumber rN) {
        RationalNumber division = new RationalNumber();

        division.rational[0] = rational[0] * rN.rational[1]; // 2 / 7 // 3 / 7
        division.rational[1] = rational[1] * rN.rational[0];
        division.simplify();

        return division;
    }

    public void simplify() {
        int num, dnum, answer;

        num = rational[0];
        dnum = rational[1];

        while (dnum != 0) {
            answer = num % dnum;
            num = dnum;
            dnum = answer;
        }

        rational[0] /= num;
        rational[1] /= num;
    }
}
