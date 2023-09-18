package com.example.fixacaoConteudo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "*")
@RequestMapping("/api/v1/partidas")

public class PartidaController {
    @GetMapping("/iniciada")
//    public ResponseEntity<ListagemAlunosResponseDTO> listarAlunosPresentes(
//            @RequestParam(name = "dia") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dia,
//            @RequestParam(name = "nome", required = false) String nomeAluno,
//            @RequestParam(name = "etapaDeEnsinoId", defaultValue = "0") long etapaDeEnsinoId,
//            @RequestParam(name = "currentPage", defaultValue = "1") int currentPage,
//            @RequestParam(name = "pageSize", defaultValue = "10") int pageSize) {
//
//        var escola = escolaRepository.findAll().get(0);
//        var listagem = alunoService.criarListaAlunosPresentes(dia, escola, nomeAluno, etapaDeEnsinoId, currentPage, pageSize);
//        return ResponseEntity.ok(listagem);
//    }
}


