package com.example.flyway.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
//@Table(name="Autor", schema = "public")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    //@JsonIgnore
    @JsonIgnore
    @OneToMany(mappedBy = "autor")
    private Set<Artigo> artigos = new HashSet<>();
    @Column(name = "nome")
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(Set<Artigo> artigos) {
        this.artigos = artigos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}