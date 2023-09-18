package com.example.fixacaoConteudo.dtos;

import com.example.fixacaoConteudo.models.Jogos;
import com.example.fixacaoConteudo.models.Usuario;
import com.example.fixacaoConteudo.models.Status;

import java.time.LocalDateTime;
import java.util.Collection;

public class PartidaRequestDTO {
    private Collection<Jogos> jogoSelecionado;
    private Collection<Usuario> usuario;
    private Status status;
    private LocalDateTime horarioDeInicioProgramado;
    private LocalDateTime horarioDeFimProgramado;
    private LocalDateTime horarioRealDaPartida;
}
