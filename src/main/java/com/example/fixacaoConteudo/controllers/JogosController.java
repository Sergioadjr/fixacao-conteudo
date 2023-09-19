package com.example.fixacaoConteudo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fixacaoConteudo.dtos.JogoRequestDTO;
import com.example.fixacaoConteudo.dtos.JogoResponseDTO;
import com.example.fixacaoConteudo.models.Jogos;
import com.example.fixacaoConteudo.services.JogosService;

@RestController
@RequestMapping("/jogos")
public class JogosController {
    @Autowired
    private JogosService jogosService;

    @PostMapping
    public ResponseEntity<JogoResponseDTO> cadastrarJogo(@RequestBody JogoRequestDTO jogoRequestDTO) {
        Jogos jogo = jogosService.cadastrarJogo(jogoRequestDTO);
        return new ResponseEntity<>(jogo, HttpStatus.CREATED);
    }

}
