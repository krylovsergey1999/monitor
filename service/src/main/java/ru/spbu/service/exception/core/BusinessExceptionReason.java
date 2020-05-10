package ru.spbu.service.exception.core;

import org.springframework.http.HttpStatus;

/**
 * Интерфейс для описания причины возникновения бизнес ошибки.
 */
public interface BusinessExceptionReason {
    /**
     * Код ошибки.
     *
     * @return Код ошибки
     */
    String getCode();

    /**
     * Паттерн для формирования текста ошибки.
     * Для подстановки в текст значения параметра необходимо в нужном месте паттерна установить '%s'
     *
     * @return паттерн для формирования сообщения ошибки
     */
    String getMessagePattern();


    /**
     * Возвращает статус ошибки исключения.
     *
     * @return статус ошибки
     */
    HttpStatus getStatus();
}
