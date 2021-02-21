package drawing;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Rectangle implements ApplicationContextAware {
    private Point point1;
    private Point point2;

    private ApplicationContext context;

    Rectangle() {
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Rectangle(Point point1) {
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
        System.out.println("Point B : (x=" + point2.getX() + ",y=" + point2.getY() + ")");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
