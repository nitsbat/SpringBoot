package drawing;

import java.util.*;

public class Rectangle {

    List<Point> list = new ArrayList<>();

    public List<Point> getList() {
        return list;
    }

    public void setList(List<Point> list) {
        this.list = list;
    }

    public void draw() {
        for (Point point : list) {
            System.out.println("X=" + point.getX() + "  Y=" + point.getY());
        }
    }
}
