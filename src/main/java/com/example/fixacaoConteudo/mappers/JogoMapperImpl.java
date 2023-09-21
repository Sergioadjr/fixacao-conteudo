package com.example.fixacaoConteudo.mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.fixacaoConteudo.dtos.JogoRequestDTO;
import com.example.fixacaoConteudo.dtos.JogoResponseDTO;
import com.example.fixacaoConteudo.models.Jogo;

@Component
public class JogoMapperImpl implements JogoMapper {

    @Override
    public Jogo jogoRequestParaJogo(JogoRequestDTO jogoRequestDTO) {
        return new Jogo(jogoRequestDTO.getNome(), jogoRequestDTO.getCategoria(), jogoRequestDTO.getFornecedor());
    }

    @Override
    public JogoResponseDTO jogoParaJogoResponse(Jogo jogo) {
        return new JogoResponseDTO(jogo.getId(), jogo.getNome(), jogo.getCategoria(), jogo.getFornecedor());
    }

    public List<JogoResponseDTO> jogosParaJogosResponses(Collection<Jogo> jogos) {
        List<JogoResponseDTO> jogosDTOs = new ArrayList<>();
        for (Jogo jogo : jogos) {
            jogosDTOs.add(this.jogoParaJogoResponse(jogo));
        }
        return jogosDTOs;
    }
}
