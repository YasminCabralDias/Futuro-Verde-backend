package br.com.fiap.futuroverde.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import br.com.fiap.futuroverde.models.Usuario;
import br.com.fiap.futuroverde.repository.UsuarioRepository;
import jakarta.validation.Valid;




@RestController
public class UsuarioController {
    
    Logger log = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    UsuarioRepository usuarioRepository;


    

    @PostMapping("/api/cadastro/usuario")
    public ResponseEntity<Object> cadastrar(@RequestBody @Valid Usuario usuario){
        log.info("cadastrando usuário: " + usuario);

        usuarioRepository.save(usuario);
        return ResponseEntity
        .created(usuario.toModel().getRequiredLink("self").toUri())
        .body(usuario.toModel());
    }


    @GetMapping("/api/usuario/{id}")
    public EntityModel<Usuario> mostrar (@PathVariable int id){
        log.info("Buscando usuário utilizando id: " + id);

        var usuario = getUsuario(id);
        return usuario.toModel();
    }

    @PutMapping("/api/usuario/{id}")
    public EntityModel <Usuario> atualizar (@PathVariable int id, @RequestBody @Valid Usuario usuario){
        log.info("alterando infos do usuário utilizando id " + id);

        getUsuario(id);
        
        usuario.setId(id);
        usuarioRepository.save(usuario);

        return usuario.toModel();
        
    }


    @DeleteMapping("/api/usuario/{id}")
    public ResponseEntity<Usuario> deletar (@PathVariable int id){
        log.info("apagando usuário utilizando id " + id);


        usuarioRepository.delete(getUsuario(id));

        return ResponseEntity.noContent().build();
    }


    private Usuario getUsuario(Integer id) {
        return usuarioRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "usuário não encontrado"));
    }




}