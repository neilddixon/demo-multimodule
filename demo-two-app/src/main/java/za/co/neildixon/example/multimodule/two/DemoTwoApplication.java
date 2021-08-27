package za.co.neildixon.example.multimodule.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import za.co.neildixon.example.multimodule.common.CommonLib;

@SpringBootApplication(scanBasePackageClasses = {DemoTwoApplication.class, CommonLib.class})
@PropertySource("classpath:application-common.properties")
public class DemoTwoApplication {
    public static String CONFIG_NAME = "application-two";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", CONFIG_NAME);
        SpringApplication.run(DemoTwoApplication.class, args);
    }

}
