package com.example.fixacaoConteudo.mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.fixacaoConteudo.dtos.UsuarioRequestDTO;
import com.example.fixacaoConteudo.dtos.UsuarioResponseDTO;
import com.example.fixacaoConteudo.models.Usuario;

@Component
public class UsuarioMapperImpl implements UsuarioMapper {
    
    @Override
    public Usuario usuarioRequestParaUsuario(UsuarioRequestDTO usuarioRequestDTO) {
        return new Usuario(usuarioRequestDTO.getNome(), usuarioRequestDTO.getDataDeNascimento(), usuarioRequestDTO.getNickname(), usuarioRequestDTO.getEmail(), usuarioRequestDTO.getSenha(), usuarioRequestDTO.isReservaDePartida());
    }

    @Override
    public UsuarioResponseDTO usuarioParaUsuarioResponse(Usuario usuario) {
        return new UsuarioResponseDTO(usuario.getId(), usuario.getNome(), usuario.getDataDeNascimento(), usuario.getNickname(), usuario.getEmail(), usuario.getSenha(), usuario.isReservaDePartida());
    }

    public List<UsuarioResponseDTO> usuariosParaUsuariosResponses(Collection<Usuario> usuarios) {
        List<UsuarioResponseDTO> usuariosDTOs = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            usuariosDTOs.add(this.usuarioParaUsuarioResponse(usuario));
        }
        return usuariosDTOs;
    }
}