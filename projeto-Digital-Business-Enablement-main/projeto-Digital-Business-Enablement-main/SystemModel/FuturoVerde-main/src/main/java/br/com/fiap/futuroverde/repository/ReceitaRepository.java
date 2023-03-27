package br.com.fiap.futuroverde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.futuroverde.models.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Integer> {

    
}