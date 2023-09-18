package com.example.fixacaoConteudo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fixacaoConteudo.models.Partida;

@Repository
public interface PartidaRepository extends CrudRepository <Partida, Long>{
    Long deleteByNomeContaining(String nome);

}
