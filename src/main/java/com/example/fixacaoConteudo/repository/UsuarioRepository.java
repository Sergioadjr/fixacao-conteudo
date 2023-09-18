package com.example.fixacaoConteudo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fixacaoConteudo.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Long>{
    Long deleteByNomeContaining(String nome);
}



