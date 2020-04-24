package ru.spbu.endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;


@SpringBootApplication
@ComponentScan(basePackages = "ru.spbu.*")
@EnableJpaRepositories(basePackages = "ru.spbu.domain.repository")
@EntityScan(basePackages = "ru.spbu.entities")
public class EndpointApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndpointApplication.class, args);
    }
}
