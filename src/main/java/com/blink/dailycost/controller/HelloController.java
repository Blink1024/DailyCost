package com.blink.dailycost.controller;

import com.blink.dailycost.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("v1/greeting")
    public Greeting sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hello,%s", name));
    }
}
