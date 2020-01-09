package com.doar.mais.doarMais.domains;

import com.doar.mais.doarMais.domains.enums.TipoSangue;

import java.util.Date;

public class UsuarioPessoal extends Usuario{

    private int idade;
    private TipoSexo tipoSexo;
    private TipoSangue tipoSangue;
    private double peso;
    private String telefone;
    private String email;
    private Date ultimaDoacao;

    public UsuarioPessoal(){

    }

    public UsuarioPessoal(String usuario, String senha, int idade, TipoSexo tipoSexo, TipoSangue tipoSangue, double peso) {
        super(usuario, senha);
        this.idade = idade;
        this.tipoSexo = tipoSexo;
        this.tipoSangue = tipoSangue;
        this.peso = peso;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getUltimaDoacao() {
        return ultimaDoacao;
    }

    public void setUltimaDoacao(Date ultimaDoacao) {
        this.ultimaDoacao = ultimaDoacao;
    }

}
