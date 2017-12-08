import java.lang.Math;

public class Point {

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);
        System.out.println("Distance = " + p1.distanceTo(p2));
    }

    private double x;
    private double y;


    public Point(double xPosition, double yPosition) {
        x = xPosition;
        y = yPosition;
    }


    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }
}