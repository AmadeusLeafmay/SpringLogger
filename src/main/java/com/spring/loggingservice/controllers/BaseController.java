package com.spring.loggingservice.controllers;

import com.spring.loggingservice.model.ColorLogger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BaseController {
    private final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();
    private ColorLogger colorLogger = new ColorLogger();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name){
        colorLogger.logColorInfo("User " + name + " has visited site. Number of visit: " + counter.incrementAndGet());

        return String.format(template, name);
    }

}
