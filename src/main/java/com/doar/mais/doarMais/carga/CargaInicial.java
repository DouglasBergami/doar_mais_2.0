package com.doar.mais.doarMais.carga;

import com.doar.mais.doarMais.domains.Campanha;
import com.doar.mais.doarMais.domains.CampanhaUsuario;
import com.doar.mais.doarMais.domains.Usuario;
import com.doar.mais.doarMais.domains.UsuarioPessoal;
import com.doar.mais.doarMais.domains.enums.EstadoCampanha;
import com.doar.mais.doarMais.domains.enums.TipoSangue;
import com.doar.mais.doarMais.domains.enums.TipoSexo;
import com.doar.mais.doarMais.repositories.CampanhaRepository;
import com.doar.mais.doarMais.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CargaInicial implements ApplicationRunner {

    private static final long ID_USUARIO = 1l;
    private static final long ID_CAMPANHAUSUARIO = 1l;
    private static final long ID_CAMPANHAHEMOCENTRO = 2l;

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    CampanhaRepository campanhaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("Iniciando carga de dados");
        UsuarioPessoal usuarioPessoal = new UsuarioPessoal("douglas", "123456", 26, TipoSexo.MASCULINO, TipoSangue.A_NEGATIVO, 81.00);
        usuarioPessoal.setId(ID_USUARIO);
        usuarioRepository.save(usuarioPessoal);
        System.out.println("Usuario " + usuarioPessoal.getUsuario() + " salvo com sucesso");

        Campanha campanha = new Campanha(EstadoCampanha.PENDENTE, 10, "teste de carga", "teste de carga", TipoSangue.A_NEGATIVO, new Date(), 'S', usuarioPessoal);
        campanhaRepository.save(campanha);
        System.out.println("Campanha hemocentro" + campanha.getNomeCampanha()+ " salvo com sucesso");

//        CampanhaUsuario campanhaUsuario = new CampanhaUsuario(EstadoCampanha.PENDENTE, 10, "teste de carga", "teste de carga", TipoSangue.A_NEGATIVO, new Date(), 'S', usuarioPessoal, usuarioPessoal);
//        campanhaRepository.save(campanhaUsuario);
//        System.out.println("Campanha Usuario" + campanha.getNomeCampanha()+ " salvo com sucesso");

    }
}
