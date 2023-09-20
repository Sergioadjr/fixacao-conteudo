package com.example.fixacaoConteudo.exceptions;

public class IdadeInvalidadeException extends Exception {
    public IdadeInvalidadeException() {
        super("Idade mínima deve ser de 14 anos");
    }
}


