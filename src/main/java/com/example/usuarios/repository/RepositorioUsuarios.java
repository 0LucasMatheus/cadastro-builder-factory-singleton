package com.example.usuarios.repository;

import com.example.usuarios.model.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioUsuarios {
    private static RepositorioUsuarios instancia;
    private final List<Usuario> usuarios = new ArrayList<>();

    private RepositorioUsuarios() {}

    public static RepositorioUsuarios getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioUsuarios();
        }
        return instancia;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return Collections.unmodifiableList(usuarios);
    }

    public boolean removerUsuario(int index) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.remove(index);
            return true;
        }
        return false;
    }

}