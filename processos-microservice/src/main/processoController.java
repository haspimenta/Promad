package com.example.processos.controller;

import com.example.processos.model.processo;
import com.example.processos.repository.processoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/processos")
public class processoController {

    @Autowired
    private processoRepository processoRepository;

    @PostMapping
    public ResponseEntity<?> criarProcesso(@RequestBody processo processo) {
        Optional<processo> existente = processoRepository.findByNumeroProcesso(processo.getNumeroProcesso());
        if (existente.isPresent()) {
            return ResponseEntity.badRequest().body("Processo já cadastrado.");
        }
        return ResponseEntity.ok(processoRepository.save(processo));
    }

    @GetMapping
    public List<processo> listarProcessos() {
        return processoRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProcesso(@PathVariable Long id) {
        processoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

