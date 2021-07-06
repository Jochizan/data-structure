package first;

import courses.first.imaginary.Point;

public class PointApp {

    public static void main(String[] args) {
        Point point = new Point();
        point.setX(66);
        point.setY(4);
        point.setZ(8);
        point.setDimension("3D");
        System.out.println("Dimensión: " + point.getDimension());
        System.out.println("Coordenada X: " + point.getX());
        System.out.println("Coordenada Y: " + point.getY());
        System.out.println("Coordenada Z: " + point.getZ());
    }
}
