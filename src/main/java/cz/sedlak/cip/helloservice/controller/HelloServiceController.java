package cz.sedlak.cip.helloservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
