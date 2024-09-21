package com.example.processos.controller;

import com.example.processos.model.Usuario;
import com.example.processos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {

    @Autowired
    private usuarioRepository usuarioRepository;

    @GetMapping
    public List<usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}

