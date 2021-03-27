package drawing;

import javax.annotation.Resource;

public class Circle implements Shape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointB")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Circle center is : X=" + center.getX() + " , Y=" + center.getY());
    }
}
