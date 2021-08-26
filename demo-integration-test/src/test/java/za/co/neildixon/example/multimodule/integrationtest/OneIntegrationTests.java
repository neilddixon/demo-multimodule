package za.co.neildixon.example.multimodule.integrationtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import za.co.neildixon.example.multimodule.one.demo.DemoOneApplication;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = DemoOneApplication.class,
        properties = {"spring.config.name=application-one"})
public class OneIntegrationTests extends DemoIntegrationTestApplicationTests{

    @Test
    public void one(){
        super.appSpecificPingTest("DemoOneApplication");
    }
}
