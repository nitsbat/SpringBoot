package drawing;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void init(){
        System.out.println(" Initialising bean ");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(" Destroying bean ");
    }
}
