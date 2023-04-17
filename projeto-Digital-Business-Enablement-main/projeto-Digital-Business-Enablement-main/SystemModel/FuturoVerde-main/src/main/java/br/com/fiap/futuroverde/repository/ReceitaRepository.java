package br.com.fiap.futuroverde.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;

import br.com.fiap.futuroverde.models.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Integer> {

    Page<Receita> findByNomeContaining(String nome, Pageable pageable);

   
}