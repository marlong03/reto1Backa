package com.example.Reto1Backend.controller;

import java.util.ArrayList;

import com.example.Reto1Backend.models.UsuarioModel;
import com.example.Reto1Backend.services.UsuarioServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    UsuarioServices usuarioServices;


    //GET
    @GetMapping("/get")
    public ArrayList<UsuarioModel> pintarUsuarios(){
        return usuarioServices.traerUsuarios();
    }

    @PostMapping("/post")
    public UsuarioModel enviarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioServices.enviarUsuario(usuario);
    }





}
