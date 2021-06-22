package first;

import courses.first.common.Rectangle;

public class RectangleApp {
  public static void main(String[] args) {

    Rectangle rect1 = new Rectangle(10, 20, 40, 80);
    Rectangle rect2 = new Rectangle(40, 80);
    Rectangle rect3 = new Rectangle();

    int superficieRect1 = rect1.surface();
    System.out.println("El área del rectangulo es: " + superficieRect1);

    rect2.displace(10, 20);
    System.out.println("Las nuevas coordenadas del rectangulo 2 es: ");
    System.out.print("x= " + rect2.x + "     y=" + rect2.y);

    if (rect1.indoors(20, 30)) {
      System.out.println("El punto esta dentro del rectangulo");
    } else {
      System.out.println("El punto esta  fuera del rectangulo");
    }
  }
}
