package drawing;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        /*
        For drawing a triangle we can instantiate triangle object like new Triangle() and then draw it.
        so to replace this 'new Triangle()', we can use bean from the spring bean factory
        there are many beans factory, but here we used the xml one which accepts the XML file consist of
        all available beans.
        */
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        /*
            In sring.xml when we define a bean we definitely give an id corresponding to a class.
            the id can be said as a key or reference to the corresponding class value.
            class is mandatory to give to tell the bean factory that while calling this id , this class
            instance should be created.
         */
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();

        /*
            So Why use this much code for such a small instantiation. Its because in large projects,
            the class can be very much complex and the object made will be also complex with lot of parameters
            in the class and all, so instead of instantiate that complex object at every place we can use
            the factory everywhere.
         */
    }
}
