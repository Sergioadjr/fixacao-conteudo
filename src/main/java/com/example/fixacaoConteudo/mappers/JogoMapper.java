package com.example.fixacaoConteudo.mappers;

import java.util.Collection;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.fixacaoConteudo.dtos.JogoRequestDTO;
import com.example.fixacaoConteudo.dtos.JogoResponseDTO;
import com.example.fixacaoConteudo.models.Jogo;

@Mapper(componentModel = "spring")
public interface JogoMapper {
    JogoMapper INSTANCE = Mappers.getMapper(JogoMapper.class);
    public Jogo jogoRequestParaJogo(JogoRequestDTO jogoRequestDTO);
    public JogoResponseDTO jogoParaJogoResponse(Jogo jogo);
    public List<JogoResponseDTO> jogosParaJogosResponses(Collection<Jogo> jogos);
}
