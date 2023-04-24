package br.com.fiap.futuroverde.models;

import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import br.com.fiap.futuroverde.controllers.ReceitaController;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

@Builder
@AllArgsConstructor


@Entity
public class Receita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank @Size(min=5, max=100)
	private String nome;
	@NotBlank @Size(min=10,max=500)
	private String ingredientes;
	@NotBlank  @Size(min=10,max=1000)
	private String modoPreparo;
	@NotBlank @Size(min=10, max=200)
	private String imagem;
	
	@NotNull
	@ManyToOne
	private Usuario usuario;

	public EntityModel<Receita> toModel(){
		return EntityModel.of(
            this,
            linkTo(methodOn(ReceitaController.class).mostrar(id)).withSelfRel(),
            linkTo(methodOn(ReceitaController.class).index(" ", Pageable.unpaged())).withRel("all")    

        );
	}
	

}
