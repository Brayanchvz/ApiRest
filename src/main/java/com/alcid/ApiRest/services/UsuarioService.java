package com.alcid.ApiRest.services;

import java.util.ArrayList;

import com.alcid.ApiRest.models.UsuarioModel;
import com.alcid.ApiRest.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){

        return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
        
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);

    }
    
}