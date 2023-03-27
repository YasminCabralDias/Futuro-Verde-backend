package br.com.fiap.futuroverde.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
import br.com.fiap.futuroverde.repository.UsuarioRepository;



@RestController
public class UsuarioController {
    
    Logger log = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    UsuarioRepository repository;


    @PostMapping("/api/cadastro/usuario")
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){
        log.info("cadastrando usuário: " + usuario);

        repository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }


    @GetMapping("/api/usuario/{id}")
    public ResponseEntity<Usuario> mostrar (@PathVariable int id){
        log.info("Buscando usuário utilizando id: " + id);

        var usuarioEncontrado = repository.findById(id);
   
        
        return ResponseEntity.ok(usuarioEncontrado.get());
    }

    @PutMapping("/api/usuario/{id}")
    public ResponseEntity<Usuario> atualizar (@PathVariable int id, @RequestBody Usuario usuario){
        log.info("alterando infos do usuário utilizando id " + id);

        var usuarioaEncontrado = repository.findById(id);
        var usuarioAtualizado = usuarioaEncontrado.get();

        BeanUtils.copyProperties(usuario, usuarioAtualizado, "id");

        repository.save(usuarioAtualizado);

        return ResponseEntity.ok(usuarioAtualizado);
        
    }


    @DeleteMapping("/api/usuario/{id}")
    public ResponseEntity<Usuario> deletar (@PathVariable int id){
        log.info("apagando usuário utilizando id " + id);

        var usuarioaEncontrado = repository.findById(id);

        repository.delete(usuarioaEncontrado.get());

        return ResponseEntity.noContent().build();
    }





}