package com.example.fixacaoConteudo.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fixacaoConteudo.dtos.UsuarioRequestDTO;
import com.example.fixacaoConteudo.dtos.UsuarioResponseDTO;
import com.example.fixacaoConteudo.exceptions.IdadeInvalidadeException;
import com.example.fixacaoConteudo.mappers.UsuarioMapper;
import com.example.fixacaoConteudo.models.Usuario;
import com.example.fixacaoConteudo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioResponseDTO cadastrarUsuario(UsuarioRequestDTO usuarioRequestDTO) throws IdadeInvalidadeException {
        LocalDateTime dataDeNascimento = usuarioRequestDTO.getDataDeNascimento();

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime idadeMinima = agora.minusYears(14);

        if (dataDeNascimento.isAfter(idadeMinima)) {
            throw new IdadeInvalidadeException();
        }

        Usuario usuario = UsuarioMapper.INSTANCE.usuarioRequestParaUsuario(usuarioRequestDTO);
        usuario = usuarioRepository.save(usuario);
        return UsuarioMapper.INSTANCE.usuarioParaUsuarioResponse(usuario);
    }
}
