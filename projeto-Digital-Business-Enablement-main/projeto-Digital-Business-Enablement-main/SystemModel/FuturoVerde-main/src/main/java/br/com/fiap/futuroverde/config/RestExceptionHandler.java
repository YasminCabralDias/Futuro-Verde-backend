package br.com.fiap.futuroverde.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.fiap.futuroverde.models.RestError;
import br.com.fiap.futuroverde.models.RestValidationError;

@RestControllerAdvice
public class RestExceptionHandler {
    Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<RestValidationError>> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        log.error("erro: argumento inválido");
        List<RestValidationError> erros = new ArrayList<>();
        e.getFieldErrors().forEach(v -> erros.add(new RestValidationError(400, v.getField(), v.getDefaultMessage())));
        return ResponseEntity.badRequest().body(erros);
    }

}
