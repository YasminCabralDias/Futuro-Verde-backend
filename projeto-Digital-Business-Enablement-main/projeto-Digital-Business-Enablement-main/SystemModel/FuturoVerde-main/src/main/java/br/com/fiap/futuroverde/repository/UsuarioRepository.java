package br.com.fiap.futuroverde.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.futuroverde.models.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
    
}
