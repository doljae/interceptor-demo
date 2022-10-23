package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ServerResponse test() {
        return new ServerResponse(0, "hello spring");
    }

    @GetMapping("/test2")
    public ServerResponse test2() {
        return new ServerResponse(0, "hello spring");
    }

    @GetMapping("/test3")
    public String test3() {
        return "hello spring";
    }

    @GetMapping("/test4")
    public String test4() {
        return "hello spring";
    }
}
