package drawing.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

    public static void main(String[] args) {

        AbstractApplicationContext context = new
                ClassPathXmlApplicationContext("drawing/javaconfig/springAlternate.xml");

        Student student = context.getBean("studentId", Student.class);

        System.out.println(student);

        context.close();
    }
}
