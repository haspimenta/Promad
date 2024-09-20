package com.example.processos.repository;

import com.example.processos.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<usuario, Long> {
}

