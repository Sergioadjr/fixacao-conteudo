package com.example.fixacaoConteudo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class CadastroDePartida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "jogo")
    private Collection<CadastroDeJogo> jogoSelecionado;
    @OneToMany(mappedBy = "usuario")
    private Collection<CadastroDeUsuario> usuario;
    private Status status;
    private LocalDateTime horarioDeInicioProgramado;
    private LocalDateTime horarioDeFimProgramado;
    private LocalDateTime horarioRealDaPartida;
    private boolean vencedor = false;

    public CadastroDePartida(Collection<CadastroDeJogo> jogoSelecionado, Collection<CadastroDeUsuario> usuario, Status status, LocalDateTime horarioDeInicioProgramado,
                             LocalDateTime horarioDeFimProgramado, LocalDateTime horarioRealDaPartida, boolean vencedor) {
        this.jogoSelecionado = jogoSelecionado;
        this.usuario = usuario;
        this.status = status;
        this.horarioDeInicioProgramado = horarioDeInicioProgramado;
        this.horarioDeFimProgramado = horarioDeFimProgramado;
        this.horarioRealDaPartida = horarioRealDaPartida;
        this.vencedor = vencedor;
    }

}