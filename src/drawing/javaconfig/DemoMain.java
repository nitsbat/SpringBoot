package drawing.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class DemoMain {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student student = context.getBean("getStudent", Student.class);

        student.study();

        context.close();
    }
}
