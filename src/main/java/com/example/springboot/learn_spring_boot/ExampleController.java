package com.example.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ExampleController {

    @RequestMapping("/example")
    public List<Example> retrieveAllExamples() {
        return Arrays.asList(
                new Example(1),
                new Example(2),
                new Example(3)
        );
    }
}
