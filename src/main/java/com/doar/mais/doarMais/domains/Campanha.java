package com.doar.mais.doarMais.domains;

import com.doar.mais.doarMais.domains.enums.EstadoCampanha;
import com.doar.mais.doarMais.domains.enums.TipoSangue;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public abstract class Campanha {

    private Long id;
    private EstadoCampanha estadoCampanha;
    private int qtdeSolicitada;
    private Integer qtdeAtual;
    private String finalidade;
    private String nomeCampanha;
    private TipoSangue tipoSangue;
    private Date dataAbertura;
    private Date dataConclusao;

    public Campanha() {

    }

    public Campanha(EstadoCampanha estadoCampanha, int qtdeSolicitada, String finalidade, String nomeCampanha, TipoSangue tipoSangue, Date dataAbertura) {
        this.estadoCampanha = estadoCampanha;
        this.qtdeSolicitada = qtdeSolicitada;
        this.finalidade = finalidade;
        this.nomeCampanha = nomeCampanha;
        this.tipoSangue = tipoSangue;
        this.dataAbertura = dataAbertura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoCampanha getEstadoCampanha() {
        return estadoCampanha;
    }

    public void setEstadoCampanha(EstadoCampanha estadoCampanha) {
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

    public TipoSangue getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(TipoSangue tipoSangue) {
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
