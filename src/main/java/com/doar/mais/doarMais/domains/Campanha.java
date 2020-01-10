package com.doar.mais.doarMais.domains;

import com.doar.mais.doarMais.domains.enums.EstadoCampanha;
import com.doar.mais.doarMais.domains.enums.TipoSangue;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@Inheritance(strategy = InheritanceType.JOINED)
public class Campanha implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer estadoCampanha;

    private int qtdeSolicitada;
    private Integer qtdeAtual;
    private String finalidade;
    private String nomeCampanha;

    private Integer tipoSangue;
    private Date dataAbertura;
    private Date dataConclusao;
    private char exclusiva;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Campanha() {

    }

    public Campanha(EstadoCampanha estadoCampanha, int qtdeSolicitada, String finalidade, String nomeCampanha, TipoSangue tipoSangue, Date dataAbertura, char exclusiva, Usuario usuario) {
        this.estadoCampanha = (estadoCampanha == null) ? null : estadoCampanha.getCod();
        this.qtdeSolicitada = qtdeSolicitada;
        this.finalidade = finalidade;
        this.nomeCampanha = nomeCampanha;
        this.tipoSangue = (tipoSangue == null) ? null : tipoSangue.getCod();
        this.dataAbertura = dataAbertura;
        this.exclusiva = exclusiva;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEstadoCampanha() {
        return estadoCampanha;
    }

    public void setEstadoCampanha(Integer estadoCampanha) {
        this.estadoCampanha = estadoCampanha;
    }

    public int getQtdeSolicitada() {
        return qtdeSolicitada;
    }

    public void setQtdeSolicitada(int qtdeSolicitada) {
        this.qtdeSolicitada = qtdeSolicitada;
    }

    public Integer getQtdeAtual() {
        return qtdeAtual;
    }

    public void setQtdeAtual(Integer qtdeAtual) {
        this.qtdeAtual = qtdeAtual;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getNomeCampanha() {
        return nomeCampanha;
    }

    public void setNomeCampanha(String nomeCampanha) {
        this.nomeCampanha = nomeCampanha;
    }

    public Integer getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(Integer tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public char getExclusiva() {
        return exclusiva;
    }

    public void setExclusiva(char exclusiva) {
        this.exclusiva = exclusiva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuarioHemocentro) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Campanha campanha = (Campanha) o;

        return id.equals(campanha.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
