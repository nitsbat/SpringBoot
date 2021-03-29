package drawing.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Branch getBranch() {
        return new Branch();
    }

    @Bean(name = "studentBean")
    public Student getStudent() {
        return new Student(getBranch());
    }
}
