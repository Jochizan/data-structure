public class Circle {
    public double x, y, r;
    static int numCircles = 0;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        numCircles++;
    }

    public Circle(double r) {
        x = 0.0;
        y = 0.0;
        this.r = r;
        numCircles++;
        //        this (0.0, 0.0, r);
    }

    public Circle(Circle circle) {
        x = circle.x;
        y = circle.y;
        r = circle.r;
        //        this(circle.x, circle.y, circle.r);
    }

    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
        //        this (0.0, 0.0, 1.0);
    }

    public void toWrite() {
        System.out.println("x = " + x + ", y = " + y + ", r = " + r);
    }

    public Circle greaterThanTwo(Circle circle) {
        if (circle.r > r)
            return circle;
        else
            return this;
    }

    public static Circle greaterThanTwo(Circle circle1, Circle circle2) {
        if (circle1.r > circle2.r)
            return circle1;
        else
            return circle2;
    }

    public double circumference() {
        return 2 * Math.PI * r;
    }

    public double surface() {
        return Math.PI * Math.pow(r, 2);
    }

}
