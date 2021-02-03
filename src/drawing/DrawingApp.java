package drawing;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
//        BeanFactory beanFactory = new XmlBeanFactory("spring.xml");
    }
}
