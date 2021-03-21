package za.co.neildixon.example.multimodule.two.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(
        properties = {"spring.config.name=application-two"}
)
@ActiveProfiles("it")
class DemoTwoApplicationTests {

    @Value("${spring.application.name}")
    String appName;

    @Test
    void contextLoads() {
        assertThat(appName).isEqualTo("ApplicationTwoIT");
    }

}
