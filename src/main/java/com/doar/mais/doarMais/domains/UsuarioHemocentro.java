package com.doar.mais.doarMais.domains;

import com.doar.mais.doarMais.domains.Usuario;

public class UsuarioHemocentro {

    private Endereco endereco;
    private String cnpj;
    private String rsocial;
    private String site;

    public UsuarioHemocentro() {

    }

    public UsuarioHemocentro(String usuario, String senha, Campanha campanha, Endereco endereco, String cnpj, String rsocial) {
        //super(usuario, senha, campanha);
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.rsocial = rsocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRsocial() {
        return rsocial;
    }

    public void setRsocial(String rsocial) {
        this.rsocial = rsocial;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
