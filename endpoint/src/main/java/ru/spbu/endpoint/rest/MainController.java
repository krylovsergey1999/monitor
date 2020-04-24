package ru.spbu.endpoint.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.spbu.system.annotation.Profiled;
import ru.spbu.system.service.MyService;

/**
 * @author Krylov Sergey
 */
@Profiled
@RestController
public class MainController {
    @Autowired
    public MyService myService;

    @GetMapping("/")
    public ResponseEntity main() {
        String s = myService.testService("a", "b", "c");
        return ResponseEntity.ok(s);
    }
}
