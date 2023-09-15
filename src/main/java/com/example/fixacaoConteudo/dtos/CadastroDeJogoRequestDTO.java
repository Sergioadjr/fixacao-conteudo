package com.example.fixacaoConteudo.dtos;

import com.example.fixacaoConteudo.models.Categoria;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CadastroDeJogoRequestDTO {
    private String nome;
    private Categoria categoria;
    private String fornecedor;
}
