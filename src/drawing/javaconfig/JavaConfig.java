package drawing.javaconfig;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"drawing.javaconfig"})
public class JavaConfig {

    @Bean
    public Branch getBranch() {
        return new Branch();
    }

    @Bean
    public String getName() {
        return "Nitin";
    }
}
