package com.example.Reto1Backend.repository;

import com.example.Reto1Backend.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> {
    
}
