package com.example.processos.repository;

import com.example.processos.model.processo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface processoRepository extends JpaRepository<Processo, Long> {
    Optional<Processo> findByNumeroProcesso(String numeroProcesso);
}

