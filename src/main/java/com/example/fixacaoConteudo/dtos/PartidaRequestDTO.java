package com.example.fixacaoConteudo.dtos;

import com.example.fixacaoConteudo.models.Jogo;
import com.example.fixacaoConteudo.models.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.example.fixacaoConteudo.models.Status;

import java.time.LocalDateTime;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PartidaRequestDTO {
    private Jogo jogo;
    private Collection<Usuario> usuarios;
    private Status status;
    private LocalDateTime horarioDeInicioProgramado;
    private LocalDateTime horarioDeFimProgramado;
    private LocalDateTime horarioRealDaPartida;
}