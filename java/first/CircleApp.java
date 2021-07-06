package first;

import courses.first.common.Circle;

import java.util.Scanner;

public class CircleApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String[] numbers = {"primer", "segundo", "tercero", "cuarto"};
//
//        Circle[] circles = new Circle[4];
//        circles[0] = new Circle(50);
//        circles[1] = new Circle(100);
//        circles[2] = circles[0].greaterThanTwo(circles[1]);
//        circles[3] = Circle.greaterThanTwo(circles[0], circles[1]);
//
//        int i = 0;
//        for (Circle circle : circles) {
//            System.out.println(numbers[i] + " circulo: ");
//            circle.toWrite();
//            ++i;
//        }

        Circle[] circles = new Circle[3];

        int i = 0;
        for (Circle circle : circles) {
            System.out.print("Ingrese el radio del " + numbers[i] + " circulo: ");
            circle = new Circle(in.nextDouble());
            System.out.println("La circunferencia del circulo es: " + circle.circumference());
            System.out.println("La superficie del circulo es: " + circle.surface());
            i++;
        }
        System.out.println("La cantidad de circulos creados es: " + Circle.numCircles);
    }
}
