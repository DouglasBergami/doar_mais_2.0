package com.doar.mais.doarMais.repositories;

import com.doar.mais.doarMais.domains.Campanha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampanhaRepository extends JpaRepository<Campanha, Long> {
}
