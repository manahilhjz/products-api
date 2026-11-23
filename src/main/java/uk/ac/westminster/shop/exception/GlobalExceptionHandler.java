package uk.ac.westminster.shop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public interface GlobalExceptionHandler {

    @ExceptionHandler (ProductNotFoundException.class)
    public static ResponseEntity<ErrorResponse> handleNotFound(ProductNotFoundException ex) {

        ErrorResponse body = new ErrorResponse(ex.getMessage(), 404);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }
}
