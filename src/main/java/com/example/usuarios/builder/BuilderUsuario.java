package com.example.usuarios.builder;

public class BuilderUsuario {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public BuilderUsuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public BuilderUsuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public BuilderUsuario setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public BuilderUsuario setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
}