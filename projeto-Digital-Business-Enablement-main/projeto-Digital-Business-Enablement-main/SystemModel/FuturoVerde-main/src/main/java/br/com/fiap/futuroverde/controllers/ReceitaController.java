package br.com.fiap.futuroverde.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.futuroverde.models.Receita;


@RestController
public class ReceitaController {

    Logger log = LoggerFactory.getLogger(UsuarioController.class);


    @PostMapping("/api/cadastro/receita")
    public ResponseEntity<Receita> cadastrar(@RequestBody Receita receita){
        log.info("cadastrando receita: " + receita);
        return ResponseEntity.status(HttpStatus.CREATED).body(receita);
    }



    @GetMapping("/api/receita/{id}")
    public ResponseEntity<Receita> mostrar (@PathVariable int id){
        log.info("Buscando receita utilizando id: " + id);

        //Criando receita para teste
        Receita r = new Receita("Brigadeiro", "Leite condensado, chocolate em pó", "Mexer tudo em fogo baixo", "images/brigadeiro", 1);
        return ResponseEntity.ok(r);
    }

    @PutMapping("/api/receita/{id}")
    public ResponseEntity<Receita> atualizar (@PathVariable int id, @RequestBody Receita receita){
        log.info("alterando infos da receita utilizando id " + id);

        return ResponseEntity.ok(receita);
    }


    @DeleteMapping("/api/receita/{id}")
    public ResponseEntity<Receita> destroy(@PathVariable int id){
        log.info("apagando receita utilizando id " + id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }   
}
