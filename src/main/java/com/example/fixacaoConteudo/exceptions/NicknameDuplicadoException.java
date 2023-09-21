package com.example.fixacaoConteudo.exceptions;

public class NicknameDuplicadoException extends Exception {
    public NicknameDuplicadoException() {
        super("Este nickname já está sendo utilizado. Por favor, digite outro.");
    }
}