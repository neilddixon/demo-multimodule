package za.co.neildixon.example.multimodule.one;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import za.co.neildixon.example.multimodule.common.CommonLib;

@SpringBootApplication(scanBasePackageClasses = {DemoOneApplication.class, CommonLib.class})
@PropertySource("classpath:application-common.properties")
public class DemoOneApplication {
    public static String CONFIG_NAME = "application-one";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", CONFIG_NAME);
        SpringApplication.run(DemoOneApplication.class, args);

        RandomStringUtils.randomAlphabetic(5); //transitive dependency from demo-common-lib
    }

}
