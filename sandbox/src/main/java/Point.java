public class Point {


    double x;
    double y;


    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    public double getDistance(Point p)
    {
        double distance = Math.sqrt ((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
        return distance;
    }

    public static void main(String[] args)
    {
        Point p1 = new Point(10, 20);

        Point p2 = new Point(30, 40);



        double distance = p1.getDistance(p2);

        System.out.println("The distance between (" + p1.x + ", " + p1.y + ") and ("
                + p2.x + ", " + p2.y + ") is " + distance + ".");
    }
}