package com.AlexRibeiro.usuario.business;

import com.AlexRibeiro.usuario.business.converter.UsuarioConverter;
import com.AlexRibeiro.usuario.business.dto.UsuarioDTO;
import com.AlexRibeiro.usuario.infrastructure.entity.Usuario;
import com.AlexRibeiro.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {
    //Injeção de dependência
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));


    }




}
