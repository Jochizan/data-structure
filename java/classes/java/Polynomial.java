package classes.java;

import java.lang.Math;

public class Polynomial {
    private long[] index;
    // arreglo -> [0] ^ 0, [1] ^ 1, [2] ^ 2, [3] ^ 3

    public Polynomial(long[] index) {
        this.index = index;
    }

    public void toWrite() {
        for (int i = index.length - 1; i >= 0; --i) {
            if (i == 0) {
                System.out.println(index[i] + "x^" + i);
                continue;
            }
            System.out.print(index[i] + "x^" + i + " + ");
        }
    }

    public long replaceAndOperate(long value) {
        long answer = 0;
        for (int i = index.length - 1; i >= 0; --i) {
            answer += index[i] * Math.pow(value, i);
        }
        return answer;
    }
}
