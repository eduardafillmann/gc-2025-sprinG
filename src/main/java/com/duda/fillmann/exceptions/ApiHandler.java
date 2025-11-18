package com.duda.fillmann.exceptions;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiHandler {
    @ExceptionHandler(TipoPokemonException.class)
    public ResponseEntity<MensagemErro> TipoPokemonException(TipoPokemonException ex, HttpServletRequest request) {
        MensagemErro mensagem = new MensagemErro(ex.getMessage(), request, HttpStatus.UNPROCESSABLE_ENTITY.value());
        return new ResponseEntity<>(mensagem, HttpStatus.UNPROCESSABLE_ENTITY);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MensagemErro> TipoPokemonException (MethodArgumentNotValidException ex, HttpServletRequest request, BindingResult bindingResult){
        MensagemErro mensagem = new MensagemErro(ex.getMessage(), request, HttpStatus.UNPROCESSABLE_ENTITY.value(), bindingResult);
        return new ResponseEntity<>(mensagem, HttpStatus.UNPROCESSABLE_ENTITY);

    }
}
