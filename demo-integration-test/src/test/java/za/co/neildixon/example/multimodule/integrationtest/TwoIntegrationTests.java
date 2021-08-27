package za.co.neildixon.example.multimodule.integrationtest;

import za.co.neildixon.example.multimodule.two.DemoTwoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = DemoTwoApplication.class,
        properties = {"spring.config.name=application-two"})
public class TwoIntegrationTests extends DemoIntegrationTestApplicationTests {
    @Test
    public void two() {
        super.appSpecificPingTest("DemoTwoApplication");
    }
}
