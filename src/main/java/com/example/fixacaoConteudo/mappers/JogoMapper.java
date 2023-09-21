package com.example.fixacaoConteudo.mappers;

import java.util.Collection;

import org.mapstruct.Mapper;

import com.example.fixacaoConteudo.dtos.JogoRequestDTO;
import com.example.fixacaoConteudo.dtos.JogoResponseDTO;
import com.example.fixacaoConteudo.models.Jogo;

@Mapper(componentModel = "spring")
public interface JogoMapper {
    public Jogo jogoRequestParaJogo(JogoRequestDTO jogoRequestDTO);

    public JogoResponseDTO jogoParaJogoResponse(Jogo tipo);
    public Collection<JogoResponseDTO> jogosParaJogosResponses(Collection<Jogo> jogos);
}
