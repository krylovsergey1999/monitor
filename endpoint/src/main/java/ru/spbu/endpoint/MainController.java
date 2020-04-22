package ru.spbu.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Krylov Sergey
 */
@RestController
public class MainController {
    @GetMapping("/")
    public String main() {
        return "Hello world";
    }
}
