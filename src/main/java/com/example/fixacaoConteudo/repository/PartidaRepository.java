package com.example.fixacaoConteudo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fixacaoConteudo.models.CadastroDePartida;

@Repository
public interface PartidaRepository extends CrudRepository <CadastroDePartida, Long>{
    Long deleteByNomeContaining(String nome);

}
