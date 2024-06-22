package dk.bringlarsen.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate loadbalanced;

    @GetMapping("/hello")
    public String get() {
        return loadbalanced.getForObject("http://awesome-service/hello", String.class);
    }
}
