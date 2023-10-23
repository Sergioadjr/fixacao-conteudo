package com.example.fixacaoConteudo.exceptions;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException() {
        super("A idade mínima deve ser de 14 anos");
    }
}


