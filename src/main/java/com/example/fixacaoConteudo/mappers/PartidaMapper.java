package com.example.fixacaoConteudo.mappers;

import java.util.Collection;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.fixacaoConteudo.dtos.PartidaRequestDTO;
import com.example.fixacaoConteudo.dtos.PartidaResponseDTO;
import com.example.fixacaoConteudo.models.Partida;

@Mapper(componentModel = "spring")
public interface PartidaMapper {
    PartidaMapper INSTANCE = Mappers.getMapper(PartidaMapper.class);

    public Partida partidaRequestParaPartida(PartidaRequestDTO partidaRequestDTO);

    public PartidaResponseDTO partidaParaPartidaResponse(Partida partida);

    public List<PartidaResponseDTO> partidasParaPartidasResponses(Collection<Partida> partidas);
}