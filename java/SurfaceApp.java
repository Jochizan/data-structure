import java.util.Scanner;
import java.util.function.BiFunction;

public class SurfaceApp {

  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    int base, height;
    System.out.print("Ingrese la base: ");
    base = in.nextInt();

    System.out.print("Ingrese la altura: ");
    height = in.nextInt();

    // System.out.println("El area es: " + (base * height));
    BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
    System.out.println("El area es: " + multiply.apply(base, height));
  }
}
