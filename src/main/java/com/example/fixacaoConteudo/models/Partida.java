package com.example.fixacaoConteudo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // @ManyToMany(mappedBy = "jogos")
    private Collection<Jogo> jogoSelecionado;
    // @OneToMany(mappedBy = "usuarios")
    private Collection<Usuario> usuario;
    private Status status;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horarioDeInicioProgramado;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horarioDeFimProgramado;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horarioRealDaPartida;
    
    private boolean vencedor = false;

    public Partida(Collection<Jogo> jogoSelecionado, Collection<Usuario> usuario, Status status, LocalDateTime horarioDeInicioProgramado,
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
