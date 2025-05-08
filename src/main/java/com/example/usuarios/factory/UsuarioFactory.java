package com.example.usuarios.factory;

import com.example.usuarios.builder.BuilderUsuario;
import com.example.usuarios.model.Usuario;

public abstract class UsuarioFactory {
    public abstract Usuario criarUsuario(BuilderUsuario builder);
}