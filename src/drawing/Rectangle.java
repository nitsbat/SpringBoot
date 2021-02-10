package drawing;

public class Rectangle {
    private Point point1;

    public Rectangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void draw() {
        System.out.println("Point A : (x=" + getPoint1().getX() + ",y=" + getPoint1().getY() + ")");
    }
}
