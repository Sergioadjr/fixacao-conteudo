package com.example.fixacaoConteudo.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CadastroDeUsuarioRequestDTO {
    private String nome;
    private LocalDateTime dataDeNascimento;
    private String nickname;
    private String email;
    private String senha;
    private boolean reservaDePartida;
}
