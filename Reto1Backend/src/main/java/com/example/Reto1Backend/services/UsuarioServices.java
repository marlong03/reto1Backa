package com.example.Reto1Backend.services;

import java.util.ArrayList;

import com.example.Reto1Backend.models.UsuarioModel;
import com.example.Reto1Backend.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServices {


    @Autowired
    UsuarioRepository usuarioRepository;

    //METODO PARA GET LOS DATOS DE LA BD
    public ArrayList<UsuarioModel> traerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    //METODO PARA POST LOS DATOS DE LA BD
    public UsuarioModel enviarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
   
    
}
