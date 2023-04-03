package br.com.fiap.futuroverde.models;

public record RestValidationError(Integer code, String field, String message) {
    
}
