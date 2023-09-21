package com.example.fixacaoConteudo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fixacaoConteudo.dtos.JogoRequestDTO;
import com.example.fixacaoConteudo.dtos.JogoResponseDTO;
import com.example.fixacaoConteudo.mappers.JogoMapper;
import com.example.fixacaoConteudo.models.Jogo;
import com.example.fixacaoConteudo.repository.JogoRepository;

@Service
public class JogoService {
    @Autowired
    private JogoRepository jogoRepository;

    public JogoResponseDTO cadastrarJogo(JogoRequestDTO jogoRequestDTO) {
        Jogo jogo = JogoMapper.INSTANCE.jogoRequestDTOToJogo(jogoRequestDTO);
        jogo = jogoRepository.save(jogo);
        return JogoMapper.INSTANCE.jogoToJogoResponseDTO(jogo);
    }
}
