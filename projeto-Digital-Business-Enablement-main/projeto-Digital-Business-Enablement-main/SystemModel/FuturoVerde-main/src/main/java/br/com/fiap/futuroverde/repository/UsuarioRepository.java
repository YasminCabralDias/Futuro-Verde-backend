package br.com.fiap.futuroverde.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.fiap.futuroverde.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    Optional<Usuario> findByEmail(String username);
    
}
