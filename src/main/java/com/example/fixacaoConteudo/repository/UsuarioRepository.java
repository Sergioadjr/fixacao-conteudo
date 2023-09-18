package com.example.fixacaoConteudo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fixacaoConteudo.models.CadastroDeUsuario;

@Repository
public interface UsuarioRepository extends CrudRepository <CadastroDeUsuario, Long>{
    Long deleteByNomeContaining(String nome);
}



