package com.example.fixacaoConteudo.mappers;

import com.example.fixacaoConteudo.dtos.JogoResponseDTO;
import com.example.fixacaoConteudo.models.Jogo;
import org.springframework.data.domain.Page;

import java.util.List;

public class ListagemDeJogosMapper {
    public List<JogoResponseDTO> retornaListagemJogosDisponiveis(Page<Jogo> jogosPage) {
        return jogosPage.stream().map(this::criarJogos).toList();
    }

    private JogoResponseDTO criarJogos(Jogo jogo) {
        return JogoResponseDTO
                .builder()
                .nome(jogo.getNome())
                .categoria(jogo.getCategoria())
                .fornecedor(jogo.getFornecedor())
                .build();
    }
}
