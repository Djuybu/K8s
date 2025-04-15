package org.example.kubernatesspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Định nghĩa endpoint GET /hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
