package dk.bringlarsen.eureka;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ResttemplateConfig {

    @LoadBalanced
    @Bean
    public RestTemplate loadbalanced() {
        return new RestTemplate();
    }
}
