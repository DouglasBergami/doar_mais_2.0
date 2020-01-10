package com.doar.mais.doarMais.carga;

import com.doar.mais.doarMais.domains.Campanha;
import com.doar.mais.doarMais.domains.CampanhaUsuario;
import com.doar.mais.doarMais.domains.Cidade;
import com.doar.mais.doarMais.domains.Endereco;
import com.doar.mais.doarMais.domains.Estado;
import com.doar.mais.doarMais.domains.Usuario;
import com.doar.mais.doarMais.domains.UsuarioHemocentro;
import com.doar.mais.doarMais.domains.UsuarioPessoal;
import com.doar.mais.doarMais.domains.enums.EstadoCampanha;
import com.doar.mais.doarMais.domains.enums.TipoSangue;
import com.doar.mais.doarMais.domains.enums.TipoSexo;
import com.doar.mais.doarMais.repositories.CampanhaRepository;
import com.doar.mais.doarMais.repositories.CidadeRepository;
import com.doar.mais.doarMais.repositories.EnderecoRepository;
import com.doar.mais.doarMais.repositories.EstadoRepository;
import com.doar.mais.doarMais.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
public class CargaInicial implements ApplicationRunner {

    private static final long ID_USUARIO = 1l;
    private static final long ID_USUARIOHEMOCENTRO = 2l;
    private static final long ID_ESTADO = 1l;
    private static final long ID_CIDADE = 1L;

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    CampanhaRepository campanhaRepository;
    @Autowired
    CidadeRepository cidadeRepository;
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
    EstadoRepository estadoRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("Iniciando carga de dados");

        Estado estado = new Estado(null, "São Paulo");
        Cidade cidade = new Cidade(null, "Campinas", estado);
        estado.setCidades(Arrays.asList(cidade));
        estadoRepository.save(estado);
        cidadeRepository.save(cidade);

        Endereco endereco = new Endereco(cidade, "rua são cristovão", "45", "bairro sao joao", "13486012");
        enderecoRepository.save(endereco);

        UsuarioPessoal usuarioPessoal = new UsuarioPessoal("douglas", "123456", 26, TipoSexo.MASCULINO, TipoSangue.A_NEGATIVO, 81.00, "Douglas");
        usuarioPessoal.setId(ID_USUARIO);
        usuarioRepository.save(usuarioPessoal);
        System.out.println("Usuario " + usuarioPessoal.getUsuario() + " salvo com sucesso");

        UsuarioHemocentro usuarioHemocentro = new UsuarioHemocentro("douglas", "123456", endereco, "31232132", "fabrica de software");
        usuarioHemocentro.setId(ID_USUARIOHEMOCENTRO);
        usuarioRepository.save(usuarioHemocentro);
        System.out.println("Usuario " + usuarioHemocentro.getUsuario() + " salvo com sucesso");

        Campanha campanha = new Campanha(EstadoCampanha.PENDENTE, 10, "teste de carga", "teste de carga", TipoSangue.A_NEGATIVO, new Date(), 'S', usuarioHemocentro);
        campanhaRepository.save(campanha);
        System.out.println("Campanha hemocentro " + campanha.getNomeCampanha()+ " salvo com sucesso");

        CampanhaUsuario campanhaUsuario = new CampanhaUsuario(EstadoCampanha.PENDENTE, 10, "teste de carga", "teste de carga", TipoSangue.A_NEGATIVO, new Date(), 'S', usuarioPessoal, usuarioPessoal);
        campanhaRepository.save(campanhaUsuario);
        System.out.println("Campanha Usuario " + campanhaUsuario.getNomeCampanha()+ " salvo com sucesso");

    }
}
