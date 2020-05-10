package ru.spbu.entities.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * User: Sergey
 * Date: 10.05.2020
 * Time: 3:07
 * Description: Чтобы сообщить JPA о вошедших в данный момент пользователях,
 * требуется предоставить реализацию  AuditorAware  и переопределить метод getCurrentAuditor().
 * А внутри getCurrentAuditor() нужно выбрать текущего вошедшего в систему пользователя.
 *
 * @author Krylov Sergey (krylov.sergey.1999@yandex.ru)
 */
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Sergey");
    }
}