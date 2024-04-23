package com.monolitico.monolitico.exceptions;

import com.monolitico.monolitico.models.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@ControllerAdvice
@RestController
public class CustomExceptionHandler {
    public ResponseEntity<ErrorResponse> notFoundExceptionHandle(NotFoundException notFoundExceptionHandle)
    {
        return new ResponseEntity<>(
                ErrorResponse.builder()
                        .date(LocalDate.now())
                        .message(notFoundExceptionHandle.getMessage())
                        .statusCode(HttpStatus.NOT_FOUND.toString())
                        .build(),
                       HttpStatus.NOT_FOUND
        );

    }
    @ExceptionHandler(AlreadyExistsExceptions.class)
    public ResponseEntity<ErrorResponse> alreadyExistsExceptionHandle(AlreadyExistsExceptions alreadyExistsExceptions)
    {
        return new ResponseEntity<>(
                ErrorResponse.builder()
                        .date(LocalDate.now())
                        .message(alreadyExistsExceptions.getMessage())
                        .statusCode(HttpStatus.CONFLICT.toString())
                        .build(),
                HttpStatus.CONFLICT
        );

    }

}
