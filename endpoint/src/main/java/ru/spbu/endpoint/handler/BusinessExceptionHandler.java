package ru.spbu.endpoint.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.spbu.service.exception.core.BusinessException;

/**
 * User: Sergey
 * Date: 09.05.2020
 * Time: 22:57
 * Description: Обработка вылетающих исключений
 *
 * @author Krylov Sergey (krylov.sergey.1999@yandex.ru)
 */
@ControllerAdvice
public class BusinessExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<BusinessExceptionResponse> handle(BusinessException e) {
        return new ResponseEntity<>(new BusinessExceptionResponse(e.getMessage()), e.getStatus());
    }

    private static class BusinessExceptionResponse {
        private final String message;

        public BusinessExceptionResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public String getType() {
            return "BusinessException";
        }
    }
}