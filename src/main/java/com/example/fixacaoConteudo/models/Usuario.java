package com.example.fixacaoConteudo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    private String nickname;
    private String email;
    private String senha;
    private boolean reservaDePartida = false;

    public Usuario(String nome, LocalDateTime dataDeNascimento, String nickname, String email, String senha, boolean reservaDePartida) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.nickname = nickname;
        this.email = email;
        this.senha = senha;
        this.reservaDePartida = reservaDePartida;
    }
}

