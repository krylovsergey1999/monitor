package ru.spbu.service.bisiness.exception;

import ru.spbu.domain.exception.BusinessExceptionReason;

/**
 * Ошибки сервисов.
 *
 * @author Krylov Sergey
 */
public enum ServiceExceptionReason implements BusinessExceptionReason {
    UNEXPECTED_ERROR("UNEXPECTED_ERROR", "Непредвиденная ошибка");

    private final String code;
    private final String messagePattern;

    /**
     * @param code           Код ошибки
     * @param messagePattern Паттерн для формирования текста ошибки
     */
    ServiceExceptionReason(String code, String messagePattern) {
        this.code = code;
        this.messagePattern = messagePattern;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessagePattern() {
        return messagePattern;
    }
}
