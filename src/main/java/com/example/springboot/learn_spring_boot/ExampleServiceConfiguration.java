package com.example.springboot.learn_spring_boot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix="example-service")
@Component
public class ExampleServiceConfiguration {
    private String url;
    private String username;
    private String key;
}
