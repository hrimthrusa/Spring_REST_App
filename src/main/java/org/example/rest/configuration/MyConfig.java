package org.example.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("org.example.rest")
public class MyConfig {


    @Bean
    public RestTemplate restTemplate() {      // Бин для осуществления http request
        return new RestTemplate();
    }
}
