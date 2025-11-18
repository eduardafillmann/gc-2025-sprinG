package com.duda.fillmann.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashSet;
import java.util.Set;

public class MensagemErro {
    private String mensagem;
    private int status;
    private String caminho;
    Set<String> erros;

    public MensagemErro(String mensagem, HttpServletRequest request, int status) {
        this.mensagem = mensagem;
        this.caminho = request.getRequestURI();
        this.status = status;
    }

    public MensagemErro(String mensagem, HttpServletRequest request, int status, BindingResult result) {
        this.mensagem = mensagem;
        this.caminho = request.getRequestURI();
        this.status = status;
        this.erros = getErros(result);
    }

    private Set<String> getErros(BindingResult result){
        this.erros =new HashSet<>();
        for(FieldError fieldError :result.getFieldErrors()){
            erros.add(fieldError.getDefaultMessage());
        }
        return erros;
    }
}

