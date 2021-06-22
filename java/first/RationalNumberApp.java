package first;// Clase con atributos
import courses.first.imaginary.Rational;

// Clase con Arrays
//import classes.java.RationalNumber;

public class RationalNumberApp {
    public static void main(String[] args) {
        String[] numbers = {"primer", "segundo", "tercero"};

        Rational[] r = new Rational[3];
        r[0] = new Rational();
        r[1] = new Rational();
        r[2] = new Rational();

        int i = 0;
        for (Rational rational : r) {
            System.out.println("Ingrese el " + numbers[i] + " racional: ");
            rational.read();
            i++;
        }

        i = 0;

        for (Rational rational : r) {
            System.out.print("Contenido del " + numbers[i] + " racional: ");
            System.out.println(rational.toString());
            i++;
        }

        System.out.println("Contenido de la suma es: " + r[2].sum(r[0].sum(r[1])));
        System.out.println("Contenido de la resta es: " + r[0].substraction(r[1].sum(r[2])));
        System.out.println("Contenido de la multiplicación es: " + r[2].multiply(r[0].multiply(r[1])));
        System.out.println("Contenido de la división es: " + (r[0].division(r[1])).division(r[2]));
    }
}
