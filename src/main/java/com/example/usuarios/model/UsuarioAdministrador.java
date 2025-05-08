package com.example.usuarios.model;

public class UsuarioAdministrador implements Usuario {
    private final String nome;
    private final String email;
    private final String telefone;
    private final String endereco;

    public UsuarioAdministrador(String nome, String email, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
    public String getTipo() { return "Administrador"; }
}