package br.com.fiap.futuroverde.controllers;
//atualizado

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Entity;

//import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

//import br.com.fiap.futuroverde.exception.RestNotFoundException;
import br.com.fiap.futuroverde.models.Receita;
//import br.com.fiap.futuroverde.models.RestError;
import br.com.fiap.futuroverde.repository.ReceitaRepository;
import br.com.fiap.futuroverde.repository.UsuarioRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class ReceitaController {

    Logger log = LoggerFactory.getLogger(UsuarioController.class);

    List<Receita> receitas = new ArrayList<>();

    @Autowired
    ReceitaRepository receitaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PagedResourcesAssembler<Object> assembler;

    @GetMapping("/api/receitas")
    public PagedModel<EntityModel<Object>> index(
        @RequestParam(required = false) String nome,
        @PageableDefault (size = 4) Pageable pageable){

        Page<Receita> receitas = (nome== null)? 
        receitaRepository.findAll(pageable): 
        receitaRepository.findByNomeContaining(nome, pageable);

        return assembler.toModel(receitas.map(Receita::toModel));   
    }


    @PostMapping("/api/cadastro/receita")
    public ResponseEntity<Object> cadastrar(@RequestBody @Valid Receita receita){
        log.info("cadastrando receita: " + receita);

        receitaRepository.save(receita);
        receita.setUsuario(usuarioRepository.findById(receita.getUsuario().getId()).get());
        return ResponseEntity
        .created(receita.toModel().getRequiredLink("self").toUri())
        .body(receita.toModel());
    }



    @GetMapping("/api/receita/{id}")
    public EntityModel<Receita> mostrar (@PathVariable  int id){
        log.info("Buscando receita utilizando id: " + id);

        //Criando receita para teste
        //Receita r = new Receita("Brigadeiro", "Leite condensado, chocolate em pó", "Mexer tudo em fogo baixo", "images/brigadeiro");

        var receita = getReceita(id);


    
        return receita.toModel();


    }

    @PutMapping("/api/receita/{id}")
    public EntityModel <Receita> atualizar (@PathVariable int id, @RequestBody @Valid Receita receita){
        log.info("alterando infos da receita utilizando id " + id);

        getReceita(id);

        receita.setId(id);
        
        receitaRepository.save(receita);

        return receita.toModel();
    }


    @DeleteMapping("/api/receita/{id}")
    public ResponseEntity<Receita> deletar (@PathVariable int id){
        log.info("apagando receita utilizando id " + id);

        receitaRepository.delete(getReceita(id));

        return ResponseEntity.noContent().build();

    }


    private Receita getReceita (Integer id) {
        return receitaRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "receita não encontrada"));
    }
      
}
