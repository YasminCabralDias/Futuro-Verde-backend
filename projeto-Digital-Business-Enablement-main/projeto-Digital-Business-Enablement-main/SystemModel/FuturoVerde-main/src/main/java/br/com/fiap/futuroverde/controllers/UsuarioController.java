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

import br.com.fiap.futuroverde.models.Usuario;



@RestController
public class UsuarioController {
    
    Logger log = LoggerFactory.getLogger(UsuarioController.class);


    @PostMapping("/api/cadastro/usuario")
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){
        log.info("cadastrando usuário: " + usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }


    @GetMapping("/api/usuario/{id}")
    public ResponseEntity<Usuario> mostrar (@PathVariable int id){
        log.info("Buscando usuário utilizando id: " + id);

        //Criando um usuário para teste
        Usuario u = new Usuario("Yasmin", "yas@gmail.com", "1111", 1);
        return ResponseEntity.ok(u);
    }

    @PutMapping("/api/usuario/{id}")
    public ResponseEntity<Usuario> atualizar (@PathVariable int id, @RequestBody Usuario usuario){
        log.info("alterando infos do usuário utilizando id " + id);
        return ResponseEntity.ok(usuario);
    }


    @DeleteMapping("/api/usuario/{id}")
    public ResponseEntity<Usuario> deletar (@PathVariable int id){
        log.info("apagando usuário utilizando id " + id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }





}