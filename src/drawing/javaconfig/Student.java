package drawing.javaconfig;

import org.springframework.stereotype.Component;

@Component("studentId")
public class Student {

    public void study(){
        System.out.println("Student is Studying");
    }
}
