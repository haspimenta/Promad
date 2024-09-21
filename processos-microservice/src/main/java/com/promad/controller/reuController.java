package com.example.processos.controller;

import com.example.processos.model.reu;
import com.example.processos.model.processo;
import com.example.processos.repository.processoRepository;
import com.example.processos.repository.reuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/reus")
public class reuController {

    @Autowired
    private processoRepository processoRepository;

    @Autowired
    private reuRepository reuRepository;

    @PostMapping("/adicionar/{processoId}")
    public ResponseEntity<?> adicionarReu(@PathVariable Long processoId, @RequestBody Reu reu) {
        Optional<Processo> processo = processoRepository.findById(processoId);
        if (processo.isPresent()) {
            reu.setProcesso(processo.get());
            return ResponseEntity.ok(reuRepository.save(reu));
        } else {
            return ResponseEntity.badRequest().body("Processo não encontrado.");
        }
    }
}

