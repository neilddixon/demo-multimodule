package za.co.neildixon.example.multimodule.one.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        properties = {"spring.config.name=application-one"}
)
class DemoOneApplicationTests {

    @Test
    void contextLoads() {
    }

}
