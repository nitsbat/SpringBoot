package drawing;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Repository
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
