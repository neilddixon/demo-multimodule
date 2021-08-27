package za.co.neildixon.example.multimodule.common.controller;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/common")
    public String common() {
        String random = RandomStringUtils.randomAlphabetic(10);
        return "Hello from common. Random: " + random;
    }
}
