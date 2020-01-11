package com.doar.mais.doarMais.services;

import com.doar.mais.doarMais.domains.Cidade;
import com.doar.mais.doarMais.repositories.CidadeRepository;
import com.doar.mais.doarMais.services.Exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public Cidade findById(Long id) {

        Optional<Cidade> obj = cidadeRepository.findById(id);

        return obj.orElseThrow(
                () -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class));
    }

}
