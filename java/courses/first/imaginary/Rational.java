package courses.first.imaginary;

import java.util.Scanner;

public class Rational {
    private Scanner in = new Scanner(System.in);
    int num, dnum;

    public Rational() {
        num = 0;
        dnum = 0;
    }

    public void read() {
        System.out.print("Numerador: ");
        num = in.nextInt();
        System.out.print("Denominador: ");
        dnum = in.nextInt();
    }

    public String toString() {
        if (num == dnum) {
            return "" + num / dnum;
        } else if (dnum == 1) {
            return "" + num;
        } else {
            return num + "/" + dnum;
        }
    }

    public Rational sum(Rational rational) {
        Rational sum = new Rational();

        sum.num = num * rational.dnum + dnum * rational.num;
        sum.dnum = dnum * rational.dnum;
        sum.simplify();

        return sum;
    }

    public Rational substraction(Rational rational) {
        Rational substraction = new Rational();

        substraction.num = num * rational.dnum - dnum * rational.num;
        substraction.dnum = dnum * rational.dnum;
        substraction.simplify();

        return substraction;
    }

    public Rational multiply(Rational rational) {
        Rational multiply = new Rational();

        multiply.num = num * rational.num;
        multiply.dnum = dnum * rational.dnum;
        multiply.simplify();

        return multiply;
    }

    public Rational division(Rational rational) {
        Rational division = new Rational();

        division.num = num * rational.dnum;
        division.dnum = dnum * rational.num;
        division.simplify();

        return division;
    }

    public void simplify() {
        int n, d, ans;

        n = num;
        d = dnum;

        while (d != 0) {
            ans = n % d;
            n = d;
            d = ans;
        }

        num /= n;
        dnum /= n;
    }
}
