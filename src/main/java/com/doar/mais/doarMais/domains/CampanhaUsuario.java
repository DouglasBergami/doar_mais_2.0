package com.doar.mais.doarMais.domains;

import com.doar.mais.doarMais.domains.enums.EstadoCampanha;
import com.doar.mais.doarMais.domains.enums.TipoSangue;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@JsonTypeName("campanhaUsuario")
public class CampanhaUsuario extends Campanha {

    private static final long serialVersionUID = 1L;

    private Long idUsuario;
    private String nomeUsuario;

    public CampanhaUsuario() {

    }

    public CampanhaUsuario(EstadoCampanha estadoCampanha, int qtdeSolicitada, String finalidade, String nomeCampanha, TipoSangue tipoSangue, Date dataAbertura, char exclusiva, Usuario usuario, UsuarioPessoal usuarioPessoal) {
        super(estadoCampanha, qtdeSolicitada, finalidade, nomeCampanha, tipoSangue, dataAbertura, exclusiva, usuario);
        this.idUsuario = usuarioPessoal.getId();
        this.nomeUsuario = usuarioPessoal.getNomeUsuario();
    }

}
