package com.example.fixacaoConteudo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Categoria categoria;
    private String fornecedor;

    public Jogos(String nome, Categoria categoria, String fornecedor) {
        this.nome = nome;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

}
