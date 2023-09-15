package com.example.fixacaoConteudo.dtos;

import com.example.fixacaoConteudo.models.CadastroDeJogo;
import com.example.fixacaoConteudo.models.CadastroDeUsuario;
import com.example.fixacaoConteudo.models.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CadastroDePartidaResponseDTO {
    private long id;
    private Collection<CadastroDeJogo> jogoSelecionado;
    private Collection<CadastroDeUsuario> usuario;
    private Status status;
    private LocalDateTime horarioDeInicioProgramado;
    private LocalDateTime horarioDeFimProgramado;
    private LocalDateTime horarioRealDaPartida;
    private boolean vencedor;
}
