package courses.second.imaginary;

import java.util.*;

public class Polynomial {
    private final Scanner in = new Scanner(System.in);
    /**
     * a * x ^ b -> polinomio normal
     * Value * x ^ Key -> así hasta que el programa acabe
     * Map<Key, Value>
     */
    private Map<Double, Double> polynomial;

    public Polynomial() {
        polynomial = new LinkedHashMap<>();
    }

    public void write() {
        List<Map.Entry<Double, Double>> list = new ArrayList<>(polynomial.entrySet());
        list.sort(Map.Entry.comparingByKey());
        isNull();

        for (Map.Entry<Double, Double> entry : list) {
            polynomial.put(entry.getKey(), entry.getValue());
        }

        if (polynomial.isEmpty()) {
            System.out.println("El polinomio esta vacío");
        } else {
            polynomial.forEach((exp, value) ->
                    System.out.print(value + "x^" + exp + " + ")
            );
        }
    }

    public void isNull() {
        polynomial = new LinkedHashMap<>();
        System.out.println("Se ha eliminado el polinomio");
    }

    public void insert() {
        System.out.println("Ingrese un valor para el polinomio o actualice: ");
        System.out.print("Ingrese el coeficiente: ");
        Double value = in.nextDouble();
        System.out.print("Ingrese el exponente: ");
        Double exp = in.nextDouble();

        polynomial.put(exp, value);
    }

    public Object replaceAndOperate(double replace) {
        if (polynomial.isEmpty()) {
            return null;
        }

        double[] answer = {0};
        polynomial.forEach((exp, value) ->
                answer[0] += value * Math.pow(replace, exp)
        );
        return answer[0];
    }
}
