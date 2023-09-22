package com.example.fixacaoConteudo.models;

import java.util.Collection;

import org.hibernate.mapping.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Categoria categoria;
    private String fornecedor;

    @OneToMany
    @JoinColumn(name = "jogo")
    private Collection<Partida> partida;

    public Jogo(String nome, Categoria categoria, String fornecedor) {
        this.nome = nome;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

}
