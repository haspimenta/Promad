package com.example.processos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reus")
public class reu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "processo_id", nullable = false)
    private Processo processo;

    // Getters e Setters
}

