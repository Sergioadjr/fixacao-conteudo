package com.example.demo.models;

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
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "usuario")
    private Collection<Usuario> usuario =  new ArrayList<>();
    private Status status;
    private LocalDateTime horarioDeInicioProgramado;
    private LocalDateTime horarioDeFimProgramado;
    private LocalDateTime horarioRealDaPartida;
    private boolean vencedor = false;

    public Partida(Collection<Usuario> usuario, Status status, LocalDateTime horarioDeInicioProgramado,
                   LocalDateTime horarioDeFimProgramado, LocalDateTime horarioRealDaPartida, boolean vencedor) {
        this.status = status;
        this.horarioDeInicioProgramado = horarioDeInicioProgramado;
        this.horarioDeFimProgramado = horarioDeFimProgramado;
        this.horarioRealDaPartida = horarioRealDaPartida;
        this.vencedor = vencedor;
    }

}
