package com.doar.mais.doarMais.repositories;

import com.doar.mais.doarMais.domains.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
