package drawing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rectangle {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> value = entry.getValue();
            System.out.println(value.get(0));
        }
    }

    public void draw() {
        System.out.println("Point A : (x=" + getPoint1().getX() + ",y=" + getPoint1().getY() + ")\n"
                + "Point B : (x=" + getPoint2().getX() + ",y=" + getPoint2().getY() + ")\n"
                + "Point C : (x=" + getPoint3().getX() + ",y=" + getPoint3().getY() + ")\n"
                + "Point D : (x=" + getPoint4().getX() + ",y=" + getPoint4().getY() + ")");
    }
}
