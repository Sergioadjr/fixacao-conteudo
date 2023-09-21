package com.example.fixacaoConteudo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fixacaoConteudo.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Long>{
    Long deleteByNomeIgnoreCase(String nome);
    Long findByNomeIgnoreCase(String nome);
    List<Usuario> findByNicknameIgnoreCase(String nickname);
}



