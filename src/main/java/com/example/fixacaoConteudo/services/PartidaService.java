package com.example.fixacaoConteudo.services;

import com.example.fixacaoConteudo.dtos.JogoRequestDTO;
import com.example.fixacaoConteudo.dtos.JogoResponseDTO;
import com.example.fixacaoConteudo.mappers.JogoMapper;
import com.example.fixacaoConteudo.models.Jogo;
import com.example.fixacaoConteudo.repository.JogoRepository;
import com.example.fixacaoConteudo.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidaService {
    @Autowired
    private PartidaRepository partidaRepository;


    
}
