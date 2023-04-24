package br.com.fiap.futuroverde.models;

import org.springframework.hateoas.EntityModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import br.com.fiap.futuroverde.controllers.UsuarioController;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.*;



@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	//@Column(name = "id_usuario")
	private Integer id;
	@NotBlank @Size(min=5, max=100)
	private String nome;
	@NotBlank @Email
	private String email;
	@NotBlank @Size(min=6, max=20)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String senha;
	
	public EntityModel<Usuario> toModel(){
		return EntityModel.of(
            this,
            linkTo(methodOn(UsuarioController.class).mostrar(id)).withSelfRel());
	}

	

	



	
			
}
