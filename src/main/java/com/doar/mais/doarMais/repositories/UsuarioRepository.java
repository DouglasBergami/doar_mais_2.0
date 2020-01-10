package com.doar.mais.doarMais.repositories;

import com.doar.mais.doarMais.domains.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
