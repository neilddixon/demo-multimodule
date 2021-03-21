package za.co.neildixon.example.multimodule.one.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages =
        {"za.co.neildixon.example.multimodule.one","za.co.neildixon.example.multimodule.common"})
public class DemoOneApplication {
    public static String CONFIG_NAME = "application-one";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", CONFIG_NAME);
        SpringApplication.run(DemoOneApplication.class, args);
    }

}
