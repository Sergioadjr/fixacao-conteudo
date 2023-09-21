package com.example.fixacaoConteudo.mappers;

import java.util.Collection;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.fixacaoConteudo.dtos.UsuarioRequestDTO;
import com.example.fixacaoConteudo.dtos.UsuarioResponseDTO;
import com.example.fixacaoConteudo.models.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
    public Usuario usuarioRequestParaUsuario(UsuarioRequestDTO usuarioRequestDTO);
    public UsuarioResponseDTO usuarioParaUsuarioResponse(Usuario usuario);
    public List<UsuarioResponseDTO> usuariosParaUsuariosResponses(Collection<Usuario> usuarios);
}