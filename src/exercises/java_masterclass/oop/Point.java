package exercises.java_masterclass.oop;

public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((this.x - 0.0) * (this.x - 0.0) + (this.y - 0.0) * (this.y - 0.0));
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - (double) x) * (this.x - (double) x) + (this.y - (double) y) * (this.y - (double) y));
    }

    public double distance(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
}

class PointTest {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}