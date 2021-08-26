package za.co.neildixon.example.multimodule.two.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages =
        {"za.co.neildixon.example.multimodule.two","za.co.neildixon.example.multimodule.common"})
@PropertySource("classpath:application-common.properties")
public class DemoTwoApplication {
    public static String CONFIG_NAME = "application-two";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", CONFIG_NAME);
        SpringApplication.run(DemoTwoApplication.class, args);
    }

}
