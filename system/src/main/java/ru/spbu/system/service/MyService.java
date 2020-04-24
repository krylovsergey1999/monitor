package ru.spbu.system.service;

import ch.qos.logback.core.encoder.EchoEncoder;
import org.springframework.stereotype.Service;
import ru.spbu.system.annotation.Profiled;

/**
 * @author Krylov Sergey
 */
@Service
public class MyService {

    @Profiled
    public String testService(String a, String b, String c) {
        return a + b + c;
    }
}
