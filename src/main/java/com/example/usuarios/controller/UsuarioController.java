package com.example.usuarios.controller;

import com.example.usuarios.builder.BuilderUsuario;
import com.example.usuarios.factory.UsuarioAdministradorFactory;
import com.example.usuarios.factory.UsuarioComumFactory;
import com.example.usuarios.factory.UsuarioFactory;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.repository.RepositorioUsuarios;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/formulario")
    public String exibirFormulario() {
        return "formulario";
    }

    @PostMapping("/cadastrar")
    public String cadastrarUsuario(@RequestParam String tipo,
                                   @RequestParam String nome,
                                   @RequestParam(required = false) String email,
                                   @RequestParam(required = false) String telefone,
                                   @RequestParam(required = false) String endereco) {

        BuilderUsuario builder = new BuilderUsuario()
                .setNome(nome)
                .setEmail(email)
                .setTelefone(telefone)
                .setEndereco(endereco);

        UsuarioFactory factory;
        if ("Administrador".equalsIgnoreCase(tipo)) {
            factory = new UsuarioAdministradorFactory();
        } else {
            factory = new UsuarioComumFactory();
        }

        Usuario usuario = factory.criarUsuario(builder);
        RepositorioUsuarios.getInstancia().adicionarUsuario(usuario);

        return "redirect:/usuarios/listar";
    }

    @GetMapping("/listar")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", RepositorioUsuarios.getInstancia().listarUsuarios());
        return "usuarios";
    }

    @PostMapping("/remover")
    public String removerUsuario(@RequestParam int index) {
        RepositorioUsuarios.getInstancia().removerUsuario(index);
        return "redirect:/usuarios/listar";
    }
}
