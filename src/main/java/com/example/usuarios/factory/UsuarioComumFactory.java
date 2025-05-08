package com.example.usuarios.factory;

import com.example.usuarios.builder.BuilderUsuario;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.model.UsuarioComum;

public class UsuarioComumFactory extends UsuarioFactory {
    public Usuario criarUsuario(BuilderUsuario builder) {
        return new UsuarioComum(
            builder.getNome(),
            builder.getEmail(),
            builder.getTelefone(),
            builder.getEndereco()
        );
    }
}