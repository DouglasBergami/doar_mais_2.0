package com.doar.mais.doarMais.domains;

import com.doar.mais.doarMais.domains.Campanha;
import com.doar.mais.doarMais.domains.enums.EstadoCampanha;
import com.doar.mais.doarMais.domains.enums.TipoSangue;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class CampanhaUsuario extends Campanha{

    private static final long serialVersionUID = 1L;

    private UsuarioPessoal usuarioPessoal;

    public CampanhaUsuario(){

    }

    public CampanhaUsuario(EstadoCampanha estadoCampanha, int qtdeSolicitada, String finalidade, String nomeCampanha, TipoSangue tipoSangue, Date dataAbertura, char exclusiva, Usuario usuario, UsuarioPessoal usuarioPessoal) {
        super(estadoCampanha, qtdeSolicitada, finalidade, nomeCampanha, tipoSangue, dataAbertura, exclusiva, usuario);
        this.usuarioPessoal = usuarioPessoal;
    }

    public UsuarioPessoal getUsuarioPessoal() {
        return usuarioPessoal;
    }

    public void setUsuarioPessoal(UsuarioPessoal usuario) {
        this.usuarioPessoal = usuario;
    }
}
