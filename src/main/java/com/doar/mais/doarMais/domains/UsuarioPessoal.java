package com.doar.mais.doarMais.domains;

import com.doar.mais.doarMais.domains.enums.TipoSangue;
import com.doar.mais.doarMais.domains.enums.TipoSexo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@JsonTypeName("UsuarioPessoal")
public class UsuarioPessoal extends Usuario {

    private static final long serialVersionUID = 1L;

    private int idade;
    private TipoSexo tipoSexo;
    private TipoSangue tipoSangue;
    private double peso;
    private Date ultimaDoacao;
    private String nomeUsuario;

    public UsuarioPessoal() {

    }

    public UsuarioPessoal(String usuario, String senha, int idade, TipoSexo tipoSexo, TipoSangue tipoSangue, double peso, String nomeUsuario) {
        super(usuario, senha);
        this.idade = idade;
        this.tipoSexo = tipoSexo;
        this.tipoSangue = tipoSangue;
        this.peso = peso;
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoSexo getTipoSexo() {
        return tipoSexo;
    }

    public void setTipoSexo(TipoSexo tipoSexo) {
        this.tipoSexo = tipoSexo;
    }

    public TipoSangue getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(TipoSangue tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getUltimaDoacao() {
        return ultimaDoacao;
    }

    public void setUltimaDoacao(Date ultimaDoacao) {
        this.ultimaDoacao = ultimaDoacao;
    }


    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
