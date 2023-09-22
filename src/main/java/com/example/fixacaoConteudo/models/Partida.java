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
    
    @ManyToOne
    private Jogo jogo;
    
    @ManyToMany
    private Collection<Usuario> usuarios;
    
    private Status status;

    private LocalDateTime horarioDeInicioProgramado;
    private LocalDateTime horarioDeFimProgramado;
    private LocalDateTime horarioRealDaPartida;
    
    private boolean vencedor = false;

    public Partida(Jogo jogo, Collection<Usuario> usuarios, Status status, LocalDateTime horarioDeInicioProgramado,
                   LocalDateTime horarioDeFimProgramado, LocalDateTime horarioRealDaPartida, boolean vencedor) {
        this.jogo = jogo;
        this.usuarios = usuarios;
        this.status = status;
        this.horarioDeInicioProgramado = horarioDeInicioProgramado;
        this.horarioDeFimProgramado = horarioDeFimProgramado;
        this.horarioRealDaPartida = horarioRealDaPartida;
        this.vencedor = vencedor;
    }

}
