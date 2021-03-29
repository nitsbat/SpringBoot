package drawing.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "drawing.javaconfig")
public class JavaConfig {

    @Bean
    public Student getStudent() {
        return new Student();
    }
}
