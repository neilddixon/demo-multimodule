package za.co.neildixon.example.multimodule.one.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @Value("${spring.application.name}")
    String appName;

    @Value("${common.name}")
    String commonProperty;

    @GetMapping("/ping")
    public String ping() {
        return String.format("Hello from :%s CommonProperty:%s", appName, commonProperty);
    }
}
