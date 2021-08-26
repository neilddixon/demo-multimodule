package za.co.neildixon.example.multimodule.one.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages =
        {"za.co.neildixon.example.multimodule.one","za.co.neildixon.example.multimodule.common"})
@PropertySource("classpath:application-common.properties")
public class DemoOneApplication {
    public static String CONFIG_NAME = "application-one";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", CONFIG_NAME);
        SpringApplication.run(DemoOneApplication.class, args);
    }

}
