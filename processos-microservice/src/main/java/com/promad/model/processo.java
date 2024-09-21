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
    private List<reu> reus;

    // Getters e Setters
    // Getter para id
    public Long getId() {
        return id;
    }

    // Setter para id
    //public void setId(Long id) {
    //    this.id = id;
    //}

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para descricao
    public String getDescricao() {
        return descricao;
    }

    // Setter para descricao
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

