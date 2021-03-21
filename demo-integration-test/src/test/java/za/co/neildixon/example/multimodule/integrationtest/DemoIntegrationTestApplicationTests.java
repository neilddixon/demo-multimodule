package za.co.neildixon.example.multimodule.integrationtest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


abstract class DemoIntegrationTestApplicationTests {

    @LocalServerPort
    int port;

    RestTemplate restTemplate = new RestTemplate();


    @Test
    void contextLoads() {
    }


    public void appSpecificPingTest(String expectedValue) {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:" + port + "/ping", String.class);
        Assertions.assertThat(forEntity.getStatusCodeValue()).isEqualTo(200);
        Assertions.assertThat(forEntity.getBody()).contains(expectedValue);
    }

    @Test
    public void commonTest() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:" + port + "/common", String.class);
        Assertions.assertThat(forEntity.getStatusCodeValue()).isEqualTo(200);
    }

}
