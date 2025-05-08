package com.example.usuarios.factory;

import com.example.usuarios.builder.BuilderUsuario;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.model.UsuarioAdministrador;

public class UsuarioAdministradorFactory extends UsuarioFactory {
    public Usuario criarUsuario(BuilderUsuario builder) {
        return new UsuarioAdministrador(
            builder.getNome(),
            builder.getEmail(),
            builder.getTelefone(),
            builder.getEndereco()
        );
    }
}