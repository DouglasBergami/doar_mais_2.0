package com.doar.mais.doarMais.repositories;

import com.doar.mais.doarMais.domains.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
