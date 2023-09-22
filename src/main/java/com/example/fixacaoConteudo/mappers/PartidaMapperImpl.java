package com.example.fixacaoConteudo.mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.fixacaoConteudo.dtos.PartidaRequestDTO;
import com.example.fixacaoConteudo.dtos.PartidaResponseDTO;
import com.example.fixacaoConteudo.models.Partida;

@Component
public class PartidaMapperImpl implements PartidaMapper {

    @Override
    public Partida partidaRequestParaPartida(PartidaRequestDTO partidaRequestDTO) {
        return new Partida(partidaRequestDTO.getJogo(), partidaRequestDTO.getUsuarios(), partidaRequestDTO.getStatus(), partidaRequestDTO.getHorarioDeInicioProgramado(), partidaRequestDTO.getHorarioDeFimProgramado(), partidaRequestDTO.getHorarioRealDaPartida());
    }

    @Override
    public PartidaResponseDTO partidaParaPartidaResponse(Partida partida) {
        return new PartidaResponseDTO(partida.getId(), partida.getJogo(), partida.getUsuarios(),
                partida.getStatus(), partida.getHorarioDeInicioProgramado(), partida.getHorarioDeFimProgramado(), partida.getHorarioRealDaPartida(), partida.isVencedor());
    }

    public List<PartidaResponseDTO> partidasParaPartidasResponses(Collection<Partida> partidas) {
        List<PartidaResponseDTO> partidasDTOs = new ArrayList<>();
        for (Partida partida : partidas) {
            partidasDTOs.add(this.partidaParaPartidaResponse(partida));
        }
        return partidasDTOs;
    }

}