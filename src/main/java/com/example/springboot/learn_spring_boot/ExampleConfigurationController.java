package com.example.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleConfigurationController {

    @Autowired
    private ExampleServiceConfiguration exampleServiceConfiguration;

    @RequestMapping("/example-configuration")
    public ExampleServiceConfiguration retrieveExampleConfiguration() {
        return exampleServiceConfiguration;
    }
}
