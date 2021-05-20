package classes.java;

import java.io.*;

public class Quebrado {
    int numerador;
    int denominador;

    public void read() {
        try {
            // Definir un flujo de caracteres de entrada
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);

            System.out.print("Introduzca el numerador: ");
            String sData = flujoE.readLine();

            numerador = Integer.parseInt(sData);

            System.out.print("Introduzca el denominador: ");
            sData = flujoE.readLine();

            denominador = Integer.parseInt(sData);


        } catch (IOException ignore) {}
    }

    public void toWrite() {
        System.out.print("El quebrado es: ");
        if (denominador != 1)
            System.out.print(numerador + "/" + denominador + "\n");
        else
            System.out.print(numerador + "\n");
    }

    public Quebrado sum(Quebrado r1, Quebrado r2) {
        Quebrado quebrado = new Quebrado();

        quebrado.numerador = r1.numerador * r2.denominador + r1.denominador * r2.numerador;
        quebrado.denominador = r1.denominador * r2.denominador;
        return quebrado;
    }

    public Quebrado simplify(Quebrado r) {
        int i = 2;
        while (i <= r.numerador && i <= r.denominador) {
            while (r.numerador % i == 0 && r.denominador % i == 0) {
                r.numerador = r.numerador / i;
                r.denominador = r.denominador / i;
            }
            ++i;
        }
        return r;
    }
}
