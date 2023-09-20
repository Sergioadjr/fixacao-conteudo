package com.example.fixacaoConteudo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "*")
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    
}
