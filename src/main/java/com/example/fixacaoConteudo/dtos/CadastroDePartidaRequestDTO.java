package com.example.fixacaoConteudo.dtos;

import com.example.fixacaoConteudo.models.CadastroDeJogo;
import com.example.fixacaoConteudo.models.CadastroDeUsuario;
import com.example.fixacaoConteudo.models.Status;

import java.time.LocalDateTime;
import java.util.Collection;

public class CadastroDePartidaRequestDTO {
    private Collection<CadastroDeJogo> jogoSelecionado;
    private Collection<CadastroDeUsuario> usuario;
    private Status status;
    private LocalDateTime horarioDeInicioProgramado;
    private LocalDateTime horarioDeFimProgramado;
    private LocalDateTime horarioRealDaPartida;
}
