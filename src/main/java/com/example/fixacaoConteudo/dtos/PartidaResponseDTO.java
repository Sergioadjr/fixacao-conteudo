package com.example.fixacaoConteudo.dtos;

import com.example.fixacaoConteudo.models.Jogo;
import com.example.fixacaoConteudo.models.Usuario;
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
public class PartidaResponseDTO {
    private long id;
    private Collection<Jogo> jogoSelecionado;
    private Collection<Usuario> usuario;
    private Status status;
    private LocalDateTime horarioDeInicioProgramado;
    private LocalDateTime horarioDeFimProgramado;
    private LocalDateTime horarioRealDaPartida;
    private boolean vencedor;
}
