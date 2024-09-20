package com.example.processos.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "processos")
public class processo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numeroProcesso;

    @OneToMany(mappedBy = "processo", cascade = CascadeType.ALL)
    private List<Reu> reus;

    // Getters e Setters
}

