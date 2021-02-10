package drawing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rectangle {
    private Point point1;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }


    public void draw() {
        System.out.println("Point A : (x=" + getPoint1().getX() + ",y=" + getPoint1().getY());
    }
}
