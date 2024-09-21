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
    private processo processo;

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

    // Getter para cpf
    public String getCpf() {
        return cpf;
    }

    // Setter para cpf
    //public void setCpf(String cpf) {
    //    this.cpf = cpf;
    //}
}

