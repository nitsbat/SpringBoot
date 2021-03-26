package drawing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Rectangle implements ApplicationContextAware,Shape {
    private List<Point> points;

    private ApplicationContext context;

    Rectangle() {
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Rectangle(List<Point> point1) {
        this.points = point1;
    }


    public void draw() {
        points.forEach(a -> System.out.println(a.getX() + " , " + a.getY()));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void init() {
        System.out.println("Beans created");
    }

    public void destroy() {
        System.out.println("Beans destroyed");
    }
}
