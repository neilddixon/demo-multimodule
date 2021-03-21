package za.co.neildixon.example.multimodule.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/common")
    public String common() {
        return "Hello from common";
    }
}
