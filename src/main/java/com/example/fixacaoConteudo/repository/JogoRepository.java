package com.example.fixacaoConteudo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.fixacaoConteudo.models.Categoria;
import com.example.fixacaoConteudo.models.Jogo;

public interface JogoRepository extends CrudRepository<Jogo, Long> {
    List<Jogo> findByNomeContainingIgnoreCase(String nome);

    List<Jogo> findByCategoria(Categoria categoria);
}
