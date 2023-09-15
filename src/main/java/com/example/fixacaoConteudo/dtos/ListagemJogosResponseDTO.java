package com.example.fixacaoConteudo.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListagemJogosResponseDTO {
    private PageInfoDTO pageInfo;
    private List<CadastroDeJogoResponseDTO> jogos;
}
