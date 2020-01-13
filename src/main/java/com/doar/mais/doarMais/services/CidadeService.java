package com.doar.mais.doarMais.services;

import com.doar.mais.doarMais.domains.Cidade;
import com.doar.mais.doarMais.repositories.CidadeRepository;
import com.doar.mais.doarMais.services.Exception.DataIntegrityException;
import com.doar.mais.doarMais.services.Exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public Cidade findById(Long id) throws IllegalArgumentException{

            if (id == null){
                throw new IllegalArgumentException("Objeto contém id nulo ");
            }

            Optional<Cidade> obj = cidadeRepository.findById(id);

            return obj.orElseThrow(
                    () -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class));

    }

    public List<Cidade> findAll() {
        return cidadeRepository.findAll();
    }

    @Transactional
    public Cidade insert(Cidade obj) {
        obj.setId(null);
        return cidadeRepository.save(obj);
    }

    public void delete(Long id) {
        findById(id);

        try {
            cidadeRepository.deleteById(id);
        } catch (DataIntegrityException e) {
            throw new DataIntegrityException("Não é possível excluir porque há entidades relacionadas");
        }

    }

    public Cidade update(Cidade obj) {
        findById(obj.getId());

        return cidadeRepository.save(obj);
    }

}
