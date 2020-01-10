package com.doar.mais.doarMais.domains;

import java.io.Serializable;

public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private Estado estado;

    public Cidade() {
        super();
    }

    public Cidade(Long id, String nome, Estado estado) {
        super();
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cidade cidade = (Cidade) o;

        return id != null ? id.equals(cidade.id) : cidade.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
