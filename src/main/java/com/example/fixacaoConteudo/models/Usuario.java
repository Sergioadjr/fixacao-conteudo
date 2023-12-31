package com.example.fixacaoConteudo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.ManyToAny;
import org.springframework.data.repository.query.parser.Part;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private LocalDateTime dataDeNascimento;
    @Column(length = 25, nullable = false, unique = true)
    private String nickname;
    @Column(length = 50, nullable = false, unique = true)
    private String email;
    @Column(length = 120, nullable = false)
    private String senha;

    private boolean reservaDePartida = false;

    @ManyToMany(mappedBy = "usuarios")
    private List<Partida> partidas;

    public Usuario(String nome, LocalDateTime dataDeNascimento, String nickname, String email, String senha, boolean reservaDePartida) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.nickname = nickname;
        this.email = email;
        this.senha = senha;
        this.reservaDePartida = reservaDePartida;
    }
}

