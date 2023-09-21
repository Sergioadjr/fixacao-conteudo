package com.example.fixacaoConteudo.controllers;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fixacaoConteudo.dtos.PartidaRequestDTO;
import com.example.fixacaoConteudo.dtos.PartidaResponseDTO;
import com.example.fixacaoConteudo.models.Partida;
import com.example.fixacaoConteudo.services.JogoService;
import com.example.fixacaoConteudo.services.PartidaService;

@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "*")
@RequestMapping("/api/v1/partidas")
public class PartidaController {

    // @Autowired
    // private PartidaService PartidasService;

    // @PostMapping
    // public ResponseEntity<PartidaResponseDTO> cadastrarPartida(@RequestBody PartidaRequestDTO partidaRequestDTO) {
    //     Partida partida = partidasService.cadastrarPartida(partidaRequestDTO);
    //     return new ResponseEntity<>(partida, HttpStatus.CREATED);
    // }
}
