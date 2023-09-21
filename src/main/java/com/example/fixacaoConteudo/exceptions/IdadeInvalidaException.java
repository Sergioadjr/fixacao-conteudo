package com.example.fixacaoConteudo.exceptions;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException() {
        super("Idade mínima deve ser de 14 anos");
    }
}


